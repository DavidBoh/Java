/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author herrboh
 */
public class login_connection {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "usuarios";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    
    public static Connection getConnection()
    {
        Connection cnx = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);    
        
        try {
            cnx = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + login_connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnx;
    }
    
}
