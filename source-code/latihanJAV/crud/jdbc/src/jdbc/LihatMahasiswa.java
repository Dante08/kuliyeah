/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author adm
 * 
 */// LihatMahasiswa.java 
import java.sql.*; 
import java.sql.Connection; 
import java.sql.Statement; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class LihatMahasiswa {
// launch the application
public static void main( String args[] ) {
Connection connection = null; // manages connection
Statement statement = null; // query statement
ResultSet resultSet = null; // manages results
// JDBC driver name and database URL
String DRIVER = "com.mysql.jdbc.Driver";
String DB_URL = "jdbc:mysql://localhost/akademik";
String usr = "root";
String pwd = "";

// connect to database books and query database

try {
// load driver class
Class.forName(DRIVER);
// establish connectionto database
connection = DriverManager.getConnection(DB_URL,usr, pwd);
// create statement for querying database
statement = connection.createStatement();

// query database
String q = "SELECT * FROM Mahasiswa";
resultSet = statement.executeQuery(q);
// process query results
ResultSetMetaData metaData = resultSet.getMetaData();
int numColom = metaData.getColumnCount();
System.out.println("Database Mahasiswa: ");
for(int i=1; i<= numColom; i++)
System.out.printf("%-8s\t", metaData.getColumnName(i));
System.out.println();
while(resultSet.next()) {
for(int i=1; i<=numColom; i++)
System.out.printf("%-8s\t", resultSet.getObject(i));
System.out.println();
} // end while
} catch (SQLException er) {
er.printStackTrace();
} catch (ClassNotFoundException er)
{ er.printStackTrace();
} finally {
try {
resultSet.close();
statement.close();
connection.close();
} catch (Exception ex) {
ex.printStackTrace();
}
}
} // end main
}