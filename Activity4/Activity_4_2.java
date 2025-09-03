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
public class Activity_4_2 {
    public static void main(String[] args) {
        
        String getNum = JOptionPane.showInputDialog(null, 
                "Input orginal price: ", 
                "Input", 
                JOptionPane.INFORMATION_MESSAGE);
        
        int num = Integer.parseInt(getNum);
        
        
        if(num<=5000 && num>=0){
            
            double discPer =  0.05;
            
            JOptionPane.showMessageDialog(null, 
                            "Original Price: " + num 
                            + "\n" 
                            + "Discount Rate: 5%" 
                            + "\n"
                            + "Discounted Price: " + (num*discPer)
                            + "\n"
                            + "New Price: " + (num-(num*discPer)),
                    "Input", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(num<=10000 && num>=5001){
            
            double discPer =  0.07;
            
            JOptionPane.showMessageDialog(null, 
                            "Original Price: " + num 
                            + "\n" 
                            + "Discount Rate: 7%" 
                            + "\n"
                            + "Discounted Price: " + (num*discPer)
                            + "\n"
                            + "New Price: " + (num-(num*discPer)),
                    "Input", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            
            double discPer =  0.10;
            
            JOptionPane.showMessageDialog(null, 
                            "Original Price: " + num 
                            + "\n" 
                            + "Discount Rate: 10%" 
                            + "\n"
                            + "Discounted Price: " + (num*discPer)
                            + "\n"
                            + "New Price: " + (num-(num*discPer)),
                    "Input", 
                    JOptionPane.INFORMATION_MESSAGE);
        }

        }
        
    }

