/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author xps
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryCatalog {
    private ArrayList<Book> books;

    // Constructor
    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book \"" + title + "\" by " + author + " has been added to the catalog.");
    }

    // Method to search for books by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with the title \"" + title + "\".");
        }
    }

    // Method to search for books by author
    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by the author \"" + author + "\".");
        }
    }

    // Method to check out a book
    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.checkOut();
                return;
            }
        }
        System.out.println("The book \"" + title + "\" is not in the catalog.");
    }

    // Method to return a book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("The book \"" + title + "\" is not in the catalog.");
    }

    // Method to display all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            System.out.println("Books in the catalog:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

