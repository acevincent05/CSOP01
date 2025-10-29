import java.util.ArrayList;
import java.util.Scanner;

public class Activity6_1 {


    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Integer> even_num = new ArrayList<>();
    public static ArrayList<Integer> odd_num = new ArrayList<>();

    public static void seperateOddEven(int number) {
        if (number % 2 == 0) {
            even_num.add(number);
        } else {
            odd_num.add(number);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter how many numbers you want to store: ");
        
        if (!input.hasNextInt()) {
            System.out.println("Invalid input for size. Exiting.");
            input.close();
            return; 
        }
        
        int size = input.nextInt();
        
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter number " + i + " of " + size + ": ");
            int num = input.nextInt();
            seperateOddEven(num);
        }

        System.out.println("\nEven Numbers: " + even_num);
        System.out.println("Odd Numbers: " + odd_num);

        input.close();
    }
}