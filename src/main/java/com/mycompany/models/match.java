/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author torre
 */

public class match {
    
    private int id;
    private String date;
    private String localTeam;
    private String visitorTeam;

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getLocalTeam() {
        return localTeam;
    }

    public String getVisitorTeam() {
        return visitorTeam;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocalTeam(String localTeam) {
        this.localTeam = localTeam;
    }

    public void setVisitorTeam(String visitorTeam) {
        this.visitorTeam = visitorTeam;
    }
    
}
