/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dialogs;

/**
 *
 * @author Student
 */
import javax.swing.JOptionPane;

public class activity3_1 {
    public static void main(String[] args) {
        String input1, input2, input3;
        double grade, score1, score2, score3;
        
        input1=JOptionPane.showInputDialog("Enter first number: ");
        input2=JOptionPane.showInputDialog("Enter second number: ");
        input3=JOptionPane.showInputDialog("Enter third number: ");
        
        score1=Double.parseDouble(input1);
        score2=Double.parseDouble(input2);
        score3=Double.parseDouble(input3);
        
        grade=score1+score2+score3;
                
                JOptionPane.showMessageDialog(null, "Input numbers are:"
                +"\nScore: "+score1
                +"\nScore: "+score2
                +"\nScore: "+score3
                +"\n"
                +"\n"
                +"SUM: "+grade
                ,"Input",JOptionPane.INFORMATION_MESSAGE);
    }
}
