package com.mycompany.deliverytruck;

public class Package extends Mail {
    private Item[] items; // Array of Items in the package

    // Constructor to initialize Package with address and items
    public Package(String address, Item[] items) {
        this.address = address;
        this.items = items;
    }

    // Getter for items
    public Item[] getItems() {
        return items;
    }
}