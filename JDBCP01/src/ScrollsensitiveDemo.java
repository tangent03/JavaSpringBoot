import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ScrollsensitiveDemo {

    /*1. load the driver class
      2. Get connection from db
      3. create statement
      4. execute query
    * */
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load driver class

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd", "root", "root");

            Statement statement=con.
                    createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                            ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = statement.executeQuery("select * from student");
            Map<Integer,Integer> original = new HashMap<>();
            while (rs.next())
            {
                original.put(rs.getInt("id"),rs.getInt("age"));
            }

            System.out.println(".............original data.........");
            System.out.println(original);
            Thread.sleep(20000);

            // Reset cursor
            rs.beforeFirst();

            System.out.println("-----reflect updated data.........");
            while(rs.next())
            {
                System.out.println(
                        rs.getInt("id")+ " | "+
                                rs.getString("stdName")+" | "+
                                rs.getInt("age")
                );
            }

            con.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
