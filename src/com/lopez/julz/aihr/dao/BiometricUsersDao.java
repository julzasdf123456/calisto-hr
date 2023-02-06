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
public class BiometricUsersDao {
    public static boolean insert(Connection con, BiometricUsers biometricUsers) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO BiometricUsers(id, UID, Name, UserId, Role, Notes, created_at, updated_at) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, biometricUsers.getId());
            ps.setString(2, biometricUsers.getUID());
            ps.setString(3, biometricUsers.getName());
            ps.setString(4, biometricUsers.getUserId());
            ps.setString(5, biometricUsers.getRole());
            ps.setString(6, biometricUsers.getNotes());
            ps.setString(7, biometricUsers.getCreated_at());
            ps.setString(8, biometricUsers.getUpdated_at());
            ps.executeUpdate();                
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static BiometricUsers getOneByNameAndUserId(Connection con, String name, String userId) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM BiometricUsers WHERE Name=? AND UserId=?");
            ps.setString(1, name);
            ps.setString(2, userId);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return new BiometricUsers(rs.getString("id"),
                        rs.getString("UID"),
                        rs.getString("Name"),
                        rs.getString("UserId"),
                        rs.getString("Role"),
                        rs.getString("Notes"),
                        rs.getString("created_at"),
                        rs.getString("updated_at"));
            }
            
            rs.close();
            ps.close();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<BiometricUsers> getAll(Connection con) {
        try {
            List<BiometricUsers> usersList = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM BiometricUsers ORDER BY Name");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                usersList.add(new BiometricUsers(rs.getString("id"),
                        rs.getString("UID"),
                        rs.getString("Name"),
                        rs.getString("UserId"),
                        rs.getString("Role"),
                        rs.getString("Notes"),
                        rs.getString("created_at"),
                        rs.getString("updated_at")));
            }
            
            rs.close();
            ps.close();
            return usersList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
