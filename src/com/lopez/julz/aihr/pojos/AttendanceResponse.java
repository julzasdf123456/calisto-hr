/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.pojos;

/**
 *
 * @author Julio Lopez
 */
public class AttendanceResponse {
    private String uid;
    private String id;
    private String state;
    private String timestamp;
    private String type;

    public AttendanceResponse() {
    }

    public AttendanceResponse(String uid, String id, String state, String timestamp, String type) {
        this.uid = uid;
        this.id = id;
        this.state = state;
        this.timestamp = timestamp;
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
