package lesson16.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // List<Person>, boolean isHealthy, Integer age
        // Вывести здоровых людей с чётным идентификатором, если isHealthy - true
        // Вывести нездоровых людей с нечётным идентификатором, если isHealthy - false
        // Выборка должна включать людей не старше переданного возраста

        List<Person> people = new ArrayList<>();

        people.add(new Person("Alex", 40, true, 27));
        people.add(new Person("Alexa", 2, true, 29));
        people.add(new Person("Alexis", 3, true, 22));
        people.add(new Person("Abbi", 4, false, 11));
        people.add(new Person("Britani", 20, true, 2));
        people.add(new Person("Sandra", 16, false, 7));
        people.add(new Person("Peter", 18, true, 59));
        people.add(new Person("Boris", 19, false, 45));
        people.add(new Person("Sergej", 11, false, 7));
        people.add(new Person("Nadja", 17, false, 26));

        CustomFilter filter = new CustomFilter();
        System.out.println("Первая выборка:");
        filter.print(people, true, 40);
        System.out.println();

        System.out.println("Вторая выборка:");
        filter.print(people, false, 40);
        System.out.println();

        PersonFilter filter2 = new PersonFilter() {
            @Override
            public void print(List<Person> list, boolean isHealthy, int age) {
                for (Person person : people) {

                    if (isHealthy) {
                        if (person.getId() % 2 == 0 && person.getAge() <= age && person.isHealthy()) {
                            System.out.println(person);
                        }
                    } else {
                        if (person.getId() % 2 != 0 && person.getAge() <= age && !person.isHealthy()) {
                            System.out.println(person);
                        }

                    }
                }
            }
        };

        System.out.println("Первая выборка с помощью анонимного класса:");
        filter2.print(people, true, 40);
        System.out.println();

        PersonFilter filter3 = (x, y, z) -> {
            for (Person person : x) {

                if (y) {
                    if (person.getId() % 2 == 0 && person.getAge() <= z && person.isHealthy()) {
                        System.out.println(person);
                    }
                } else {
                    if (person.getId() % 2 != 0 && person.getAge() <= z && !person.isHealthy()) {
                        System.out.println(person);
                    }
                }
            }
        };

        System.out.println("Первая выборка с помощью лямбда-выражения:");
        filter3.print(people, true, 40);
    }
}
