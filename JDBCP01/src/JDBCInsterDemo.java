import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsterDemo {

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
            //String query ="select * from student";
            String query="INSERT INTO student (id,stdName,age) values (4,'Ankit',21)";

            //ResultSet rs = statement.executeQuery(query);
            int update = statement.executeUpdate(query);
            System.out.println("Inserted "+update+ " rows");



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
