/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

/**
 *
 * @author julza
 */
public class EmployeeDayOffs {
    private String id;
    private String EmployeeId;
    private String DayOff;
    private String Notes;
    private String created_at;
    private String updated_at;

    public EmployeeDayOffs() {
    }

    public EmployeeDayOffs(String id, String EmployeeId, String DayOff, String Notes, String created_at, String updated_at) {
        this.id = id;
        this.EmployeeId = EmployeeId;
        this.DayOff = DayOff;
        this.Notes = Notes;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getDayOff() {
        return DayOff;
    }

    public void setDayOff(String DayOff) {
        this.DayOff = DayOff;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    
    
}
