/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity4;



/**
 *
 * @author Student
 */
import javax.swing.JOptionPane;
public class Activity_4_3 {
    public static void main(String[] args) {
        
        
        String name = JOptionPane.showInputDialog(null, 
                "Name: ", 
                "Input", 
                JOptionPane.INFORMATION_MESSAGE);
        
        String course = JOptionPane.showInputDialog(null, 
                "Course: ", 
                "Input", 
                JOptionPane.INFORMATION_MESSAGE);
        
        String year = JOptionPane.showInputDialog(null, 
                "Year Level: ", 
                "Input", 
                JOptionPane.INFORMATION_MESSAGE);
        
        String getPrelim = JOptionPane.showInputDialog(null, 
                "Prelim: ", 
                "Input", 
                JOptionPane.INFORMATION_MESSAGE);
        
        String getMidterm = JOptionPane.showInputDialog(null, 
                "Midterm: ", 
                "Input", 
                JOptionPane.INFORMATION_MESSAGE);
        
        String getFinals = JOptionPane.showInputDialog(null, 
                "Finals: ", 
                "Input", 
                JOptionPane.INFORMATION_MESSAGE);
        
        double prelim = Double.parseDouble(getPrelim);
        double midterm = Double.parseDouble(getMidterm);
        double finals = Double.parseDouble(getFinals);
        
        double avg = ((prelim+midterm+finals)/3);
        
        String numGrade = null;
        
        if(avg<=100 && avg>=97){
            
            numGrade = "1.00";
            
        }
        
        else if(avg<=96 && avg>=94){
            
            numGrade = "1.25";
            
        }
        
        else if(avg<=93 && avg>=91){
            
            numGrade = "1.50";
            
        }
        
        else if(avg<=90 && avg>=88){
            
            numGrade = "1.75";
            
        }
        
        else if(avg<=87 && avg>=85){
            
            numGrade = "2.00";
            
        }
        
        else if(avg<=84 && avg>=82){
            
            numGrade = "2.25";
            
        }
        
        else if(avg<=81 && avg>=79){
            
            numGrade = "2.50";
            
        }
        
        else if(avg<=78 && avg>=77){
            
            numGrade = "2.75";
            
        }
        
        else if(avg<=76 && avg>=75){
            
            numGrade = "3.00";
            
        }
        
        else if(avg<74){
            
            numGrade = "5.00";
            
        }
        
        else {
            
            numGrade = "N/A";
            
        }
        
        
        JOptionPane.showMessageDialog(null, 
                            "STUDENT NAME: " + name 
                            + "\n" 
                            + "COURSE: " + course
                            + "\n"
                            + "YEAR LEVEL: " + year
                            + "\n"
                            + "\n"
                            + "GRADES"
                            + "\n"
                            + "PRELIM: " + prelim
                            + "\n"
                            + "MIDTERM: " + midterm
                            + "\n"
                            + "FINALS: " + finals
                            + "\n"
                            + "AVERAGE: " + avg
                            + "\n"
                            + "NUMERICAL GRADE: " + numGrade,
                    "Input", 
                    JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }

