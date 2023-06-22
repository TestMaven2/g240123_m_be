package lesson19.task4;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[][] array = new String[][]{{"Hello", "world"},
                {"Hello", "Java"},
                {"Hello", "student"},
                {"Welcome", "to", "Tel-Ran"}};

        /*
        1. Посчитать количество слов
        2. Посчитать количество неповторяющихся слов
         */

        long count =  Stream.of(array)
                .flatMap(x -> Arrays.stream(x))
                .count();
        System.out.println(count);

        count =  Stream.of(array)
                .flatMap(Arrays::stream)
                .distinct()
                .count();
        System.out.println(count);
    }
}
