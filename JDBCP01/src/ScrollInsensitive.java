import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {

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
                    createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_READ_ONLY);
            String query ="select * from student";

            ResultSet rs = statement.executeQuery(query);

            System.out.println("-------Scroll insensitive, read only------");

            rs.last();
            System.out.println("Last Row: "+rs.getInt("id"));
            System.out.println("Last Row: "+rs.getString("stdName"));


            rs.first();
            System.out.println("Last Row: "+rs.getInt("id"));
            System.out.println("Last Row: "+rs.getString("stdName"));


            rs.absolute(2);
            System.out.println("Last Row: "+rs.getInt("id"));
            System.out.println("Last Row: "+rs.getString("stdName"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
