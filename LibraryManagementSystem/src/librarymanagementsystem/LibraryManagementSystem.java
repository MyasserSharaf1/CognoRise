/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author xps
 */
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Library Management System!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Search by Title");
            System.out.println("3. Search by Author");
            System.out.println("4. Check Out a Book");
            System.out.println("5. Return a Book");
            System.out.println("6. Display All Books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    catalog.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter the title to search: ");
                    title = scanner.nextLine();
                    catalog.searchByTitle(title);
                    break;

                case 3:
                    System.out.print("Enter the author to search: ");
                    author = scanner.nextLine();
                    catalog.searchByAuthor(author);
                    break;

                case 4:
                    System.out.print("Enter the title to check out: ");
                    title = scanner.nextLine();
                    catalog.checkOutBook(title);
                    break;

                case 5:
                    System.out.print("Enter the title to return: ");
                    title = scanner.nextLine();
                    catalog.returnBook(title);
                    break;

                case 6:
                    catalog.displayAllBooks();
                    break;

                case 7:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}

