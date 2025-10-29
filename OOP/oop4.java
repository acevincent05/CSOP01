/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class oop4 {
    
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        int firstInput, secondInput, sum;
        
        System.out.print("Enter a number: ");
        firstInput = input.nextInt();
        System.out.print("Enter a number: ");
        secondInput = input.nextInt();
        
        Arithmetic operators = new Arithmetic(firstInput, secondInput);
        System.out.print("SUM: " + operators.sum + "\n");
    }
    
}

class Arithmetic 
{
        int firstNumber;
        int secondNumber;
        int sum;
        
        Arithmetic()
                {
                    firstNumber = 100;
                    secondNumber = 200;
                }
        
        Arithmetic(int inputOne, int inputTwo)
                {
                    sum = inputOne + inputTwo;
                }
    }
