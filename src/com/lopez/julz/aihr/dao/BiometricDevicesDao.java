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
 * @author julza
 */
public class BiometricDevicesDao {
    public static List<BiometricDevices> getIps(Connection con) {
        try {
            List<BiometricDevices> list = new ArrayList<>();
            
            String qry = "SELECT * FROM BiometricDevices WHERE Status='ACTIVE'";
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                list.add(new BiometricDevices(rs.getString("id"), 
                        rs.getString("IPAddress"), 
                        rs.getString("Brand"), 
                        rs.getString("Office"), 
                        rs.getString("Status"), 
                        rs.getString("Notes"), 
                        rs.getString("DatetimeLastSynced")));
            }
                    
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String getIpsConcat(List<BiometricDevices> list) {
        try {
            String data = "";
        
            int size = list.size();
            
            for (int i=0; i<size; i++) {
                if (i == (size-1)) {
                    data += list.get(i).getIPAddress();
                } else {
                    data += list.get(i).getIPAddress() + ",";
                }
            }
            
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
