package com.mycompany.util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author torre
 */
public class DateConverter {
    
     // Método para convertir una cadena de texto a un objeto Date
    public static Date strToDate(String textoFecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-M-d"); // Define el formato de la cadena
            return formatoFecha.parse(textoFecha);
        } catch (ParseException e) {
            return null; // En caso de error
        }
    }

    // Método para convertir un objeto Date a una cadena de texto
    public static String dateToStr(Date fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-M-d"); // Define el formato de la cadena
        return formatoFecha.format(fecha);
    }
    
}
