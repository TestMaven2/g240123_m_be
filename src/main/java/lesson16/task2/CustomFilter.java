package lesson16.task2;

import java.util.List;

public class CustomFilter implements PersonFilter{

    @Override
    public void print(List<Person> people, boolean isHealthy, int age) {
        // List<Person>, boolean isHealthy, Integer age
        // Вывести здоровых людей с чётным идентификатором, если isHealthy - true
        // Вывести нездоровых людей с нечётным идентификатором, если isHealthy - false
        // Выборка должна включать людей не старше переданного возраста

        for (Person person : people) {
            if (isHealthy) {
                if (person.getId() %2 == 0 && person.getAge() <= age && person.isHealthy()) {
                    System.out.println(person);
                }
            } else {
                if (!person.isHealthy() && person.getId() %2 != 0 && person.getAge() <= age) {
                    System.out.println(person);
                }
            }
        }
    }
}
