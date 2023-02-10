/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

/**
 *
 * @author Julio Lopez
 */
public class PayrollSchedules {
    private String id;
    private String Name;
    private String StartTime;
    private String BreakStart;
    private String BreakEnd;
    private String EndTime;
    private String Notes;

    public PayrollSchedules() {
    }
    
    public PayrollSchedules(String id, String Name, String StartTime, String BreakStart, String BreakEnd, String EndTime, String Notes) {
        this.id = id;
        this.Name = Name;
        this.StartTime = StartTime;
        this.BreakStart = BreakStart;
        this.BreakEnd = BreakEnd;
        this.EndTime = EndTime;
        this.Notes = Notes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getBreakStart() {
        return BreakStart;
    }

    public void setBreakStart(String BreakStart) {
        this.BreakStart = BreakStart;
    }

    public String getBreakEnd() {
        return BreakEnd;
    }

    public void setBreakEnd(String BreakEnd) {
        this.BreakEnd = BreakEnd;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
    
    
}
