/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_practice;

/**
 *
 * @author Ace Gamitin
 */ 
import javax.swing.JOptionPane;
public class Java_practice5 {
    public static void main(String[] args) {
        String get_op, get_num1, get_num2;
        
        get_op = JOptionPane.showInputDialog(null, "Choose Operator:"
                + "\n"
                + "1. Addition"
                + "\n"
                + "2. Subtraction"
                + "\n"
                + "3. Multiplication"
                + "\n"
                + "4. Division ", "Operations", JOptionPane.INFORMATION_MESSAGE);
        
        get_num1 = JOptionPane.showInputDialog(null, "Enter first number: ", "Operations", JOptionPane.INFORMATION_MESSAGE);
        get_num2 = JOptionPane.showInputDialog(null, "Enter second number: ", "Operations", JOptionPane.INFORMATION_MESSAGE);
        
        int num1 = Integer.parseInt(get_num1);
        int num2 = Integer.parseInt(get_num2);
        int op = Integer.parseInt(get_op);
            
        if(op==1){
            int result = num1 + num2;
            JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + result, "Operations", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(op==2){
            int result = num1 - num2;
            JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + result, "Operations", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(op==3){
            int result = num1 * num2;
            JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + result, "Operations", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(op==4){
            int result = num1 / num2;
            JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + result, "Operations", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
