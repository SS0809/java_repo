import java.util.Scanner;
public class basic_ops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        performOperations(num1, num2);
        scanner.close();
    }
    private static void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
    }
    private static void divide(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
    private static void performOperations(double num1, double num2) {
        // Add method 
        // Subtract method 
        // Multiply method 
        // Divide method 
    }
}
