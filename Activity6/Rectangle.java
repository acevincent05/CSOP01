import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
    
    public void displayArea() {
        double area = calculateArea();
        System.out.println("\nThe area of the rectangle (" + length + " x " + width + ") is: " + area);
    }

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);  
    
    System.out.print("Enter the length of the rectangle: ");
    double inputLength = scanner.nextDouble();
    
    
    System.out.print("Enter the width of the rectangle: ");
    double inputWidth = scanner.nextDouble();
    
    Rectangle userRect = new Rectangle(inputLength, inputWidth);
    
    userRect.displayArea();
    
    scanner.close();
    }
}