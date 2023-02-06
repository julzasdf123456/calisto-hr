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
public class BiometricUsersResponse {
    private String uid;
    private String name;
    private String userid;
    private String role;

    public BiometricUsersResponse() {
    }

    public BiometricUsersResponse(String uid, String name, String userid, String role) {
        this.uid = uid;
        this.name = name;
        this.userid = userid;
        this.role = role;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
}
