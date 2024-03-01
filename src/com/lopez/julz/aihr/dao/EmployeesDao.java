package com.lopez.julz.aihr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Lopez
 */
public class EmployeesDao {
    public static Employees getOneById(Connection con, String id) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Employees WHERE id=?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return new Employees(
                        rs.getString("id"),
                        rs.getString("FirstName"),
                        rs.getString("MiddleName"),
                        rs.getString("LastName"),
                        rs.getString("Suffix"),
                        rs.getString("Gender"),
                        rs.getString("Birthdate"),
                        rs.getString("StreetCurrent"),
                        rs.getString("BarangayCurrent"),
                        rs.getString("TownCurrent"),
                        rs.getString("ProvinceCurrent"),
                        rs.getString("StreetPermanent"),
                        rs.getString("BarangayPermanent"),
                        rs.getString("TownPermanent"),
                        rs.getString("ProvincePermanent"),
                        rs.getString("ContactNumbers"),
                        rs.getString("EmailAddress"),
                        rs.getString("BloodType"),
                        rs.getString("CivilStatus"),
                        rs.getString("Religion"),
                        rs.getString("Citizenship"),
                        rs.getString("Designation"),
                        rs.getString("BiometricsUserId"),
                        rs.getString("PayrollScheduleId")
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
    
    public static List<Employees> getAll(Connection con) {
        try {
            List<Employees> employees = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Employees ORDER BY LastName");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                employees.add(new Employees(
                        rs.getString("id"),
                        rs.getString("FirstName"),
                        rs.getString("MiddleName"),
                        rs.getString("LastName"),
                        rs.getString("Suffix"),
                        rs.getString("Gender"),
                        rs.getString("Birthdate"),
                        rs.getString("StreetCurrent"),
                        rs.getString("BarangayCurrent"),
                        rs.getString("TownCurrent"),
                        rs.getString("ProvinceCurrent"),
                        rs.getString("StreetPermanent"),
                        rs.getString("BarangayPermanent"),
                        rs.getString("TownPermanent"),
                        rs.getString("ProvincePermanent"),
                        rs.getString("ContactNumbers"),
                        rs.getString("EmailAddress"),
                        rs.getString("BloodType"),
                        rs.getString("CivilStatus"),
                        rs.getString("Religion"),
                        rs.getString("Citizenship"),
                        rs.getString("Designation"),
                        rs.getString("BiometricsUserId"),
                        rs.getString("PayrollScheduleId")
                ));
            }
            
            rs.close();
            ps.close();
            return employees;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<Employees> getAllWithDayOff(Connection con) {
        try {
            List<Employees> employees = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Employees WHERE (EmploymentStatus IS NULL OR EmploymentStatus NOT IN ('Resigned', 'Retired')) ORDER BY LastName");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                employees.add(new Employees(
                        rs.getString("id"),
                        rs.getString("FirstName"),
                        rs.getString("MiddleName"),
                        rs.getString("LastName"),
                        rs.getString("Suffix"),
                        rs.getString("Gender"),
                        rs.getString("Birthdate"),
                        rs.getString("StreetCurrent"),
                        rs.getString("BarangayCurrent"),
                        rs.getString("TownCurrent"),
                        rs.getString("ProvinceCurrent"),
                        rs.getString("StreetPermanent"),
                        rs.getString("BarangayPermanent"),
                        rs.getString("TownPermanent"),
                        rs.getString("ProvincePermanent"),
                        rs.getString("ContactNumbers"),
                        rs.getString("EmailAddress"),
                        rs.getString("BloodType"),
                        rs.getString("CivilStatus"),
                        rs.getString("Religion"),
                        rs.getString("Citizenship"),
                        rs.getString("Designation"),
                        rs.getString("BiometricsUserId"),
                        rs.getString("PayrollScheduleId"),
                        rs.getString("DayOffDates"),
                        rs.getString("EmploymentStatus")
                ));
            }
            
            rs.close();
            ps.close();
            return employees;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
