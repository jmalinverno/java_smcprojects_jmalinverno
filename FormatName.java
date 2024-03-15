/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.format.name;
import java.util.Scanner;

/**
 * Change the format name given by the user
 * @author jmalinverno
 */
public class FormatName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstName middleName lastName separated by at least one blank. It may have more than one blank separating firstName middleName lastName.");

        // Stores the user's input into the string 'line'
        String line = input.nextLine();
        
        // Removes the whitespaces and pass it to the function 'formatName' 
        System.out.println(formatName(line.trim()));
    }

    private static String formatName(String name) {
        int firstBlank = name.indexOf(' ');  // Get the first blank (whitespace)
        String fName = name.substring(0, firstBlank);
        String nameRemainder = name.substring(firstBlank).trim();  // Trim any extra whitespace
        
        int secondBlank = nameRemainder.indexOf(' ');
        
        // Condition to check second blank space. If none, then there's no middle name
        if (secondBlank == -1) {
            return nameRemainder + ", " + fName.charAt(0) + ".";
        } 
        else {
            String mName = nameRemainder.substring(0, secondBlank);
            String lName = nameRemainder.substring(secondBlank).trim(); // Trim any extra whitespace
            
            return lName + ", " + fName.charAt(0) + "." + mName.charAt(0) + ".";
        }
    }
}