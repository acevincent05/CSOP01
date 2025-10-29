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

public class activity3_2 {
    public static void main(String[] args) {
        String input;
        int min, secs;
        
        input=JOptionPane.showInputDialog("Input the number of seconds to convert: ");
        
        int num = Integer.parseInt(input);
        
        min = num/60;
        secs = num%60;
                
                JOptionPane.showMessageDialog(null, input+" seconds is equivalent to "+min+" minute/s and "+secs+" seconds."
                ,"Input",JOptionPane.INFORMATION_MESSAGE);
    }
}

