/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise;

import javax.swing.JOptionPane;

/**
 *
 * @author rexo
 */
public class Test5 {

    public static void main(String[] args) {
        Student objStudent = new Student();
        String y = JOptionPane.showInputDialog("Enter Year Of Birth");
        int age = Integer.parseInt(y);

        String fn = JOptionPane.showInputDialog("Enter Your First Name");
        String ln = JOptionPane.showInputDialog("Enter Your Last Name");
        String sid = JOptionPane.showInputDialog("Enter Your Student Id");
        // int age = Integer.parseInt(y);
        objStudent.setYrOfBirth(age);
        objStudent.setFn(fn);
        objStudent.setln(ln);
        objStudent.setSid(sid);
        int x = objStudent.compute();
        String c = objStudent.getfn();
        String d = objStudent.getln();
        String e = objStudent.getSid();
      //   int x = objStudent.compute();

        System.out.println("Your Age is " + x);
        JOptionPane.showMessageDialog(null, "Your Name is " + c + " " + d + " And Your Age is " + x + "Index Number is " + e);

    }

}
