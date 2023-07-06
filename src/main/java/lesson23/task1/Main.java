package lesson23.task1;

import lesson17.task2.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        Box box = new Box();
        box.putItem("Hello");
        box.putItem(15);
        box.putItem(new Cat(3, "Black"));

        String item = (String) box.getItem();
        System.out.println(item.length());

        String item1 = (String) box.getItem();
        System.out.println(item1.length());
    }
}
