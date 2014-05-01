/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exercise;
import java.util.*;

/**
 *
 * @author rexo
 */
public class Array {
    public static void main(String[] args)
    {
    int[] myArray = new int[5];
    int[][] myArray2 = new int [5][5];
    for(int x=0;x<myArray.length;x++)
    {
        for(int y=0;y<myArray.length;y++)
        {
            if (x==1 && y==1) 
            {
            myArray2[x][y]=0;
            }
             else if(x==0 && y==0) 
            {
            myArray2[x][y]=0;
            }
            else if(x+y==4) 
            {
            myArray2[x][y]=1;
            }
              else if(x==y) 
            {
            myArray2[x][y]=1;
            }
            System.out.print( myArray2[x][y]+" ");
            
            
        }
        System.out.println("");
    }
    }
    
}
