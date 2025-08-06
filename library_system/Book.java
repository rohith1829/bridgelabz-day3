package library_system;

public class Book {
    private String title;
    private String author;
    private boolean issued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book \"" + title + "\" issued successfully.");
        } else {
            System.out.println("Book \"" + title + "\" is already issued.");
        }
    }

    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book \"" + title + "\" returned successfully.");
        } else {
            System.out.println("Book \"" + title + "\" was not issued.");
        }
    }
}
