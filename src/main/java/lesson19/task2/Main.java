package lesson19.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student = new Student(1, "Bob");
        Student student1 = new Student(2, "Rob");
        Student student2 = new Student(3, "John");

        student.addBook("Java basic");
        student.addBook("Java pro");
        student.addBook("Spring");
        student.addBook("Python");

        student1.addBook("HTML");
        student1.addBook("CSS");
        student1.addBook("JavaScript");
        student1.addBook("Spring");

        student2.addBook("Python");
        student2.addBook("C++");
        student2.addBook("C#");

        students.add(student);
        students.add(student1);
        students.add(student2);

        // Вывести список книг, прочитанных всеми студентами
        // и не содержащих подстроку Java

        Set<String> books = students.stream() // получаем стрим студентов
                .map(x -> x.getBooks()) // получаем стрим списков книг
                .flatMap(x -> x.stream()) // получаем стрим книг
                .filter(x -> !x.contains("Java")) // фильтруем наши книги
                .collect(Collectors.toSet());

        System.out.println(books);
    }
}
