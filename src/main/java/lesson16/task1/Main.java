package lesson16.task1;

import lesson2.task2.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Борис", 25, 3, 4.76, Gender.MALE));
        students.add(new Student("Ирэн", 32, 3, 4.82, Gender.FEMALE));
        students.add(new Student("Николай", 22, 4, 3.91, Gender.MALE));
        students.add(new Student("Дмитрий", 29, 1, 4.23, Gender.MALE));
        students.add(new Student("Валерия", 21, 3, 4.63, Gender.FEMALE));
        students.add(new Student("Оксана", 28, 2, 3.19, Gender.FEMALE));
        students.add(new Student("Алексей", 30, 5, 4.85, Gender.MALE));

        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        // Вывести студентов, у которых курс больше 1 и средний балл выше 4.5
        System.out.println("Отфильтрованные студенты при помощи фильтра StudentFilter");
        StudentUtils.printStudents(students, new StudentFilter());
        System.out.println();

        // Вывести студентов женского пола с буквой "и" в имени. Регистр не учитывать.
        System.out.println("Отфильтрованные студенты при помощи фильтра SecondFilter");
        StudentUtils.printStudents(students, new SecondFilter());
        System.out.println();

        // Вывести студентов, у которых балл 4.3 либо ниже и возраст 25 либо ниже
        System.out.println("Студенты, отфильтрованные при помощи анонимного класса");
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getAverageRate() <= 4.3 && student.getAge() <= 25;
            }
        });
        System.out.println();

        // Вывести студентов мужского пола с курсом меньше 5
        System.out.println("Студенты, отфильтрованные при помощи второго анонимного класса");
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() < 5 && student.getGender().equals(Gender.MALE);
            }
        });
        System.out.println();

        // Вывести студентов третьего курса с длиной имени менее 7
        System.out.println("Студенты, отфильтрованные при помощи лямбда-выражения");
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() == 3 && student.getName().length() < 7;
            }
        });
        StudentUtils.printStudents(students, x -> x.getCourse() == 3 && x.getName().length() < 7);

        // Создание анонимного класса на базе абстрактного класса
        Animal animal = new Animal() {
            @Override
            public void live() {
                // Здесь пишем реализацию
            }
        };
    }
}