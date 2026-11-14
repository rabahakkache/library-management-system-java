
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Library library = new Library();

        int choice = -1;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add a book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book");
            System.out.println("4. Remove a book");
            System.out.println("5. Borrow a book");
            System.out.println("6. Return a book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("Enter book ID: ");
                        int id = Integer.parseInt(input.nextLine());

                        System.out.print("Enter book title: ");
                        String title = input.nextLine().trim();

                        System.out.print("Enter book author: ");
                        String author = input.nextLine().trim();

                        if (title.isEmpty() || author.isEmpty()) {
                            System.out.println("Title and author cannot be empty.");
                            break;
                        }

                        Book newBook = new Book(id, title, author);

                        if (library.addBook(newBook)) {
                            System.out.println("Book added successfully.");
                        } else {
                            System.out.println("Invalid ID or ID already exists.");
                        }
                        break;

                    case 2:
                        library.displayBooks();
                        break;

                    case 3:
                        System.out.print("Enter book ID: ");
                        id = Integer.parseInt(input.nextLine());

                        Book foundBook = library.findBook(id);

                        if (foundBook != null) {
                            foundBook.displayInfo();
                        } else {
                            System.out.println("Book not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter book ID: ");
                        id = Integer.parseInt(input.nextLine());

                        if (library.removeBook(id)) {
                            System.out.println("Book removed successfully.");
                        } else {
                            System.out.println("Book not found or currently borrowed.");
                        }
                        break;

                    case 5:
                        System.out.print("Enter book ID: ");
                        id = Integer.parseInt(input.nextLine());

                        if (library.borrowBook(id)) {
                            System.out.println("Book borrowed successfully.");
                        } else {
                            System.out.println("Book not found or already borrowed.");
                        }
                        break;

                    case 6:
                        System.out.print("Enter book ID: ");
                        id = Integer.parseInt(input.nextLine());

                        if (library.returnBook(id)) {
                            System.out.println("Book returned successfully.");
                        } else {
                            System.out.println("Book not found or was not borrowed.");
                        }
                        break;

                    case 0:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }

        } while (choice != 0);

        input.close();
    }
}
