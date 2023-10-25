/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import static com.mycompany.util.DateConverter.strToDate;
import java.util.Date;

/**
 *
 * @author torre
 */
public class team {
    
    private int id;
    private String name;
    private String city;
    private String stadium;
    private int capacity;
    private Date foundationYear;
    private int presidentId;
    private String partido;
    private String presidentName;
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFoundationYear(Date foundationYear) {
        this.foundationYear = foundationYear;
    }
    
    public void setPresidentId(String presidentId) {
        setPresidentId(presidentId);
    }
    

    public void setPresidentId(int presidentId) {
        this.presidentId = presidentId;
    }

    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }
    

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStadium() {
        return stadium;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public Date getFoundationYear() {
        return foundationYear;
    }

    public int getPresidentId() {
        return presidentId;
    }

    public String getPresidentName() {
        return presidentName;
    }
    

    public String getPartido() {
        return partido;
    }
    
}
