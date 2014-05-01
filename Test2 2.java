/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exercise;

/**
 *
 * @author rexo
 */
public class Test2 {
    public static void main(String[] args)
    {
        final double pi =3.142;
        double radius = 2.5;
        double area = (pi * radius*radius);
        if (area > 14.0) {
            System.out.println(area + " High");
            
        }
        else if(area >= 10){
     System.out.println(area + " Medium");
    
        }
        else
        {
            System.out.println(area + " low");
        }
    }
    
}
