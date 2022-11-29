
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test
{
    public static  void main(String[] args)
    {
        Connection c=null;
        Statement stmt=null;

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
// getting connection
            c = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system", "12345");
            System.out.println("database succesfully connected");
            stmt=c.createStatement();
            String sql="CREATE TABLE COMPANY" +
                    "(ID INT PRIMARY KEY NOT NULL," +
                    "NAME VARCHAR(10) NOT NULL," +
                    "AGE INT NOT NULL," +
                    "ADDRESS VARCHAR(50)," +
                    "SALARY INT)";
           sql="insert into company (id,name,age,address,salary)" + " values(6,'riz',4,'vjy',2000)";
            sql="insert into company (id,name,age,address,salary)" + " values(7,'Srikanth',12,'bangalore',4000)";
            sql="insert into company (id,name,age,address,salary)" + " values(8,'ramya',5,'canada',40000)";
            sql="insert into company (id,name,age,address,salary)" + " values(65,'rhfhrgh',4,'dhh',7676)";
            String insertQuery ="show tables";
            stmt.executeUpdate(sql);
            ResultSet r = stmt.executeQuery("select * from tables");
            System.out.println("ID"+r.getInt("ID"));
            System.out.println("NAME"+r.getString("NAME"));
            System.out.println("AGE"+r.getInt("AGE"));
            System.out.println("ADDRESS"+r.getString("ADDRESS"));
            System.out.println("SALARY"+ ((ResultSet) r).getInt("SALARY"));
            System.out.println("/n");
            stmt.executeUpdate(sql);
                    stmt.close();
                    c.close();  
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName()+":"+e.getMessage());
            System.exit(0);
        }
        System.out.println("Table is created successfully");
    }
}





