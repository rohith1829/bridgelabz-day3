package library_system;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount >= books.length) {
            System.out.println("Library is full! Cannot add more books.");
            return;
        }
        books[bookCount] = book;
        bookCount++;
        System.out.println("Book \"" + book.getTitle() + "\" added successfully.");
    }

    public void issueBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].issueBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listAvailableBooks() {
        System.out.println("\n--- Available Books ---");
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (!books[i].isIssued()) {
                System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available.");
        }
    }
}

