package lesson4.task5;

public class BookTest {

    public static void main(String[] args) {

        Book book1 = new Book("Java", new Author("Gerbert Shildt"));
        Book book2 = book1.clone();

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());

        System.out.println();

        book2.getAuthor().setName("Robert Martin");
        book2.setName("Clean Code");

        System.out.println(book1.getName());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor().getName());
    }
}
