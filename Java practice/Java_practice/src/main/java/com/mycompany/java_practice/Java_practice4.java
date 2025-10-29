/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_practice;

/**
 *
 * @author Ace Gamitin
 */ 
import javax.swing.JOptionPane;
public class Java_practice4 {
    public static void main(String[] args) {
        String get_op, get_num1, get_num2;
                
        get_op = JOptionPane.showInputDialog(null, "Choose an Operator:"
                + "\n"
                + "1. Addition: +"
                + "\n"
                + "2. Subtraction -"
                + "\n"
                + "3. Multiplication: *"
                + "\n"
                + "4. Division: /" 
                + "\n"
                + "\n",
                "Operations", 
                JOptionPane.INFORMATION_MESSAGE);
        
        int op = Integer.parseInt(get_op);
        
        get_num1 = JOptionPane.showInputDialog(null, "Enter first number: ", "Operations", JOptionPane.INFORMATION_MESSAGE);
       
        int num1 = Integer.parseInt(get_num1);
        
        get_num2 = JOptionPane.showInputDialog(null, "Enter second number: ", "Operations", JOptionPane.INFORMATION_MESSAGE);
        
        int num2 = Integer.parseInt(get_num2);
        
        if(op==1) {
            JOptionPane.showMessageDialog(null, 
                    "Result: " + num1 + " + " + num2 + " = " + (num1+num2), 
                    "Operations", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
