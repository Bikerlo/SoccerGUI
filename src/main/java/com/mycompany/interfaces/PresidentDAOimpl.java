/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.db.Database;
import com.mycompany.models.President;
import static com.mycompany.util.DateConverter.dateToStr;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author torre
 */
public class PresidentDAOimpl extends Database implements PresidentDAO{

    @Override
    public void create(President entity) {
        try {
            this.conect();
             try (PreparedStatement st = this.conection.prepareStatement("INSERT INTO presidente(DNI, Nombre, Fecha_nacimiento, Fecha_ingreso) VALUES(?,?,?,?);")) {
                 st.setString(1, entity.getDNI());
                 st.setString(2, entity.getName());
                 st.setString(3, dateToStr(entity.getBirthDay()));
                 st.setString(4, dateToStr(entity.getElectionYear()));
                 st.executeUpdate();
             }
        } catch(ClassNotFoundException | SQLException e) {
             try {
                 throw e;
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(PresidentDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        } finally {
             try {
                 this.close();
             } catch (SQLException ex) {
                 Logger.getLogger(PresidentDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }

    @Override
    public President read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(President entity) {
        try {
            this.conect();
             try (PreparedStatement st = this.conection.prepareStatement("UPDATE presidente SET DNI = ?, Nombre = ?, Fecha_nacimiento = ?, Fecha_ingreso = ? WHERE id = ?;")) {
                 st.setString(1, entity.getDNI());
                 st.setString(2, entity.getName());
                 st.setString(3, dateToStr(entity.getBirthDay()));
                 st.setString(4, dateToStr(entity.getElectionYear()));
                 st.setInt(5, entity.getID());
                 st.executeUpdate();
                 System.out.println(entity.getBirthDay());
             }
        } catch(ClassNotFoundException | SQLException e) {
             try {
                 throw e;
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(PresidentDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        } finally {
             try {
                 this.close();
             } catch (SQLException ex) {
                 Logger.getLogger(PresidentDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }

    @Override
    public void delete(President entity) {
        try {
            this.conect();
            try (PreparedStatement st = this.conection.prepareStatement("DELETE FROM presidente WHERE id = ?;")) {
                st.setInt(1, entity.getID());
                st.executeUpdate();
            }
        } catch(ClassNotFoundException | SQLException e) {
            try {
                throw e;
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(PresidentDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                this.close();
            } catch (SQLException ex) {
                Logger.getLogger(PresidentDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List listAll(String name) throws SQLException, Exception {
        List<President> lista = null;
        try {
            this.conect();
            String Query = name.isEmpty() ? "SELECT * FROM presidente;" : "SELECT * FROM presidente WHERE nombre LIKE '%" + name + "%';";
            try (PreparedStatement st = this.conection.prepareStatement(Query)) {
                lista = new ArrayList();
                try (ResultSet rs = st.executeQuery()) {
                    while(rs.next()) {
                        
                        President presidente = new President();
                        presidente.setID(rs.getInt("id"));
                        presidente.setDNI(rs.getString("DNI"));
                        presidente.setName(rs.getString("Nombre"));
                        presidente.setBirthDay(rs.getString("Fecha_nacimiento"));
                        presidente.setElectionYear(rs.getString("Fecha_ingreso"));
                        
                        lista.add(presidente);
                    }
                }
            }
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.close();
        }
        return lista;
    }
    @Override
    public President getPresidentById(int presidentId) throws Exception {
        President presidente = null;
        
        try {
            this.conect();
            try (PreparedStatement st = this.conection.prepareStatement("SELECT * FROM presidente WHERE id = ? LIMIT 1;")) {
                
                st.setInt(1, presidentId);
                
                try (ResultSet rs = st.executeQuery()) {
                    while(rs.next()) {
                        presidente = new President();
                        presidente.setID(rs.getInt("id"));
                        presidente.setDNI(rs.getString("DNI"));
                        presidente.setName(rs.getString("Nombre"));
                        presidente.setBirthDay(rs.getString("Fecha_nacimiento"));
                        presidente.setElectionYear(rs.getString("Fecha_ingreso"));
                    }
                }
            }
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.close();
        }
        return presidente;
    }
    
    @Override
    public List<String> getPresidentListName() throws ClassNotFoundException, SQLException{
    
       List<String> lista = null;
        try {
            this.conect();
            String Query = "SELECT Nombre FROM presidente;";
            try (PreparedStatement st = this.conection.prepareStatement(Query)) {
                lista = new ArrayList();
                try (ResultSet rs = st.executeQuery()) {
                    while(rs.next()) {
                        lista.add(rs.getString(1));
                    }
                }
            }
        } catch(ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.close();
        }
        
        return lista;
    
    }
    
}
