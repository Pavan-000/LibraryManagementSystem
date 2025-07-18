class Admin extends User {
    public Admin(String name, String userId) {
        super(name, userId);
    }
    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println("Admin added the book: " + book.getTitle());
    }

    public void removeBook(Book book, Library library) {
        library.removeBook(book);
        System.out.println("Admin removed the book: " + book.getTitle());
    }
    
}
