/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.President;

/**
 *
 * @author torre
 */
public interface PresidentDAO extends CRUD<President> {
     public President getPresidentById(int presidentId) throws Exception ;
}
