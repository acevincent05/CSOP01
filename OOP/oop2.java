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
public class oop2 {
    
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    Arithmetic operators = new Arithmetic();
    int firstInput, secondInput, sum, index;
    int numberAdded[] = new int[5];
    
    operators.displayMessage();
    
    for(index=0; index<5; index++)
    {
        numberAdded[index] = index + operators.getSum(index, index);
        System.out.print(numberAdded[index] + "\n");
    }
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
