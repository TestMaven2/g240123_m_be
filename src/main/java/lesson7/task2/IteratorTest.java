package lesson7.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            if (iterator.next() % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println(list);

        List<String> str = new ArrayList<>();
        str.add("java");
        str.add("JS");
        str.add("C#");
        str.add("C++");
        str.add("NNNNN");
        Iterator<String> iterator1 = str.iterator();

        while (iterator1.hasNext()) {
            String tmp = iterator1.next();
            if (tmp.length() % 2 == 0) {
                iterator1.remove();

            } if (tmp.length() == 3) {
                System.out.println(tmp);
            }

        }
        System.out.println("str - " + str);
    }
}
