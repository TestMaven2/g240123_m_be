package lesson17.task6;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Написать метод, который принимает на вход массив и функцию,
        // обрабатывает каждый элемент массива при помощи этой функции
        // и создаёт и возвращает сет из обработанных элементов.

        String[] words = {"AAAA", "BBB", "CCCCC", "BBB"};
        // Функция добавляет к строке пробел и количество символов в исходной строке.
        Function<String, String> function = x -> x + " " + x.length();

        Set<String> set = getSetFromArray(words, function);
        System.out.println(set);

        // Получить при помощи готового метода сет никак не изменённых элементов
        Set<String> set1 = getSetFromArray(words, Function.identity());
        System.out.println(set1);
    }

    public static Set<String> getSetFromArray(String[] array, Function<String, String> function) {
        Set<String> result = new HashSet<>();
        for (String currentWord : array) {
            String processedWord = function.apply(currentWord);
            result.add(processedWord);
        }
        return result;
    }
}