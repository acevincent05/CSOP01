/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2na;

/**
 *
 * @author Student
 */
import java.util.*;
public class activity2_6 {

    static Scanner console=new Scanner(System.in);
    public static void main(String[] args) {
        
        String fName, lName, mI, course;
        int yrLvl;
        
        System.out.print("Last Name: ");
        lName=console.nextLine();
        
        System.out.print("First Name: ");
        fName=console.nextLine();
        
        System.out.print("Middle Initial: ");
        mI=console.next();
     
        System.out.print("Course: ");
        course=console.next();
        
        System.out.print("Year Level: ");
        yrLvl=console.nextInt();
        
        System.out.println("\nPRELIM GRADE");
        
        int att, rec, ass, quiz, seat, proj, ex;
        
        System.out.print("Attendance: ");
        att=console.nextInt();
                
        System.out.print("Recitation: ");
        rec=console.nextInt();
                
        System.out.print("Assignment: ");
        ass=console.nextInt();
                
        System.out.print("Quiz: ");
        quiz=console.nextInt();
        
        System.out.print("Seat work: ");
        seat=console.nextInt();
                
        System.out.print("Project: ");
        proj=console.nextInt();
        
        System.out.print("Exam: ");
        ex=console.nextInt();
        
        System.out.println("\nSTUDENT NAME: "+fName+" "+mI+" "+lName);
        System.out.println("COURSE: "+course);
        System.out.println("YEAR: "+yrLvl);
        System.out.println("PRELIM GRADE: "+((att*0.05)+(rec*0.05)+(ass*0.05)+(quiz*0.20)+(seat*0.10)+(proj*0.15)+(ex*0.40)));

        
    }
}

