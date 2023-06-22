package lesson19.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {

    public static void main(String[] args) {

        // Вывести в консоль все элементы всех массивов, кроме b

        String[][] words = {{"a", "b"},
                            {"c", "d"},
                            {"e", "f", "g"}};

        List<String> list = Stream.of(words) // стрим массивов типа String
                .flatMap(x -> Stream.of(x)) // объединённый стрим строк
                .filter(x -> !"b".equals(x)) // отфильтрованный стрим без значения "b"
                .collect(Collectors.toList()); // преобразуем стрим строк в лист строк

        System.out.println(list);
    }
}
