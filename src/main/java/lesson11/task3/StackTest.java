package lesson11.task3;

public class StackTest {

    public static int value = 0;

    public static void main(String[] args) {
        first();
    }

    public static void first() {
        second();
    }

    public static void second() {
        third();
    }

    public static void third() {

        fourth();
        if (value == 0) {
            throw new RuntimeException("Ошибка в третьем методе");
        }

    }

    public static void fourth() {
        System.out.println("Вызван четвёртый метод.");
//        throw new RuntimeException("Ошибка в четвёртом методе.");
    }
}
