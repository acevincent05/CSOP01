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

public class exercise {
    public static void main(String[] args) {
        String name;
        name=JOptionPane.showInputDialog("Enter name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name,"Greetings",JOptionPane.INFORMATION_MESSAGE);
    }
}
