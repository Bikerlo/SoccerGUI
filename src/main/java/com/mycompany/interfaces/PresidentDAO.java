/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.President;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author torre
 */
public interface PresidentDAO extends CRUD<President> {
     public President getPresidentById(int presidentId) throws Exception ;
     public List<String> getPresidentListName() throws ClassNotFoundException, SQLException;
}
