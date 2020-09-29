
package JDBCconection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sonso
 */
public class JDBCconnection {
    public static Connection getConnection() throws SQLException {
        final  String url = "jdbc:mysql://localhost:3306/cnpm10";
        final String user = "root";
        final String pass = "";      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Connection connection = DriverManager.getConnection(url, user, pass);
            
            return DriverManager.getConnection(url,user,pass);

        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        return null;
        
        
        
     }
     public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        if (c != null) {
            System.out.println("Thanh cong");
        }else{
            System.out.println("ThatBai");
        }
        
     }
}
