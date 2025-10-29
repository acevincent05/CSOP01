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
public class activity2_5 {
    static double capp = 95, moc = 90, van = 105;
    static Scanner console=new Scanner(System.in);
    public static void main(String[] args) {
        
        int cappNum, mocNum, vanNum;
        
        System.out.println("JAVA CAFE");    
        System.out.println("Cappucino: "+capp);
        System.out.println("Mocha: "+moc);
        System.out.println("Vanilla: "+van);
        
        System.out.print("\nInput the number of orders for Cappucino: ");
        cappNum=console.nextInt();
        
        System.out.print("Input the number of orders for Mocha: ");
        mocNum=console.nextInt();
        
        System.out.print("Input the number of orders for Vanilla: ");
        vanNum=console.nextInt();
        
        System.out.println("\nORDERS");    
        System.out.println("Cappucino: "+cappNum);
        System.out.println("Mocha: "+mocNum);
        System.out.println("Vanilla: "+vanNum);
        
        System.out.println("\nAMOUNT OF ORDERS");  
        System.out.println("Cappucino: "+(cappNum*capp));
        System.out.println("Mocha: "+(mocNum*moc));
        System.out.println("Vanilla: "+(vanNum*van));
        
        System.out.println("\nTOTAL AMOUNT: "+((cappNum*capp)+(mocNum*moc)+(vanNum*van)));
        
        double cash;
        
        System.out.print("CASH: ");
        cash=console.nextInt();
        System.out.println("CHANGE: "+(cash-((cappNum*capp)+(mocNum*moc)+(vanNum*van))));
        
    }
}

