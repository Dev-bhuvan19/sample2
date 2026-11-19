
package org.example;

class Book {
    int bookId;
    String bookName;
    String authorName;
    String availabilityStatus;

    // Constructor
    Book(int id, String name, String author, String status) {
        bookId = id;
        bookName = name;
        authorName = author;
        availabilityStatus = status;
    }

    // Display book details
    void displayDetails() {
        System.out.println("--------------------------------");
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Availability Status: " + availabilityStatus);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating book objects with predefined values
        Book book1 = new Book(101, "Java Programming",
                "James Gosling", "Available");

        Book book2 = new Book(102, "Python Programming",
                "Guido van Rossum", "Not Available");

        Book book3 = new Book(103, "C Programming",
                "Dennis Ritchie", "Available");

        Book book4 = new Book(104, "Data Structures",
                "Mark Allen Weiss", "Available");

        Book book5 = new Book(105, "Operating Systems",
                "Abraham Silberschatz", "Not Available");

        // Store books in an array
        Book[] books = {book1, book2, book3, book4, book5};

        // Display all book details
        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");
        System.out.println("===== BOOK DETAILS =====");

        for (Book book : books) {
            book.displayDetails();
        }

        System.out.println("--------------------------------");
        System.out.println("Total Number of Books: " + books.length);
    }
}
