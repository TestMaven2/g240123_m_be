package lesson12.task1;

import lesson10.task2.Cat;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Banana", 97);
        map.put("Potato", 64);
        map.put("Cherry", 150);
        map.put("Strawberry", 120);
        map.put("Orange", 82);
        map.put("Carrot", 35);
        map.put("Tomato", 59);
        map.put("Potato", 72);
        map.put(null, 10);

        System.out.println("Цена на морковь: " + map.get("Carrot"));
        System.out.println("Цена на картофель: " + map.get("Potato"));
        System.out.println("Значение несуществующего ключа: " + map.get("Apple"));

        System.out.println();
        System.out.println("Вывод всех элементов с помощью for-each");

        List<Cat> cats = new ArrayList<>();

        for (Cat currentCat : cats) {

        }

//        Вывод мап в консоль при помощи println
//        System.out.println(map);

        int stringNumber = 0;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
            String key = pair.getKey();
            int value = pair.getValue();
            // 1. Продукт - Potato, цена - 72.
            System.out.printf("%d. Продукт - %s, цена - %d.\n", ++stringNumber, key, value);
        }

        System.out.println("Все продукты магазина:");

        for (String product : map.keySet()) {
            System.out.println(product);
        }

        System.out.println("Все цены магазина:");

        for (Integer price : map.values()) {
            System.out.println(price);
        }

        System.out.println(map.keySet());

        // Удалить из прайс-листа помидоры и товары дороже 100

//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

//        Cat cat = new Cat(10, "Black", 5);

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            if ("Tomato".equals(key) || pair.getValue() > 100) {
                iterator.remove();
            }
            // key.equals("Tomato")
        }

        stringNumber = 0;
        System.out.println();
        System.out.println("После удаления: ");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
            String key = pair.getKey();
            int value = pair.getValue();
            // 1. Продукт - Potato, цена - 72.
            System.out.printf("%d. Продукт - %s, цена - %d.\n", ++stringNumber, key, value);
        }
    }
}