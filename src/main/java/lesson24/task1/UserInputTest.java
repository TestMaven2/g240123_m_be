package lesson24.task1;

import java.util.Scanner;

public class UserInputTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        System.out.println("Введите возраст:");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Введено не число.");
            age = -1;
        }

        System.out.printf("Имя - %s, возраст - %d", name, age);
    }
}
