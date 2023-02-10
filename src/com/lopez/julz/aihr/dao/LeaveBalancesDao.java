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
public class LeaveBalancesDao {
    public static LeaveBalances getOneByEmployeeId(Connection con, String employeeId) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM LeaveBalances WHERE EmployeeId=?");
            ps.setString(1, employeeId);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return new LeaveBalances(
                        rs.getString("id"),
                        rs.getString("EmployeeId"),
                        rs.getString("Vacation"),
                        rs.getString("Sick"),
                        rs.getString("Special"),
                        rs.getString("Maternity"),
                        rs.getString("MaternityForSoloMother"),
                        rs.getString("Paternity"),
                        rs.getString("SoloParent"),
                        rs.getString("Notes"),
                        rs.getString("Month"),
                        rs.getString("Year"),
                        rs.getString("created_at"),
                        rs.getString("updated_at")
                );
            }
            
            rs.close();
            ps.close();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static boolean insert(Connection con, LeaveBalances leaveBalances) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO LeaveBalances(id, EmployeeId, Vacation, Sick, Special, Maternity, MaternityForSoloMother, Paternity, SoloParent, Notes, Month, Year, created_at, updated_at) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, leaveBalances.getId());
            ps.setString(2, leaveBalances.getEmployeeId());
            ps.setString(3, leaveBalances.getVacation());
            ps.setString(4, leaveBalances.getSick());
            ps.setString(5, leaveBalances.getSpecial());
            ps.setString(6, leaveBalances.getMaternity());
            ps.setString(7, leaveBalances.getMaternityForSoloMother());
            ps.setString(8, leaveBalances.getPaternity());
            ps.setString(9, leaveBalances.getSoloParent());
            ps.setString(10, leaveBalances.getNotes());
            ps.setString(11, leaveBalances.getMonth());
            ps.setString(12, leaveBalances.getYear());
            ps.setString(13, leaveBalances.getCreated_at());
            ps.setString(14, leaveBalances.getUpdated_at());
            ps.executeUpdate();                
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean update(Connection con, LeaveBalances leaveBalances) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE LeaveBalances SET Vacation=?, Sick=?, Special=?, Maternity=?, MaternityForSoloMother=?, Paternity=?, SoloParent=?, Notes=?, Month=?, Year=?, updated_at=? WHERE id=?");
            ps.setString(1, leaveBalances.getVacation());
            ps.setString(2, leaveBalances.getSick());
            ps.setString(3, leaveBalances.getSpecial());
            ps.setString(4, leaveBalances.getMaternity());
            ps.setString(5, leaveBalances.getMaternityForSoloMother());
            ps.setString(6, leaveBalances.getPaternity());
            ps.setString(7, leaveBalances.getSoloParent());
            ps.setString(8, leaveBalances.getNotes());
            ps.setString(9, leaveBalances.getMonth());
            ps.setString(10, leaveBalances.getYear());
            ps.setString(11, leaveBalances.getUpdated_at());
            ps.setString(12, leaveBalances.getId());
            ps.executeUpdate();                
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
