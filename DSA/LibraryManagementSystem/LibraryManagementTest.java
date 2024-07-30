package LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementTest {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Sort Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Exit");
            System.out.println("************************************");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    System.out.println("Book added successfully.");
                    System.out.println("************************************");
                    break;

                case 2:
                    library.sortBooks();
                    System.out.println("Books sorted by title.");
                    System.out.println("************************************");
                    break;

                case 3:
                    System.out.print("Enter Book Title to search: ");
                    title = scanner.nextLine();
                    book = library.findBookByTitle(title);
                    if (book != null) {
                        String searchMethod = library.isSorted() ? "Binary Search" : "Linear Search";
                        System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor() + " (using " + searchMethod + ")");
                        System.out.println("************************************");
                    } else {
                        System.out.println("Book not found.");
                        System.out.println("************************************");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting Library Management System.");        
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
