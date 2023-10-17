/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author torre
 * @param <T>
 */
public interface CRUD<T> {
    
     // Crear un nuevo registro
    void create(T entity);
    // Leer un registro por su ID

    /**
     *
     * @param id
     * @return
     */
    T read(int id);
    // Actualizar un registro
    void update(T entity);

    // Eliminar un registro
    void delete(T entity);

    // Listar todos los registros
    List<T> listAll(String name)throws SQLException, Exception;
    
}
