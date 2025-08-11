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

public class exercise2 {
    public static void main(String[] args) {
        String name, input;
        double grade, score;
        
        name=JOptionPane.showInputDialog("Enter name: ");
        input=JOptionPane.showInputDialog("Enter score: ");
        
        score=Double.parseDouble(input);
        grade=score/25*50+50;
        
        JOptionPane.showMessageDialog(null, "Student Name: "+name
                +"\nScore: "+score
                +"\nGrade: "+grade
                ,"Greetings",JOptionPane.INFORMATION_MESSAGE);
    }
}
