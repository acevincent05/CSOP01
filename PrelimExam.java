/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author Student
 */
import javax.swing.JOptionPane;
public class PrelimExam {
    public static void main(String[] args) {
        String reg = "Regular", prob = "Probationary", part = "part time";
        int regVal = 120, probVal = 80, partVal = 50;
        
        
        String getName = JOptionPane.showInputDialog(null, "Enter Employeer Name: \n" + "\n", "Input", JOptionPane.INFORMATION_MESSAGE);
        
        String getHours = JOptionPane.showInputDialog(null, "Input No. of Hours:\n"+"\n", "Input", JOptionPane.INFORMATION_MESSAGE);
        
        String getStatus = JOptionPane.showInputDialog(null, "Input status code: "
                + "\n"
                + "1. Regular"
                + "\n"
                + "2. Probationary"
                + "\n"
                + "3. Part time"
                +"\n"
                + "\n", "Input", JOptionPane.INFORMATION_MESSAGE);
        
        int hours = Integer.parseInt(getHours);
        int status = Integer.parseInt(getStatus);
        
        
        if(status==1){
            JOptionPane.showMessageDialog(null, "Employee name: " + getName
                            + "\n"
                            + "Status " + reg
                            + "\n"
                            + "Per hour: "+ regVal
                            + "\n"
                            + "No. of hours rate: "+ hours
                            + "\n"
                            + "Net Salary:"+ (hours*regVal), "Input", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(status==2){
            JOptionPane.showMessageDialog(null, "Employee name: " + getName
                            + "\n"
                            + "Status " + prob
                            + "\n"
                            + "Per hour: "+ probVal
                            + "\n"
                            + "No. of hours rate: "+ hours
                            + "\n"
                            + "Net Salary: "+ (hours*probVal), "Input", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(status==3){
            JOptionPane.showMessageDialog(null, "Employee name: " + getName
                            + "\n"
                            + "Status " + part
                            + "\n"
                            + "Per hour: "+ partVal
                            + "\n"
                            + "No. of hours rate: "+ hours
                            + "\n"
                            + "Net Salary: "+ (hours*partVal), "Input", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
