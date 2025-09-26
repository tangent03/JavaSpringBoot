import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

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

            Statement statement=con.createStatement();
            String query ="select * from student where id = 2";

            ResultSet rs = statement.executeQuery(query);
            System.out.println("--------------Read data----------------");
            while(rs.next())
            {
                System.out.println(
                        rs.getInt("id")+ " | "+
                                rs.getString("stdName")+" | "+
                                rs.getInt("age")
                );
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
