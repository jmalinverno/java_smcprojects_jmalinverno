package com.mycompany.deliverytruck;

public class Letter extends Mail {
    private String contents;

    // Constructor to initialize Letter with address and contents
    public Letter(String address, String contents) {
        this.address = address;
        this.contents = contents;
    }

    // Getter for contents
    public String getContents() {
        return contents;
    }
}
