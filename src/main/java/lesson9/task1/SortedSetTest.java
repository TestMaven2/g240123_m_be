package lesson9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<>();

        set.add("A");
        set.add("D");
        set.add("C");
        boolean result1 = set.add("B");
        boolean result2 = set.add("D");
        set.add("c");
        set.add("b");

        System.out.println(set);
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("Contains:");

        System.out.println(set.contains("c"));
        System.out.println(set.contains("F"));

        System.out.println("First:");
        System.out.println(set.first());

        System.out.println("Last:");
        System.out.println(set.last());

        result1 = set.remove("B");
        result2 = set.remove("f");

        System.out.println("После удаления:");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(set);

        System.out.println("Remove All:");

        List<String> list = new ArrayList<>();
        list.add("D");
        list.add("c");

        set.removeAll(list);
        System.out.println(set);


    }
}
