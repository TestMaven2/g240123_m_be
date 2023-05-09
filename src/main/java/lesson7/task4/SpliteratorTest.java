package lesson7.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");
        list.add("FFF");
        list.add("GGG");
        list.add("HHH");
        list.add("III");

        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        Spliterator<String> spliterator3 = spliterator2.trySplit();

        spliterator1.forEachRemaining(x -> System.out.println("Spliterator 1: " + x));
        spliterator2.forEachRemaining(x -> System.out.println("Spliterator 2: " + x));
        spliterator3.forEachRemaining(x -> System.out.println("Spliterator 3: " + x));
    }
}