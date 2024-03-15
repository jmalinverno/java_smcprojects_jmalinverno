/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fileprocessing;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author jmalinverno
 */
public class FileProcessing {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for input and output file names
        System.out.print("Enter the name of the input file: ");
        String infileName = scanner.nextLine();

        System.out.print("Enter the output file name: ");
        String outfileName = scanner.nextLine();

        // Opening the input file
        File infile = new File(infileName);
        Scanner input = new Scanner(infile);

        // Opening the output file
        File outfile = new File(outfileName);
        PrintWriter pr = new PrintWriter(outfile);

        int totalVowels = 0;
        int totalWords = 0;

        while (input.hasNext()) {
            String line = input.nextLine();
            totalVowels += getVowels(line);
            totalWords += getWords(line);
    }

        // Closing the files
        input.close();

        // Prints the results to the console and the output file
        String result = "Total vowels: " + totalVowels + ", Total words: " + totalWords;
        System.out.println(result);
        pr.println(result);
        pr.close();
    }

    // Counts the number of vowels in the string.
    public static int getVowels(String line) {
        int count = 0;
        String vowels = "aeiou";
    
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.toLowerCase().charAt(i);
            if (vowels.contains(Character.toString(currentChar))) {
                count++;
            }
        }
        return count;
    }

    // Counts the number of words in the string.
    public static int getWords(String line) {
        String[] words = line.split("\\s+");
        return words.length;
    }
}