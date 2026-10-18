import java.sql.*;

public class MarvellousJDBC
{
    public static void main(String A[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/ppa55", "root", "");
            Statement stmt = con.createStatement();
            ResultSet  rs= stmt.executeQuery("SELECT * FROM students");

            while (rs.next())
            {
                System.out.println("RollNo:"+rs.getInt("rollno"));
                System.out.println("Name:"+rs.getString("Name"));
                System.out.println("City:"+rs.getString("City"));
                System.out.println("Marks:"+rs.getString("marks"));
                System.out.println("---------------------------");

            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured:"+e);

        }
    }
}