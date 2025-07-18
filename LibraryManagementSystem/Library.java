import java.util.ArrayList;
import java.util.List;

class Library{
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchByCategory(String category){
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if(book.getCategory().equalsIgnoreCase(category)){
                result.add(book);
            }
        }
        return result;
    }
}
