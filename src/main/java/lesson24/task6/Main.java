package lesson24.task6;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // У нас есть класс, описывающий товар - Item
        // Товар должен иметь наименование и цену.
        // Создайте список товаров (штук 7)
        // Напишите метод, который в качестве аргументов принимает строку
        // для поиска и цену, а также список
        // Задача метода отфильтровать товары таким образом, чтобы результирующий
        // список содержал товары, если в имени присутствует строка поиска,
        // а также товары по цене не выше, чем та цена, которая была передана в метод
        // Запросите у пользователя строку поиска и цену, вызовите метод, передав значения туда
        // Выведите в консоль отфильтрованный список.
        // Если товаров не осталось в выборке вообще, бросьте свой кастомный эксепшн.
        // Pineapple и Apple, строка для поиска - Apple -> должны найтись оба этих товара

        List<Item> list = List.of(
                new Item("TV", 120.1),
                new Item("TV1", 220),
                new Item("DVD", 22),
                new Item("Image", 11),
                new Item("Xbox", 402.3),
                new Item("PC", 775.5),
                new Item("PC2", 1112.6));
        try {
            System.out.println(findItem("TV;XBOX", 100, list));
        } catch (NoItemFindException e) {
            System.out.println("Is empty");
        }


    }

    public static List<Item> findItem(String str, double price, List<Item> list) throws NoItemFindException {
        List<Item> newList = list.stream().filter(x -> x.getPrice() <= price && x.getName().toLowerCase()
                        .contains(str.toLowerCase()))
                .collect(Collectors.toList());
        if (newList.isEmpty())
            throw new NoItemFindException();

        return newList;
    }
}
