package com.mycompany.deliverytruck;

public class DeliveryTruck {
    private Mail[] mails; // Array to store Mail objects
    private int count; // Count of Mail items loaded

    public DeliveryTruck() {
        mails = new Mail[10]; // Array with size 10
        count = 0; 
    }

    // Mail load: stores the given mail argument at the next available spot in the member variable
    public void load(Mail mail) {
        if (count >= mails.length) {
            System.out.println("Truck is full!"); // Check if the truck is full given it holds only 10 items
            return;
        }
        mails[count] = mail; // Add mail to array
        count++;
    }

    // Overrides toString() method to display packages and letters information that includes number of letter and packages
    @Override
    public String toString() {
        int numLetters = 0;
        int numPackages = 0;
        for (int i = 0; i < count; i++) {
            if (mails[i] instanceof Letter) {
                numLetters++;
            } else if (mails[i] instanceof Package) {
                numPackages++;
            }
        }
        return "The delivery truck is loaded with " + numLetters + " letters and " + numPackages + " packages.";
    }
}