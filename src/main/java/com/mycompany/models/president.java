/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author torre
 */
public class president {
    
    private int DNI;
    private String name;
    private String lastname;
    private String team;
    private String bornDate;
    private String electionYear;


    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public void setElectionYear(String electionYear) {
        this.electionYear = electionYear;
    }
    
    public int getDNI() {
        return DNI;
    }
    
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTeam() {
        return team;
    }

    public String getBornDate() {
        return bornDate;
    }

    public String getElectionYear() {
        return electionYear;
    }
    
    
    
    
    
    
}
