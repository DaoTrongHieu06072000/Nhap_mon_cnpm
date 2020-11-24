/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.User;
import services.JDBCConnection;

/**
 *
 * @author sonso
 */
public class LoginController {
    public static User currentUser = new User();
    
    public boolean login(String userName, String passwod) throws SQLException, ClassNotFoundException{
        Connection connection = JDBCConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users WHERE userName = '" + userName +"'");
        if (rs == null) {
            return false;
        }
        while (rs.next()) {                
            if (rs.getString("passwd") == null ? passwod == null : rs.getString("passwd").equals(passwod)) {
                LoginController.currentUser.setID(rs.getInt("ID"));
                LoginController.currentUser.setUserName(rs.getString("userName"));
                return true;
            }
        }
        connection.close();
        return false;
    }
}
