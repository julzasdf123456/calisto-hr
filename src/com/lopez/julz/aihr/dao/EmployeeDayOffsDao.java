/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

import com.lopez.julz.aihr.helpers.ObjectHelpers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author julza
 */
public class EmployeeDayOffsDao {
    public static EmployeeDayOffs getOneByDate(Connection con, String employeeId, String date) {
        try {
            String sql = "SELECT * FROM EmployeeDayOffs WHERE EmployeeId='" + employeeId + "' AND DayOff='" + date + "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                EmployeeDayOffs dayoff = new EmployeeDayOffs(rs.getString("id"), 
                        rs.getString("EmployeeId"),
                        rs.getString("DayOff"), 
                        rs.getString("Notes"), 
                        rs.getString("created_at"), 
                        rs.getString("updated_at"));
                
                ps.close();
                rs.close();
                
                return dayoff;
            } else {
                ps.close();
                rs.close();
                return null;
            } 
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void insert(Connection con, EmployeeDayOffs employeeDayOffs) {
        try {
            String sql = "INSERT INTO EmployeeDayOffs (id," +
                                "EmployeeId," +
                                "DayOff," +
                                "Notes," +
                                "created_at," +
                                "updated_at) VALUES (?, ?, ?, ?, ?, ?)";
            
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, ObjectHelpers.generateIDandRandString());
           ps.setString(2, employeeDayOffs.getEmployeeId());
           ps.setString(3, employeeDayOffs.getDayOff());
           ps.setString(4, employeeDayOffs.getNotes());
           ps.setString(5, employeeDayOffs.getCreated_at());
           ps.setString(6, employeeDayOffs.getUpdated_at());
           ps.execute();
           
           ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
