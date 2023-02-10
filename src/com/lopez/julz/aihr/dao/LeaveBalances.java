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
public class LeaveBalances {
    private String id;
    private String EmployeeId;
    private String Vacation;
    private String Sick;
    private String Special;
    private String Maternity;
    private String MaternityForSoloMother;
    private String Paternity;
    private String SoloParent;
    private String Notes;
    private String Month;
    private String Year;
    private String created_at;
    private String updated_at;

    public LeaveBalances() {
    }

    public LeaveBalances(String id, String EmployeeId, String Vacation, String Sick, String Special, String Maternity, String MaternityForSoloMother, String Paternity, String SoloParent, String Notes, String Month, String Year, String created_at, String updated_at) {
        this.id = id;
        this.EmployeeId = EmployeeId;
        this.Vacation = Vacation;
        this.Sick = Sick;
        this.Special = Special;
        this.Maternity = Maternity;
        this.MaternityForSoloMother = MaternityForSoloMother;
        this.Paternity = Paternity;
        this.SoloParent = SoloParent;
        this.Notes = Notes;
        this.Month = Month;
        this.Year = Year;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getVacation() {
        return Vacation;
    }

    public void setVacation(String Vacation) {
        this.Vacation = Vacation;
    }

    public String getSick() {
        return Sick;
    }

    public void setSick(String Sick) {
        this.Sick = Sick;
    }

    public String getSpecial() {
        return Special;
    }

    public void setSpecial(String Special) {
        this.Special = Special;
    }

    public String getMaternity() {
        return Maternity;
    }

    public void setMaternity(String Maternity) {
        this.Maternity = Maternity;
    }

    public String getMaternityForSoloMother() {
        return MaternityForSoloMother;
    }

    public void setMaternityForSoloMother(String MaternityForSoloMother) {
        this.MaternityForSoloMother = MaternityForSoloMother;
    }

    public String getPaternity() {
        return Paternity;
    }

    public void setPaternity(String Paternity) {
        this.Paternity = Paternity;
    }

    public String getSoloParent() {
        return SoloParent;
    }

    public void setSoloParent(String SoloParent) {
        this.SoloParent = SoloParent;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }
    
    
}
