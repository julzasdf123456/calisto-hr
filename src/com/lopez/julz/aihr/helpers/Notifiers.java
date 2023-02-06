/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.helpers;

import javax.swing.JOptionPane;

/**
 *
 * @author Julio Lopez
 */
public class Notifiers {
    public static void showMessage(String title, String body, int type) {
        JOptionPane.showMessageDialog(null, body, title, type);
    }
}
