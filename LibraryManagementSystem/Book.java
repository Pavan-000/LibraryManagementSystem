enum BookStatus{
    AVAILABLE,
    BORROWED, 
}

class Book {
    private String title;
    private String author;
    private BookStatus status;
    private String isbn;
    private String category;

    public Book(String title, String author, String isbn, String category) {
        this.title = title;
        this.author = author;
        this.status = BookStatus.AVAILABLE;
        this.isbn = isbn;
        this.category = category;
    }
    public void borrow(){
        this.status = BookStatus.BORROWED;
    }
    public void returned(){
        this.status = BookStatus.AVAILABLE;
    }
    public boolean isAvailable() {
        return this.status == BookStatus.AVAILABLE;
    }

    // Getters for the book attributes
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }
    public BookStatus geStatus() {
        return status;
    }
}
