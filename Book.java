import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Static inner class to manage a collection of books
    public static class BookCollection {
        private List<Book> books = new ArrayList<>();

        // Add a book to the collection
        public void addBook(Book book) {
            books.add(book);
        }

        // Remove a book from the collection by ISBN
        public boolean removeBook(String isbn) {
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book book = iterator.next();
                if (book.getIsbn().equals(isbn)) {
                    iterator.remove();
                    return true;
                }
            }
            return false;
        }

        // List all books
        public void listBooks() {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() +
                                   ", Author: " + book.getAuthor() +
                                   ", ISBN: " + book.getIsbn());
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        Book book1 = new Book("Lostboy", "Sergio Baat", "12345678901234");
        Book book2 = new Book("The greate Man", "Sarge Ba-at", "12345612345612");

        collection.addBook(book1);
        collection.addBook(book2);

        System.out.println("Books in collection:");
        collection.listBooks();

        System.out.println("\nRemoving book with ISBN 43210987654321...");
        collection.removeBook("9780451524935");

        System.out.println("\nBooks in collection after removal:");
        collection.listBooks();
    }
}