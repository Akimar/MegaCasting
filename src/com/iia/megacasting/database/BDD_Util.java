/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iia.megacasting.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author akimar
 */
public class BDD_Util {
    
    public static Connection open() throws Exception
    {
       
        Connection  cnx = null;
        String server = "127.0.0.1";
        String user = "root";
        String password = "formation";
        String databaseName = "megacastings";
        String url;
        
        url = "jdbc:mysql://"+server+"/"+databaseName;
   
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          
          cnx = DriverManager.getConnection(url, user, password);
          
        }
        
        catch(SQLException ex)
        {
             ex.printStackTrace();
        }
        
        return cnx;
    }
    
    
    public static void close(Connection cnx)
    {
        if(cnx != null)
        {
            try
           {
                cnx.close();
            }
                
            catch(SQLException ex)
            {
                            
            }
        }
    }
    
    
}
