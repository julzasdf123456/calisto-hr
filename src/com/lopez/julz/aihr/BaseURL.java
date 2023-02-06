/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr;

/**
 *
 * @author Julio Lopez
 */
public class BaseURL {
    public static String baseUrl(String ip) {
        return "http://" + ip+ "/hr/public/api/";
    }
}
