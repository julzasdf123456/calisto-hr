/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julio Lopez
 */
public class AttendanceDao {
    public static boolean insert(Connection con, Attendance attendance) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO AttendanceData(id, BiometricUserId, EmployeeId, UserId, Timestamp, State, UID, created_at, updated_at, DeviceIp) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, attendance.getId());
            ps.setString(2, attendance.getBiometricUserId());
            ps.setString(3, attendance.getEmployeeId());
            ps.setString(4, attendance.getUserId());
            ps.setString(5, attendance.getTimestamp());
            ps.setString(6, attendance.getState());
            ps.setString(7, attendance.getUID());
            ps.setString(8, attendance.getCreated_at());
            ps.setString(9, attendance.getUpdated_at());
            ps.setString(10, attendance.getDeviceIp());
            ps.executeUpdate();                
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static Attendance getOneByBioUserIdAndTimestamp(Connection con, String bioUserId, String timestamp) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM AttendanceData WHERE BiometricUserId=? AND Timestamp=?");
            ps.setString(1, bioUserId);
            ps.setString(2, timestamp);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return new Attendance(rs.getString("id"),
                        rs.getString("BiometricUserId"),
                        rs.getString("EmployeeId"),
                        rs.getString("UserId"),
                        rs.getString("Timestamp"),
                        rs.getString("State"),
                        rs.getString("UID"),
                        rs.getString("created_at"),
                        rs.getString("updated_at"),
                        rs.getString("DeviceIp"));
            }
            
            rs.close();
            ps.close();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<Attendance> getAll(Connection con) {
        try {
            List<Attendance> attendances = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement("SELECT a.*, b.Name FROM AttendanceData a LEFT JOIN BiometricUsers b ON a.BiometricUserId=b.UserId ORDER BY Timestamp");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                attendances.add(new Attendance(rs.getString("id"),
                        rs.getString("BiometricUserId"),
                        rs.getString("Name"),
                        rs.getString("UserId"),
                        rs.getString("Timestamp"),
                        rs.getString("State"),
                        rs.getString("UID"),
                        rs.getString("created_at"),
                        rs.getString("updated_at"),
                        rs.getString("DeviceIp")));
            }
            
            rs.close();
            ps.close();
            return attendances;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
