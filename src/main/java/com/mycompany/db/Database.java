/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author torre
 */


public class Database {
    
    public Connection conection;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3307/soccergui"+"?useSSL=false&serverTimezone=UTC";
    
    private final String USER = "root";
    private final String PASS = "123456789";
    
    public void conect() throws ClassNotFoundException {
        try {
            conection = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            System.out.println("Conexion bd establecida");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void close() throws SQLException{
        if (conection != null) {
            if (!conection.isClosed()) {
                conection.close();
                System.out.println("Conexion bd cerrada");
            }
        }
    }
}
