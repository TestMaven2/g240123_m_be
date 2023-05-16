package lesson9.task1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest2 {

    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<>();

        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Cat");
        set.add("Dog");
        set.add("Bird");
        set.add("C#");

        System.out.println(set);

        for (String elem : set) {
            System.out.println(elem + " " + elem.length());
        }

        System.out.println();

        Iterator<String> iterator = set.iterator();

//        while(iterator.hasNext()){
//            String elem = iterator.next();
//            if (elem.length() % 2 == 0){
//                System.out.println(elem + " true");
//            }else{
//                System.out.println(elem + " false");
//            }
//        }

        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.println(elem + " " + (elem.length() % 2 == 0));
        }
    }
}
