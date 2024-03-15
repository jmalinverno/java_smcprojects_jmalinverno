package com.mycompany.calculator;
import java.util.Scanner;

/**
 * Simple calculator to perform + - * /
 * @author jmalinverno
 */
public class Calculator {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do
        {
            // Print the introductory message
            System.out.println("Hi, I am really good at math! Put me to the test.");
            
            // Requests user to input numbers
            System.out.print("Please enter two numbers and then press Enter: ");
            // Using double since it gives the largest range of numbers + decimals
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            
            // Requests the user to input operation
            System.out.print("Please enter one of the operations +, -, * or / and press Enter: ");
            char operation = scanner.next().charAt(0);

            // Logical if-else to do the operation based on the symbol input by the user
            // Numbers are formatted to display three decimal places as floating-point numbers
            if (operation == '+') {
                System.out.printf("%.3f + %.3f = %.3f\n", num1, num2, num1 + num2);
                System.out.println("I'm great at addition!");
            } else if (operation == '-') {
                System.out.printf("%.3f - %.3f = %.3f\n", num1, num2, num1 - num2);
                System.out.println("I'm great at subtraction!");
            } else if (operation == '*') {
                System.out.printf("%.3f * %.3f = %.3f\n", num1, num2, num1 * num2);
                System.out.println("I'm great at multiplication!");
            } else if (operation == '/') {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    System.out.printf("%.3f / %.3f = %.3f\n", num1, num2, num1 / num2);
                    System.out.println("I'm great at division!");
                }
            } else {
                System.out.println("I can compute really well, but what you entered is not one of the operations I know ...");
            }
            
            // Checks if the user wants to keep using the calculator
            System.out.print("Play again [Y/N]?: ");
            char playAgain = scanner.next().charAt(0);
            if (playAgain == 'N' || playAgain == 'n') {
                System.out.println("Bye bye!");
                break;
            }
            
        } while (true);
        
    }
}
