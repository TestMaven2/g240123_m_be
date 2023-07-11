package lesson24.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Регистрация пользователя.
        // При регистрации пользователь должен указать свой возраст.
        // Запрещено регистрироваться пользователям младше 12 лет.
        // Запрещено регистрироваться пользователям старше 150 лет.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = Integer.parseInt(scanner.nextLine());
//        int age = scanner.nextInt();
        System.out.printf("Введённый возраст - %d\n", age);
        try {
            registration(age);
        } catch (TooBigAgeException e) {
            System.out.println("Возраст слишком большой");
        } catch (TooSmallAgeException e) {
            System.out.println("Возраст слишком маленький");
        }
    }

    public static void registration(int age) throws TooBigAgeException {
        if (age < 12) {
            throw new TooSmallAgeException();
        }
        if (age > 150) {
            throw new TooBigAgeException();
        }
        System.out.println("Регистрация пользователя прошла успешно.");
    }
}
