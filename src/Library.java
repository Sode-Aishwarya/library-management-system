import java.util.ArrayList;

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    void viewBooks() {

        for (Book book : books) {
            book.displayBook();
        }

    }

    void issueBook(int id) {

        for (Book book : books) {
            if (book.id == id && !book.isIssued) {
                book.isIssued = true;
                System.out.println("Book issued");
                return;
            }
        }

        System.out.println("Book not available");

    }

    void returnBook(int id) {

        for (Book book : books) {
            if (book.id == id && book.isIssued) {
                book.isIssued = false;
                System.out.println("Book returned");
                return;
            }
        }

        System.out.println("Invalid book id");

    }

}