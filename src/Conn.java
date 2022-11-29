import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    public static void main(String[] args) {
        Connection c=null;
        Statement stmt=null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "system","12345");
            System.out.println("database succesfully conected");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() +
                    e.getMessage());
            System.exit(0);
        }
    }
}
