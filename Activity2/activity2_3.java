/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2na;

/**
 *
 * @author Student
 */
import java.util.*;
public class activity2_3 {
    static Scanner console=new Scanner(System.in);
    public static void main(String[] args) {
        
        double num1, num2, num3;
        
        System.out.print("Enter first number: ");
        num1=console.nextDouble();
        
        System.out.print("Enter second number: ");
        num2=console.nextDouble();
        
        System.out.print("Enter third number: ");
        num3=console.nextDouble();
        
        System.out.println("Result: "+((num1+num2+num3)/3));
    }
}

