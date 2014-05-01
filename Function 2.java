/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise;
import javax.swing.*;


/**
 *
 * @author rexo
 */
public class Function {

    public static int myAge(int yrOfBirth) {
        return 2014 - yrOfBirth;
    }
    public static void main(String[] args)
    {
        //to use input box
        String  y = JOptionPane.showInputDialog("Enter Year Of Birth");
        int z = Integer.parseInt(y);
        int x = myAge(z);
        System.out.println("My Age is " + x);
        //to show result in a dailog
        String q = "Your Age";
     
      JOptionPane.showConfirmDialog(null, "DO YOu Want to save");
      JOptionPane.showConfirmDialog(null, "DO YOu Want to save");
       JOptionPane.showMessageDialog(null, x + "Your Age is " );
    }

}
