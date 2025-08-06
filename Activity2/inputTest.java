/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author Student
 */
import java.util.*;

public class inputTest {
    static Scanner console=new Scanner(System.in);
    public static void main(String[] args) {
        
        String name, course;
        int age;
        double grade;
        
        System.out.print("Enter your name: ");
        name=console.nextLine();
        
        System.out.print("Enter your course: ");
        course=console.next();
                
        System.out.print("Enter your age: ");
        age=console.nextInt();
        
        System.out.print("Enter your grade: ");
        grade=console.nextDouble();
        
        System.out.println("Hello "+name+". You are currently enrolled as "+course+" student. You are "+age+" years old. \nYou got"+" the grade of"+grade);
        
    }
}
