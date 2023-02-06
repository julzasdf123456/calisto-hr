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
public class BiometricUsers {
    private String id;
    private String UID;
    private String Name;
    private String UserId;
    private String Role;
    private String Notes;
    private String created_at;
    private String updated_at;

    public BiometricUsers() {
    }

    public BiometricUsers(String id, String UID, String Name, String UserId, String Role, String Notes, String created_at, String updated_at) {
        this.id = id;
        this.UID = UID;
        this.Name = Name;
        this.UserId = UserId;
        this.Role = Role;
        this.Notes = Notes;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
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
    
    
}
