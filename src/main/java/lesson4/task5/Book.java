package lesson4.task5;

public class Book {

    private String name;
    private Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    private Book() {

    }

    public Book(Book book) {
        this.name = book.getName();
        this.author = new Author(book.getAuthor());
    }

    public Book clone() {
        Book book = new Book();
        book.setName(this.name);
        Author author1 = new Author(this.author);
        book.setAuthor(author1);
        return book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
