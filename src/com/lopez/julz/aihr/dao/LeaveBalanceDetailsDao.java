/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Julio Lopez
 */
public class LeaveBalanceDetailsDao {
    public static boolean insert(Connection con, LeaveBalanceDetails detail) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO LeaveBalanceDetails(id, EmployeeId, Method, Days, Details, created_at, updated_at) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, detail.getId());
            ps.setString(2, detail.getEmployeeId());
            ps.setString(3, detail.getMethod());
            ps.setString(4, detail.getDays());
            ps.setString(5, detail.getDetails());
            ps.setString(6, detail.getCreated_at());
            ps.setString(7, detail.getUpdated_at());
            ps.executeUpdate();                
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
