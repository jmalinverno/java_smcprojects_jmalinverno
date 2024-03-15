/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seasons;

import java.util.Scanner;

/**
 * Determine the season based on a given date
 * @author jmalinverno
 */
public class Seasons 
{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // While loop to interact with user's input
        while (true) {
            System.out.print("Find out the season on the given date (use month day format) or type 'Quit' to exit: ");
            String monthStr = input.next();

            // If user types 'Quit', the program will close
            if (monthStr.equalsIgnoreCase("Quit")) {
                break;
            }
            
            // If the input does not meet the cases above, it will display 'Invalid'
            if (!input.hasNextInt()) {
            System.out.println("Invalid");
            input.nextLine();
            continue;
            }
            
            int dayInt = input.nextInt();
            System.out.println(getSeason(monthStr, dayInt)); // Display the corresponding season for the given month and day
        }

        input.close();
    }
  
// Returns the season for the given month and day
private static String getSeason(String monthStr, int dayInt) {
    switch (monthStr.toLowerCase()) {
    case "january":
        if (dayInt >= 1 && dayInt <= 31) {
            return "Winter";
        }
        break;
    case "february":
        if (dayInt >= 1 && dayInt <= 29) {
            return "Winter";
        }
        break;
    case "march":
        if (dayInt >= 1 && dayInt <= 19) {
            return "Winter";
        } else if (dayInt >= 20 && dayInt <= 31) {
            return "Spring";
        }
        break;
    case "april":
        if (dayInt >= 1 && dayInt <= 30) {
            return "Spring";
        }
        break;
    case "may":
        if (dayInt >= 1 && dayInt <= 31) {
            return "Spring";
        }
        break;
    case "june":
        if (dayInt >= 1 && dayInt <= 20) {
            return "Spring";
        } else if (dayInt <= 30) {
            return "Summer";
        }
        break;
    case "july":
        if (dayInt >= 1 && dayInt <= 31) {
            return "Summer";
        }
        break;
    case "august":
        if (dayInt >= 1 && dayInt <= 31) {
            return "Summer";
        }
        break;
    case "september":
        if (dayInt >= 1 && dayInt <= 21) {
            return "Summer";
        } else if (dayInt <= 30) {
            return "Fall";
        }
        break;
    case "october":
        if (dayInt >= 1 && dayInt <= 31) {
            return "Fall";
        }
        break;
    case "november":
        if (dayInt >= 1 && dayInt <= 30) {
            return "Fall";
        }
        break;
    case "december":
        if (dayInt >= 1 && dayInt <= 20) {
            return "Fall";
        } else if (dayInt <= 31) {
            return "Winter";
        }
        break;
        }
        return "Invalid";
    }
}