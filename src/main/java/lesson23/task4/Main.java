package lesson23.task4;

import lesson10.task2.Cat;

public class Main {

    public static <T> void print(T item) {
        System.out.println(item);
    }

//    public static void print(Cat item) {
//
//    }
//
//    public static void print(Double item) {
//
//    }

    public static void main(String[] args) {

        print("Hello");
        print(8.5);
        print(new Cat(1, "Black", 4.5));
    }
}
