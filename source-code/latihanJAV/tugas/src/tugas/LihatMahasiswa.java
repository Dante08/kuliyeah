
package tugas;
import java.sql.*;


public class LihatMahasiswa {
    //LauchApplication
    public static void main (String args[]) {
        Connection connection = null; //manages connection
        Statement statement = null; //query statement
        ResultSet resultSet = null; //manages result
        //jdbc database driver
        String DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost/akademik";
        String usr = "root";
        String pwd = "";
        
        //connect to database books and query database
        try {
            Class.forName(DRIVER);
            //establish connection
            connection = DriverManager.getConnection(DB_URL,usr, pwd);
            //create statement for query database
            statement = connection.createStatement();
            //query database
            String q = "SELECT * FROM mahasiswa";
            resultSet = statement.executeQuery(q);
            //proses query result
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numColom = metaData.getColumnCount();
            System.out.println("Database Mahasiswa : ");
            for (int i=1; i<=numColom;i++)
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            System.out.println();
            while(resultSet.next()) {
                for (int i=1; i<=numColom; i++)
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                System.out.println();
            } //end while
            
        } catch (SQLException er ) {
            er.printStackTrace();
        }
        catch (ClassNotFoundException er) {
            er.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
