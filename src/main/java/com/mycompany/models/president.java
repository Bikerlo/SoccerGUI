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
public class President {
    
    private int ID;
    private String DNI;
    private String name;
    private String lastname;
    private Date birthDay;
    private Date electionYear;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = strToDate(birthDay);
    }

    public void setElectionYear(String electionYear) {
        this.electionYear = strToDate(electionYear);
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    
    public Date getBirthDay() {
        return birthDay;
    }

    public Date getElectionYear() {
        return electionYear;
    }
    
}
