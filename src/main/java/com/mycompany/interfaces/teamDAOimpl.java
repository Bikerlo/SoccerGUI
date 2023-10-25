/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.db.Database;
import com.mycompany.models.President;
import com.mycompany.models.team;
import static com.mycompany.util.DateConverter.dateToStr;
import static com.mycompany.util.DateConverter.strToDate;
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
public class teamDAOimpl extends Database implements teamDAO {

    @Override
    public void create(team entity) {
        try {
            this.conect();
             try (PreparedStatement st = this.conection.prepareStatement("INSERT INTO equipo(nombre,estadio,aforo,`fecha fundacion`,ciudad,presidente_id)"
                                                                        +" VALUES (?, ?, ?, ?, ?, ?);")) {
                 st.setString(1, entity.getName());
                 st.setString(2, entity.getStadium());
                 st.setString(3, Integer.toString(entity.getCapacity()));
                 st.setString(4, dateToStr(entity.getFoundationYear()));
                 st.setString(5, entity.getCity());
                 st.setString(6, String.valueOf(entity.getPresidentId()));
                 st.executeUpdate();
             }
        } catch(ClassNotFoundException | SQLException e) {
             try {
                 throw e;
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(teamDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        } finally {
             try {
                 this.close();
             } catch (SQLException ex) {
                 Logger.getLogger(teamDAOimpl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }

    @Override
    public team read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(team entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(team entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listAll(String name) throws SQLException, Exception {
         List<team> lista = null;
        try {
            this.conect();
            String Query = name.isEmpty() ? "SELECT equipo.*, presidente.nombre FROM equipo JOIN presidente ON equipo.presidente_id=presidente.id;" :
                                            "SELECT equipo.*, presidente.nombre FROM equipo JOIN presidente ON equipo.presidente_id=presidente.id WHERE nombre LIKE '%" + name + "%';";
            try (PreparedStatement st = this.conection.prepareStatement(Query)) {
                lista = new ArrayList();
                try (ResultSet rs = st.executeQuery()) {
                    while(rs.next()) {
                        
                        team teamConsult = new team();
                        teamConsult.setId(rs.getInt("id"));
                        teamConsult.setName(rs.getString("nombre"));
                        teamConsult.setStadium(rs.getString("estadio"));
                        teamConsult.setCapacity(rs.getInt("aforo"));
                        teamConsult.setFoundationYear(strToDate(rs.getString("fecha fundacion")));
                        teamConsult.setCity(rs.getString("ciudad"));
                        teamConsult.setPresidentId(rs.getInt("presidente_id"));
                        teamConsult.setPresidentName(rs.getString("presidente.nombre"));
                        lista.add(teamConsult);
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
