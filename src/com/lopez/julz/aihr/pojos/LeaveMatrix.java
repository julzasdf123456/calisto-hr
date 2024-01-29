/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.pojos;

/**
 *
 * @author julza
 */
public class LeaveMatrix {
    private String LeaveType;
    private double Balance;
    private String Occurence; // Yearly, Monthly
    
    public LeaveMatrix() {
        
    }

    public LeaveMatrix(String LeaveType, double Balance, String Occurence) {
        this.LeaveType = LeaveType;
        this.Balance = Balance;
        this.Occurence = Occurence;
    }

    public String getLeaveType() {
        return LeaveType;
    }

    public void setLeaveType(String LeaveType) {
        this.LeaveType = LeaveType;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public String getOccurence() {
        return Occurence;
    }

    public void setOccurence(String Occurence) {
        this.Occurence = Occurence;
    }
    
    
}
