/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.util;

import com.mysql.jdbc.MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karray
 */
public class MySecondConnection {
    
    String url="jdbc:mysql://localhost:3306/infob";
    String login="root";
    String pwd="";
    static Connection cnx =null;

    private MySecondConnection() {
        try {
            cnx = DriverManager.getConnection(url, login, pwd);
            System.out.println("Connexion établie");
        } catch (SQLException ex) {
            System.out.println("Connexion non établie");
        }
    }
    
    public static Connection getInstance(){
        if(cnx==null){
            new MySecondConnection();
        }
        return cnx;
    }
}
