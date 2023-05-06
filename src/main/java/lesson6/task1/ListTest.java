package lesson6.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(0, 5);
        numbers.add(1, 7);

        System.out.println(numbers);

        numbers.add(8);
        numbers.add(9);
//        numbers.add(8, 12);

        System.out.println(numbers);

        List<Integer> numbers1 = new ArrayList<>();

        numbers1.add(20);
        numbers1.add(30);

        System.out.println(numbers1);

        numbers1.addAll(numbers);

        System.out.println(numbers1);

        int[] array = {1, 2, 3};

//        addAll(numbers1, array);
        for (int i : array) {
            numbers1.add(i);
        }

        System.out.println(numbers1);

        addFirst(numbers1, array);
//        if (array.length != 0) {
//            numbers1.add(array[0]);
//        }

        System.out.println(numbers1);

        int value = numbers1.remove(1);

        System.out.println(numbers1);
        System.out.println(value);

        System.out.println(numbers1.get(4));

        numbers1.set(2, 17);

        System.out.println(numbers1);

        System.out.println(numbers1.size());

        System.out.println(numbers1.isEmpty());

        System.out.println(numbers1.contains(8));
        System.out.println(numbers1.contains(18));

        for (Integer value1 : numbers1) {
            System.out.println(value1);
        }

    }

    private static void addAll(List<Integer> numbers, int[] array) {
        for (int i : array) {
            numbers.add(i);
        }
    }

    private static void addFirst(List<Integer> numbers, int[] array) {
        if (array.length != 0) {
            numbers.add(array[0]);
        }
    }
}