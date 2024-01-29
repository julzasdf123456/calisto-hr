/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.dao;

/**
 *
 * @author julza
 */
public class BiometricDevices {
    private String id;
    private String IPAddress;
    private String Brand;
    private String Office;
    private String Status;
    private String Notes;
    private String DatetimeLastSynced;

    public BiometricDevices() {
    }

    public BiometricDevices(String id, String IPAddress, String Brand, String Office, String Status, String Notes, String DatetimeLastSynced) {
        this.id = id;
        this.IPAddress = IPAddress;
        this.Brand = Brand;
        this.Office = Office;
        this.Status = Status;
        this.Notes = Notes;
        this.DatetimeLastSynced = DatetimeLastSynced;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String Office) {
        this.Office = Office;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public String getDatetimeLastSynced() {
        return DatetimeLastSynced;
    }

    public void setDatetimeLastSynced(String DatetimeLastSynced) {
        this.DatetimeLastSynced = DatetimeLastSynced;
    }
    
    
}
