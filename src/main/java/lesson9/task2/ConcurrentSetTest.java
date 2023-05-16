package lesson9.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSetTest {

    public static void main(String[] args) {

        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        set.add("Potato");
        set.add("Orange");
        set.add("Mango");
        set.add("Watermelon");
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Mango");

        Iterator<String> iterator = set.iterator();
        int counter = 1;

        List<String> itemsForRemove = new ArrayList<>();
        itemsForRemove.add("Banana");
        itemsForRemove.add("Apple");

        while (iterator.hasNext()) {
            String item = iterator.next();
            // 1. Banana, length: 6 // %.2f - дробная переменная с двумя знаками после запятой
            System.out.printf("%d. %s, length: %d\n", counter++, item, item.length());

            if (itemsForRemove.contains(item)) {
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println(set);

        System.out.println();

        int i = 5;
        System.out.println(++i);
        System.out.println(i);
    }
}
