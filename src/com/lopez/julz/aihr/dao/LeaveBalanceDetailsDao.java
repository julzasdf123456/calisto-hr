/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Julio Lopez
 */
public class LeaveBalanceDetailsDao {
    public static boolean insert(Connection con, LeaveBalanceDetails detail) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO LeaveBalanceDetails(id, EmployeeId, Method, Days, Details, created_at, updated_at, Month, LeaveType) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, detail.getId());
            ps.setString(2, detail.getEmployeeId());
            ps.setString(3, detail.getMethod());
            ps.setString(4, detail.getDays());
            ps.setString(5, detail.getDetails());
            ps.setString(6, detail.getCreated_at());
            ps.setString(7, detail.getUpdated_at());
            ps.setString(8, detail.getMonth());
            ps.setString(9, detail.getLeaveType());
            ps.executeUpdate();                
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static LeaveBalanceDetails getLatest(Connection con, String employeeId, String leaveType) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM LeaveBalanceDetails WHERE EmployeeId=? AND Method='ADD' AND LeaveType=? ORDER BY Month DESC");
            ps.setString(1, employeeId);
            ps.setString(2, leaveType);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                LeaveBalanceDetails leaveBalanceDetails = new LeaveBalanceDetails(
                        rs.getString("id"), 
                        rs.getString("EmployeeId"), 
                        rs.getString("Method"), 
                        rs.getString("Days"), 
                        rs.getString("Details"), 
                        rs.getString("created_at"), 
                        rs.getString("updated_at"), 
                        rs.getString("Month"), 
                        rs.getString("LeaveType"));
                
                ps.close();
                rs.close();
                
                return leaveBalanceDetails;
            }
            
            ps.close();
            rs.close();

            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static LeaveBalanceDetails getOneByMonth(Connection con, String employeeId, String leaveType, String month) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM LeaveBalanceDetails WHERE EmployeeId=? AND Method='ADD' AND LeaveType=? AND Month=? ORDER BY Month DESC");
            ps.setString(1, employeeId);
            ps.setString(2, leaveType);
            ps.setString(3, month);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                LeaveBalanceDetails leaveBalanceDetails = new LeaveBalanceDetails(
                        rs.getString("id"), 
                        rs.getString("EmployeeId"), 
                        rs.getString("Method"), 
                        rs.getString("Days"), 
                        rs.getString("Details"), 
                        rs.getString("created_at"), 
                        rs.getString("updated_at"), 
                        rs.getString("Month"), 
                        rs.getString("LeaveType"));
                
                ps.close();
                rs.close();
                
                return leaveBalanceDetails;
            }
            
            ps.close();
            rs.close();

            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static LeaveBalanceDetails getEarliest(Connection con, String employeeId, String leaveType) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM LeaveBalanceDetails WHERE EmployeeId=? AND Method='ADD' AND LeaveType=? ORDER BY Month");
            ps.setString(1, employeeId);
            ps.setString(2, leaveType);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                LeaveBalanceDetails leaveBalanceDetails = new LeaveBalanceDetails(
                        rs.getString("id"), 
                        rs.getString("EmployeeId"), 
                        rs.getString("Method"), 
                        rs.getString("Days"), 
                        rs.getString("Details"), 
                        rs.getString("created_at"), 
                        rs.getString("updated_at"), 
                        rs.getString("Month"), 
                        rs.getString("LeaveType"));
                
                ps.close();
                rs.close();
                
                return leaveBalanceDetails;
            }
            
            ps.close();
            rs.close();

            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
