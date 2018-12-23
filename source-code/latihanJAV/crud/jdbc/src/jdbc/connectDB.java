/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

// ConnectDB.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
private String url, usr, pwd, db;
connectDB() {
db = "akademik";
url = "jdbc:mysql://localhost/" + db;
usr = "root";
pwd = "";
}

Connection getConnect() {
Connection cn = null;
    try {
    // Load driver database
    Class.forName("com.mysql.jdbc.Driver");
    cn = DriverManager.getConnection(url, usr,pwd); System.out.println("Koneksi Berhasil");
    } 

    catch (ClassNotFoundException er ) {
    } 
    catch (SQLException er) {
    System.out.println("Error #2: " +
    er.getMessage()); System.exit(0);
    }
    return cn;
    }

public static void main(String [] args)
{ new connectDB().getConnect();}
}