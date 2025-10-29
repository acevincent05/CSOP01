/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Student
 */
public class oop3 {
    
    public static void main(String[] args) 
    {
        Arithmetic operators = new Arithmetic();
        
        System.out.print("First nubmer = " + operators.firstNumber + "\n");
        System.out.print("Second nubmer = " + operators.secondNumber + "\n");
    }
    
}

class Arithmetic 
{
        int firstNumber;
        int secondNumber;
        
        Arithmetic()
                {
                    firstNumber = 100;
                    secondNumber = 200;
                }
    }
