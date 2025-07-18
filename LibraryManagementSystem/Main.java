public class Main {
    public static void main(String[] args) {
       Library lib = new Library();

       Book book1 = new Book("DSA in Java", "Kunal", "123", "Programming");
       Book book2 = new Book("Java Basics", "Martin", "456", "Programming");

       Admin admin = new Admin("Pavan", "admin001");
       admin.addBook(book1, lib);
       admin.addBook(book2, lib);

       User user = new User("Sai", "user001");
       user.borrowBook(book1);
       user.borrowBook(book1);
       user.returnBook(book1);
    }

}