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
public class PayrollSchedulesDao {
    public static PayrollSchedules getOnByEmployeeBioId(Connection con, String bioUserId) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT p.* FROM Employees e LEFT JOIN PayrollSchedules p ON e.PayrollScheduleId=p.id WHERE e.BiometricsUserId=?");
            ps.setString(1, bioUserId);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return new PayrollSchedules(
                        rs.getString("id"),
                        rs.getString("Name"),
                        rs.getString("StartTime"),
                        rs.getString("BreakStart"),
                        rs.getString("BreakEnd"),
                        rs.getString("EndTime"),
                        rs.getString("Notes")
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
}
