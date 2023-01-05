/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numbercheck;
//Import package 
import java.util.Scanner; 
public class CheckPrime 
{ 
 
 public static void CheckPrime() 
 { 
 int x, count=0; 
 System.out.println("Enter an integer to check if it is prime or not "); 
 Scanner in = new Scanner(System.in); 
 x = in.nextInt(); 
 
 for(int i=2; i< x; i++) 
 { 
 if ( x % i == 0 ) 
 count=count+1; 
 } 
 if (count ==0) 
 System.out.println("The number is prime"); 
 else 
 System.out.println("The number is not prime"); 
 
 } 
} 
