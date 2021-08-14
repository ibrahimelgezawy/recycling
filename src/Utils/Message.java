/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Ibrahim Mohamed
 */
public abstract class Message {
    public static void showErrorMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
}
