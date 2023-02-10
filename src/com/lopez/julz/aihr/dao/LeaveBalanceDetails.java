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
public class LeaveBalanceDetails {
    private String id;
    private String EmployeeId;
    private String Method;
    private String Days;
    private String Details;
    private String created_at;
    private String updated_at;

    public LeaveBalanceDetails() {
    }
    
    public LeaveBalanceDetails(String id, String EmployeeId, String Method, String Days, String Details, String created_at, String updated_at) {
        this.id = id;
        this.EmployeeId = EmployeeId;
        this.Method = Method;
        this.Days = Days;
        this.Details = Details;
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

    public String getMethod() {
        return Method;
    }

    public void setMethod(String Method) {
        this.Method = Method;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String Days) {
        this.Days = Days;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
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
