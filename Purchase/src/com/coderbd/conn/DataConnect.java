/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DataConnect {

    static Connection conn = null;

    public static void main(String[] args) {
        DataConnect.getDataConnection();
    }

    public static Connection getDataConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sali", "root", "1234");
            System.out.println("Database Connected");
        } catch (SQLException ex) {
            Logger.getLogger(DataConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
