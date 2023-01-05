/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numbercheck;
//Import package 
import java.util.Scanner; 
public class OddOrEven 
{ 
 
 public static void CheckOddOrEven() 
 { 
 int x; 
 Scanner in = new Scanner(System.in); 
 x = in.nextInt(); 
 
 if ( x % 2 == 0 ) 
 System.out.println("The number entered is an even number."); 
 else 
 System.out.println("The number entered is an odd number."); 
 
 } 
}
