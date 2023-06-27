package lesson20.task1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.print("One! ");
        System.out.print("Two! ");
        System.out.print("Three!");

        System.out.println();

        System.out.println("One!");
        System.out.println("Two!");
        System.out.println("Three!");

        System.out.println();

        System.out.println("Символы %n и \\n переносит курсор на следующую строку");
        System.out.printf("One%nTwo%nThree\n");
        System.out.println();

        System.out.println("Подставляем в строку целочисленную переменную");
        int a = 5;
        int b = 3;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, a + b);
        System.out.println();

        System.out.println("Подставляем в строку ещё одну строку");
        String s = "Hi guys!";
        System.out.printf("String - %.2S\n", s);
        System.out.println();

        System.out.println("Подставляем в строку дробное число");
        System.out.printf("Число ПИ равно %f\n", Math.PI);
        System.out.printf("Число ПИ округлённое равно %.3f\n", Math.PI);
        System.out.println();

        System.out.println("Подстановка в строку boolean-значений");
        boolean bool = true;
        System.out.printf("Результат - %b\n", a > b);
        System.out.printf("Результат - %B\n", bool);
        System.out.printf("Результат - %B\n", 7);
        System.out.printf("Результат - %b\n", "Hello!");
        System.out.printf("Результат - %B\n", null);
        System.out.println();

        System.out.println("Подстановка в строку символов");
        char c = 'a';
        System.out.printf("Символ - %c\n", c);
        System.out.printf("Символ - %C\n", c);
        System.out.println();

        System.out.println("Ещё возможность для дробных чисел");
        double d1 = 1234.567;
        double d2 = 123456.78912345;
        System.out.printf("%50.3f\n", d1);
        System.out.printf("%50.8f\n", d2);
        System.out.println();

        System.out.println("Работа с датой");
        Date date = new Date();
        System.out.println(date);
        System.out.printf("Результат - %tT\n", date);
        System.out.printf("Часы - %tH, минуты - %tM, секунды - %tS\n", date, date, date);
        System.out.printf("%1$tA %1$td %1$tB %1$tY\n", date);
    }
}