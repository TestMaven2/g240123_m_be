package lesson17.task9;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<String> predicate = x -> x.length() % 2 == 0;

        System.out.println(predicate.test("Hello"));
        System.out.println(predicate.test("Java"));
    }
}