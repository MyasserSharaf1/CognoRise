/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author xps
 */


public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default status is available
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Methods to check out and return the book
    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been checked out.");
        } else {
            System.out.println("The book \"" + title + "\" is already checked out.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("The book \"" + title + "\" has been returned.");
        } else {
            System.out.println("The book \"" + title + "\" is already available.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Status: " + (isAvailable ? "Available" : "Checked Out");
    }
}

