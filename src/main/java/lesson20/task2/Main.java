package lesson20.task2;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        System.out.println("Начало работы программы");
        System.out.println("Вызываем метод div");
        System.out.println(div(8, 0));
        System.out.println("Конец работы программы");

    }

    public static int div(int x, int y) {
        System.out.println("Начало работы метода");

        System.out.println("Проверяем входящий параметр");
        if (y == 0) {
            System.err.println("Ошибка! Делитель не может равняться нулю.");
            y = 1;
        }
        int result = x / y;
        System.out.println("Конец работы метода");
        return result;
    }
}
