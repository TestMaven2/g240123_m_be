package lesson18.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("10", "20", "30", "10", "100", "50");

        String result1 = list.stream().reduce((x1, x2) -> x1 + x2).orElse("");
        System.out.println("Результат 1 - " + result1);

        String result2 = list.stream().reduce((x1, x2) ->
                String.valueOf(Integer.parseInt(x1) + Integer.parseInt(x2))).orElse("");
        System.out.println("Результат 2 - " + result2);

        System.out.println("Исходный лист:\n" + list);

        // Посчитаем количество элементов "10"
        long count = list.stream().filter(x -> x.equals("10")).count();
        System.out.println("Метод count: " + count);

        // Посчитаем количество элементов, содержащих подстроку "10"
        count = list.stream().filter(x -> x.contains("10")).count();
        System.out.println("Метод count: " + count);

        List<String> resultList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Сортировка строк в естественном порядке: " + resultList);

        // Отсортируем строки как числа в естественном порядке
        resultList = list.stream().sorted((x1, x2) -> Integer.parseInt(x1) - Integer.parseInt(x2)).collect(Collectors.toList());
        System.out.println("Сортировка строк как чисел: " + resultList);

        // Сортировка и ограничение количества элементов
        resultList = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("Сортировка с ограничением количества элементов: " + resultList);

        // Сортировку с пропуском элементов
        resultList = list.stream().sorted().skip(2).collect(Collectors.toList());
        System.out.println("Сортировка с пропуском элементов: " + resultList);

        // Фильтруем дубликаты
        resultList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Лист с отфильтрованными дубликатами: " + resultList);

        resultList = list.stream().peek(x -> System.out.println(x + " hello")).collect(Collectors.toList());
        System.out.println("peek: " + list);
        System.out.println("peek: " + resultList);

        resultList = list.stream().map(x -> x + " hello").collect(Collectors.toList());
        System.out.println("map: " + resultList);

        list.stream().forEach(x -> System.out.println(x));

        // Найти максимальное число
        List<Integer> integers = Arrays.asList(2, 6, 10, 9, 5);
        int result = integers.stream().max((x1, x2) -> x1 - x2).orElse(-1);
        System.out.println("Max: " + result);

        result = integers.stream().min((x1, x2) -> x2 - x1).orElse(-1);
        System.out.println("Max: " + result);
    }
}
