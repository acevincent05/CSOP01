/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity4;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class Activity_4_1 {
    public static void main(String[] args) {
        
        String getNum = JOptionPane.showInputDialog(null, "Enter number: ", 
                "Input", 
                JOptionPane.INFORMATION_MESSAGE);
        
        int num = Integer.parseInt(getNum);
        
        
        if(num<=100 && num>=1){
            JOptionPane.showMessageDialog(null, "Input number " + num + " is between 1 - 100.", 
                    "Input", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Input number " + num + " is not pat of 1 - 100.", 
                    "Input", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
