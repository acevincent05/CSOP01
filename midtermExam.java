/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
/**
 *
 * @author Ace Gamitin
 */
import javax.swing.JOptionPane;
public class midtermExam {
    
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        // get number from user input
        for(int i=0; i<=4;i++){
            String get_input = JOptionPane.showInputDialog(null, "Enter number " + (i+1) + ": ");
            int input = Integer.parseInt(get_input);
            
            arr[i] = input;
        }
        
        // get reverse order of the numbers
        
        String reversed = "";
        
        for(int i=4; i>=0; i--){
            int num = arr[i];
            reversed += num + " ";
        }
        
        // get the even numbers
        
        String even = "";
        
        for(int i=0; i<=4;i++){
            int num = arr[i];
            if(num%2==0){
                even += num + " ";
            }
        }
        
        // get the average
        
        double sum = 0;
        
        for(int i=0; i<=4;i++){
            int num = arr[i];
            sum += num;
        }
        
        double avg = (sum/5);
        
        // get largest and second largest
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // update both
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                // update only second largest
                secondLargest = num;
            }
        }
        
        String greaterAvg = "";
        
        for(int i=0; i<=4;i++){
            int num = arr[i];
            if(num>avg){
                greaterAvg += num + " ";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Reversed order: " + reversed
                        + "\n"
                        + "\n"
                        + "Even numbers: " + even
                        + "\n"
                        + "\n"
                        + "Average: " + avg
                        + "\n"
                        + "\n"
                        + "Largest: " + largest
                        + "\n"
                        + "\n"
                        + "Second Largest: " + secondLargest
                        + "\n"
                        + "\n"
                        + "Numbers greater than average: " + greaterAvg
                        );
    }
    
}
