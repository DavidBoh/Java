/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author herrboh
 */
public class ModeloLogin {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "usuarios_db";
    private static Integer portnumber = 3306;
    private static String password = "salve3587.";
    
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
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + ModeloLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnx;
    }
    
}
