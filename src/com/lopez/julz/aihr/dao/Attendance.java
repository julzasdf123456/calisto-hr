/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

/**
 *
 * @author Julio Lopez
 */
public class Attendance {
    private String id;
    private String BiometricUserId;
    private String EmployeeId;
    private String UserId;
    private String Timestamp;
    private String State;
    private String UID;
    private String created_at;
    private String updated_at;
    private String DeviceIp;

    public Attendance() {
    }

    public Attendance(String id, String BiometricUserId, String EmployeeId, String UserId, String Timestamp, String State, String UID, String created_at, String updated_at, String DeviceIp) {
        this.id = id;
        this.BiometricUserId = BiometricUserId;
        this.EmployeeId = EmployeeId;
        this.UserId = UserId;
        this.Timestamp = Timestamp;
        this.State = State;
        this.UID = UID;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.DeviceIp = DeviceIp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBiometricUserId() {
        return BiometricUserId;
    }

    public void setBiometricUserId(String BiometricUserId) {
        this.BiometricUserId = BiometricUserId;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDeviceIp() {
        return DeviceIp;
    }

    public void setDeviceIp(String DeviceIp) {
        this.DeviceIp = DeviceIp;
    }
    
    
}
