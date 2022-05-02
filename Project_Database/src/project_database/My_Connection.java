
package project_database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
   
public class My_Connection {
    Connection conn;
 
    public Connection getConn(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/c_users","root","");
             JOptionPane.showMessageDialog(null, "Database Connection Successful MySQLConnect getconns method");
             return conn;
        } 
           
       
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error in MySQLConnect getconns method"+e);
         
        }
           return conn;
    }
//    private static String servername = "localhost";
//    private static String username = "root";
//    private static String dbname = "c_users";
//    private static Integer portnumber = 3306;
//    private static String password = "";
//    
//     public static Connection getConnection()
//     {
//       Connection con = null;
//       MysqlDataSource datasource = new MysqlDataSource();
//       
//       datasource.setServerName(servername);
//       datasource.setUser(servername);
//       datasource.setPassword(servername);
//       datasource.setDatabaseName(servername);
//       datasource.setPortNumber(portnumber);
//       
//       try{
//           con = (Connection) datasource.getConnection();
//           
//       }catch (SQLException ex) {
//           
//           Logger.getLogger("Get Connection ->" + My_Connection.class.getName()).log(Level.SEVERE, null, ex);
//           
//       }
//       return con;
//     }
}


