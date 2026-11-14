
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book
    public boolean addBook(Book book) {

        if (book == null || book.getId() <= 0) {
            return false;
        }

        if (findBook(book.getId()) != null) {
            return false;
        }

        books.add(book);
        return true;
    }

    // Find a book
    public Book findBook(int id) {

        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }

        return null;
    }

    // Display all books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (Book book : books) {
            book.displayInfo();
        }
    }

    // Remove a book
    public boolean removeBook(int id) {

        Book book = findBook(id);

        if (book == null || !book.isAvailable()) {
            return false;
        }

        books.remove(book);
        return true;
    }

    // Borrow a book
    public boolean borrowBook(int id) {

        Book book = findBook(id);

        if (book == null) {
            return false;
        }

        return book.borrowBook();
    }

    // Return a book
    public boolean returnBook(int id) {

        Book book = findBook(id);

        if (book == null) {
            return false;
        }

        return book.returnBook();
    }
}
