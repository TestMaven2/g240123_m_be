package lesson19.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("New", 33.5));
        itemList.add(new Item("City", 14));
        itemList.add(new Item("Window", 13));
        itemList.add(new Item("Phone", 43));
        itemList.add(new Item("Milk", 15));
        itemList.add(new Item("Bun", 1));
        itemList.add(new Item("Table", 30));
        itemList.add(new Item("Sun", 11));
        itemList.add(new Item("Door", 14));
        itemList.add(new Item("Paper", 43));
        itemList.add(new Item("Phone", 31));

//        Отфильтровать товары таким образом, чтобы получить список товаров дороже 10
//        и исключить дубликаты.

        List<String> list = itemList.stream()
                .filter(x -> x.getPrice()>10)
                .map(x ->x.getName())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
