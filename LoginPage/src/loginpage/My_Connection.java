
package loginpage;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class My_Connection {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "users";
    private static Integer portnumber = 3306;
    private static String password = "";
    
     public static Connection getConnection()
     {
       Connection con = null;
       MysqlDataSource datasource = new MysqlDataSource();
       
       datasource.setServerName(servername);
       datasource.setUser(username);
       datasource.setPassword("");
       datasource.setDatabaseName(dbname);
       datasource.setPortNumber(portnumber);
       
       try{
           con = (Connection) datasource.getConnection();
           
       }catch (SQLException ex) {
           
           Logger.getLogger("Get Connection ->" + My_Connection.class.getName()).log(Level.SEVERE, null, ex);
           
       }
       return con;
     }
}
