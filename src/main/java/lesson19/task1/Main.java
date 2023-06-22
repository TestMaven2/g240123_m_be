package lesson19.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Преобразовать двумерный массив в одномерный

        int[][] array = {{5, 9, 2},
                         {1, 3, 9, 2},
                         {6, 2}};

        int[] result = Arrays.stream(array) // Стрим int[]
                .flatMapToInt(x -> Arrays.stream(x)) // Стрим чисел
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}
