/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author torre
 */
public class team {
    
    private String id;
    private String name;
    private String city;
    private String stadium;
    private String foundationYear;
    private String presidentId;
    private String partido;

    public void setId(String id) {
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

    public void setFoundationYear(String foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void setPresidentId(String presidentId) {
        this.presidentId = presidentId;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getId() {
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

    public String getFoundationYear() {
        return foundationYear;
    }

    public String getPresidentId() {
        return presidentId;
    }

    public String getPartido() {
        return partido;
    }
    
}
