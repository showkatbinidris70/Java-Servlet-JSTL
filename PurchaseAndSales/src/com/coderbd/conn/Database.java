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
public class Database {

    static Connection conn = null;

    public static void main(String[] args) {
        Database.getDataConnection();
    }

    /*
    static Connection conn = null;

    public static void main(String[] args) {
        DBConnection.getDBConnection();
    }
     */
 /*
    public static Connection getDBConnection() {

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sali", "root", "1234");
            System.out.println("DataBase Connected");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;

    }
     */

    public static Connection getDataConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sali", "root", "1234");
            System.out.println("Dtabase Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
