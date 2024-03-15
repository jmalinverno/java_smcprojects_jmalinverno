/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathgame;

/**
 *
 * @author jmalinverno
 */
import java.util.Scanner;

public class MathGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Hi, I am really good at math! Put me to the test.");

        while (playAgain) {
            System.out.print("Please enter two numbers separated by a space and press Enter: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            System.out.print("Please enter one of the operations +, -, * or / and press Enter: ");
            char operator = scanner.next().charAt(0);

            double result = 0.0;
            String operation = "";

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    operation = "addition";
                    break;
                case '-':
                    result = num1 - num2;
                    operation = "subtraction";
                    break;
                case '*':
                    result = num1 * num2;
                    operation = "multiplication";
                    break;
                case '/':
                    result = num1 / num2;
                    operation = "division";
                    break;
                default:
                    System.out.println("I can compute really well, but what you entered is not one of the operations I know ...");
            }

            if (!operation.isEmpty()) {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                System.out.println("I'm great at " + operation + "!");
            }

            System.out.print("Play again [Y/N]?: ");
            char playChoice = scanner.next().charAt(0);
            playAgain = (playChoice == 'Y' || playChoice == 'y');
        }

        System.out.println("Bye bye!");
    }
}
