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
public class oop1 {
    
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
    Arithmetic operators = new Arithmetic();
    int firstInput, secondInput, sum;
    
    operators.displayMessage();
    
    System.out.print("Enter a number: ");
    firstInput = input.nextInt();
    System.out.print("Enter a number: ");
    secondInput = input.nextInt();
    
    sum=operators.getSum(firstInput, secondInput);
    System.out.print(firstInput+ " + " + secondInput+ " = " + sum + "\n"); 
    }
    
}

class Arithmetic 
{
    void displayMessage()
    {
        System.out.print("ADDITION" + "\n");
    }
    int getSum(int firstNumber, int secondNumber)
    {
        int sum;
        sum = firstNumber + secondNumber;
        return sum;
    }
}
