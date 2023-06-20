package lesson18.task1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Найти сумму нечётных чисел в коллекции

        List<Integer> list = Arrays.asList(6, 3, 8, 9, 1, 0, 5, 2, 4);

        // Способ 1 - при помощи цикла
        int sum = 0;

        for (Integer current : list) {
            if (current % 2 != 0) {
                sum += current;
            }
        }

        System.out.println("Результат 1 - " + sum);

        // Способ 2 - при помощи стримов и лямбда-выражения
        // 3 9 1 5
        // reduce 3, 9 -> 3 + 9 = 12
        // reduce 12, 1 -> 12 + 1 = 13
        // reduce 13, 5 -> 13 + 5 = 18
        int sum1 = list.stream().filter(x -> x % 2 != 0).reduce((x1, x2) -> x1 + x2).orElse(-1);
        System.out.println("Результат 2 - " + sum1);

        Integer.sum(3, 4);
        // Способ 3 - при помощи стримов и method reference
        int sum2 = list.stream().filter(x -> x % 2 != 0).reduce(Integer::sum).orElse(-1);
        System.out.println("Результат 3 - " + sum2);

        // Получение стрима из массива
        int[] array = new int[5];
        Arrays.stream(array).filter(x -> x % 2 != 0).reduce(Integer::sum).orElse(-1);
    }
}
