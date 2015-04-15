/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iloveshopping.models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author windluffy
 */
public class Database {
    Connection conn = null;

    public Database() {
        try {
            openConnection();
            //getInfoDB();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void openConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connString = "";
//            Properties prop = this.getInfoDB();
//            connString = "jdbc:" + prop.getProperty("dbdriver") + "://" + prop.getProperty("hostname")
//                    + ":" + prop.getProperty("port") + "/" + prop.getProperty("dbname");
            connString = "jdbc:mysql://localhost:3306/iloveshopping";
            conn = DriverManager.getConnection(connString,"root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    private Properties getInfoDB() {
        InputStream is = null;
        try {
            Properties prop = new Properties();
            String classPath = System.getProperty("java.class.path");
            String configPath = classPath.substring(0, classPath.indexOf("\\classes"));
            is = new FileInputStream(configPath + "\\" + "database.properties");

            prop.load(is);
            return prop;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public Connection getConnection() {
        return conn;
    }

    public void Close() {
        try {
            if(conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public static void main(String[] args) {
//        String classPath = System.getProperty("java.class.path");
//        Database db = new Database();
//        System.out.println(classPath);
//    }
}
