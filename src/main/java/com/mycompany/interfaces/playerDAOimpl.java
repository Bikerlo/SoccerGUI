/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.db.Database;
import com.mycompany.models.Player;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author torre
 */
public class playerDAOimpl extends Database implements playerDAO {

    @Override
    public void create(Player entity) {
        try {
            this.conect();
            try (PreparedStatement st = this.conection.prepareStatement("INSERT INTO player(nombre, fecha_nacimiento, posicion) VALUES(?,?,?);")) {
                st.setString(1, entity.getName());
                st.setString(2, entity.getBornDate());
                st.setString(3, entity.getPosition());
                st.executeUpdate();
            }
        } catch(ClassNotFoundException | SQLException e) {
            try {
                throw e;
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(playerDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                this.close();
            } catch (SQLException ex) {
                Logger.getLogger(playerDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Player read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Player entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Player entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Player> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
