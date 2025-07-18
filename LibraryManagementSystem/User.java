import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String userId;
    private List<Book> borrowedBooks;
    
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }
    public void returnBook(Book book) {
        if(borrowedBooks.remove(book)) {
            book.returned();
            System.out.println(name + " returned the book: " + book.getTitle());
        }
        else {
            System.out.println("This book was not borrowed ");
        }
    }

}
