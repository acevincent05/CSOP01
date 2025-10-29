/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ace Gamitin
 */
public abstract class EmployeeInformation {
    private String empID, empName, empDept, empStatus;
    private double salaryAmount;
    
    public EmployeeInformation(String inputID, String inputName, String inputDept, String inputStatus, double inputSalary){
        empID = inputID;
        empName = inputName;
        empDept = inputDept;
        empStatus = inputStatus;
        salaryAmount = inputSalary;
    }
    
    public void displayInformation(){
        JOptionPane.showMessageDialog(
            null,
            "ID: " + empID +
            "\nName: " + empName +
            "\nDepartment: " + empDept +
            "\nStatus: " + empStatus +
            "\nSalary: " + salaryAmount,
            "SALARY INFORMATION",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
