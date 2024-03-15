package com.mycompany.computerlab;
import java.util.Scanner;

/**
 * System to manage computer lab stations, allowing users to login, logout, and check the status of computer stations
 * @author jmalinverno
 */
public class ComputerLab {
    private static final int NUMBER_OF_LABS = 4; // Constant for the total number of labs
    private static final int[] STATIONS_PER_LAB = {5, 6, 4, 3}; // Array holding the number of stations in each lab
    private Integer[][] labs; // 2D array

    public ComputerLab() {
        // 2D array with a variable number of stations for each lab
        labs = new Integer[NUMBER_OF_LABS][]; 
        for (int i = 0; i < NUMBER_OF_LABS; i++) {
            labs[i] = new Integer[STATIONS_PER_LAB[i]];
        }
    }
    
    public static void main(String[] args) {
        ComputerLab manager = new ComputerLab(); // New instance to manage the lab sessions
        Scanner scanner = new Scanner(System.in); 
        int choice; 

        // Main loop to display the menu and process user actions
        do {
            manager.displayLabs(); // Display the current status of labs
            System.out.println("MAIN MENU\n0) Quit\n1) Simulate login\n2) Simulate logoff\n3) Search");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Reads the user's choice 

            // Process the user's menu choice
            switch (choice) {
                case 1:
                    manager.simulateLogin(scanner); // User login 
                    break;
                case 2:
                    manager.simulateLogoff(scanner); // User logoff
                    break;
                case 3:
                    manager.searchUser(scanner); // Search for the user
                    break;
            }
        } while (choice != 0); // Will continue until user chooses to quit
        
        scanner.close();
    }

    private void simulateLogin(Scanner scanner) {
            System.out.print("Enter the 5 digit ID number of the user logging in: ");
            int userId = scanner.nextInt(); // Read the user ID from the console
            System.out.print("Enter the lab number the user is logging in from (1-4): ");
            int labNumber = scanner.nextInt() - 1; // Read the lab number and adjust for zero-based indexing
            System.out.print("Enter computer station number the user is logging in to: ");
            int stationNumber = scanner.nextInt() - 1; // Read the station number and adjust for zero-based indexing

        // Check if the station number is valid
        if (stationNumber >= 0 && stationNumber < labs[labNumber].length) {
            labs[labNumber][stationNumber] = userId; // Assign the user ID to the specified station
            System.out.println("User " + userId + " logged in at lab " + (labNumber + 1) + ", station " + (stationNumber + 1)); // Confirmation message displays on screen
        } else {
            System.out.println("Invalid station number."); // Show error message if number is invalid
        }
    }

    private void simulateLogoff(Scanner scanner) {
        System.out.print("Enter the 5 digit ID number of the user to log off: ");
        int userId = scanner.nextInt(); 
        
        for (int lab = 0; lab < labs.length; lab++) {
            for (int station = 0; station < labs[lab].length; station++) {
                // Check if the user being logged off is at this station
            if (labs[lab][station] != null && labs[lab][station].equals(userId)) {
                labs[lab][station] = null; // Log off the user by setting the station to null
                System.out.println("User " + userId + " is logged off."); // Confirmation message
                return; // Return after logging off the user
                }
            }
        }
        System.out.println("User not found or already logged off.");
    }
    
    private void searchUser(Scanner scanner) {
        System.out.print("Enter the 5 digit ID number of the user to find: ");
        int userId = scanner.nextInt(); // Read the user ID from the console

        // Iterate over each lab
        for (int lab = 0; lab < labs.length; lab++) {
            for (int station = 0; station < labs[lab].length; station++) {
                // Check if station is occupied by the user being searched
                if (labs[lab][station] != null && labs[lab][station].equals(userId)) {
                    System.out.println("User " + userId + " is logged in at lab " + (lab + 1) + ", station " + (station + 1)); // If user is found, show a message indicating the user's location
                    return; 
                }
            }
        }
        // If the user hasn't been found, let the user know
        System.out.println("None.");
    }

    private void displayLabs() {
        System.out.println("Lab #\tComputer Stations"); 
        // Iterate through each lab
        for (int i = 0; i < labs.length; i++) {
            System.out.print((i + 1) + "\t"); 
            for (int j = 0; j < labs[i].length; j++) {
                System.out.print((j + 1) + ": "); // Print the station number
                if (labs[i][j] == null) {
                    System.out.print("empty "); // Indicate the station is not in use
                } else {
                    System.out.print(labs[i][j] + " "); // If it's not empty, print the ID number of the user logged into the station
                }
            }
        System.out.println(); // New line character after each lab's status to start a new line
        }
    }
}