
package tugas;
//Connect DB
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
    private String url,usr,pwd,db;
    connect() {
        db  ="tugas";
        url ="jdbc:mysql://localhost/" +db;
        usr = "root";
        pwd = "";
    }
    Connection getConnect() {
        Connection cn = null;
        try {
            //load Driver Database
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url,usr,pwd);
            System.out.println("Koneksi berhasil");
        }
        catch (ClassNotFoundException er) {
        }
            catch (SQLException er) {
                    System.out.println("Error #2: " +er.getMessage());
                    System.exit(0);
                    }
        return cn;
            }
    public static void main (String[] args)
    {
        new connect().getConnect();}
        }
