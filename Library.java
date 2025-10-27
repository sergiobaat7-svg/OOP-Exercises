import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(String book) {
        books.add(book);
        System.out.println("\"" + book + "\" has been added to the library.");
    }

    // Remove a book from the library
    public boolean removeBook(String book) {
        if (books.remove(book)) {
            System.out.println("\"" + book + "\" has been removed from the library.");
            return true;
        } else {
            System.out.println("\"" + book + "\" was not found in the library.");
            return false;
        }
    }

    // Get the list of all books
    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Love One");
        library.addBook("Batang aswang");
        library.addBook("Fighting of Cars");
        
        System.out.println("Books in library: " + library.getBooks());

        library.removeBook("Batang aswang");
        System.out.println("Books in library after removal: " + library.getBooks());

        library.removeBook("Love us"); // not in library
    }
}