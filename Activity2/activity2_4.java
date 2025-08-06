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
public class activity2_4 {
    static Scanner console=new Scanner(System.in);
    public static void main(String[] args) {
        
        int num1;
        
        System.out.print("Input the number of seconds to convert: ");
        num1=console.nextInt();
        
        int min = num1/60;
        int secs = num1%60;
        
        System.out.println("Equivalent is "+min+" minutes and "+secs+" seconds.");
    }
}

