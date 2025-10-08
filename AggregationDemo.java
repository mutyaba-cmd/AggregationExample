
// File: AggregationDemo.java

import java.util.ArrayList;
import java.util.List;

// Aggregated Class: Book
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }
}

// Container Class: Library (has a collection of Books)
class Library {
    private String name;
    private List<Book> books; // aggregation relationship

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void showLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

// Main class to demonstrate aggregation
public class AggregationDemo {
    public static void main(String[] args) {
        // Books exist independently of the library
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
        Book book2 = new Book("The 7 Habits of Highly Effective People", "Stephen Covey");
        Book book3 = new Book("Think and Grow Rich", "Napoleon Hill");

        // Create a library (container)
        Library library = new Library("City Central Library");

        // Add some books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Show books managed by the library
        library.showLibraryBooks();

        // Show that books still exist outside the library
        System.out.println("\nBook existing independently:");
        book3.displayBook();
    }
}
