package lesson9.task3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class HashSetTest {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Banana");
        set1.add("Lemon");
        set1.add("Pear");
        set1.add("Apple");
        set1.add("Carrot");
        set1.add("Potato");
        set1.add("Orange");
//        set1.add(null);

        Set<String> set2 = new HashSet<>(set1);
        Set<String> set3 = new HashSet<>(20);
        Set<String> set4 = new HashSet<>(20, 0.9f);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

//        set1.remove("Lemon");
        System.out.println("После удаления:");

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<String> set5 = new LinkedHashSet<>();
        set5.add("Banana");
        set5.add("Lemon");
        set5.add("Pear");
        set5.add("Apple");
        set5.add("Carrot");
        set5.add("Potato");
        set5.add("Orange");
//        set5.add(null);

        Set<String> set6 = new TreeSet<>();
        set6.add("Banana");
        set6.add("Lemon");
        set6.add("Pear");
        set6.add("Apple");
        set6.add("Carrot");
        set6.add("Potato");
        set6.add("Orange");
//        set6.add(null);

        ConcurrentSkipListSet<String> set7 = new ConcurrentSkipListSet<>();
        set7.add("Banana");
        set7.add("Lemon");
        set7.add("Pear");
        set7.add("Apple");
        set7.add("Carrot");
        set7.add("Potato");
        set7.add("Orange");
//        set7.add(null);

        System.out.println();
        System.out.println("HashSet:               " + set1);
        System.out.println("LinkedHashSet:         " + set5);
        System.out.println("TreeSet:               " + set6);
        System.out.println("ConcurrentSkipListSet: " + set7);
    }
}
