package lesson8;

import java.util.Iterator;

public class ListTest {

    public static void main(String[] args) {

        // Создаём наш лист
        MyLinkedList list = new MyLinkedList();

        // Здесь мы будем вызывать методы нашего листа
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");


        // Блок тестирования
        // Выводим в консоль размер листа
        System.out.println("Размер листа - " + list.size());
        System.out.println();

        // Выводим в консоль лист с помощью toString()
        System.out.println("Вывод с помощью toString()");
        System.out.println(list);
        System.out.println();

        // Выводим в консоль лист с помощью for
        System.out.println("Вывод с помощью for");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        // Выводим с помощью for-each
        System.out.println("Вывод с помощью for-each");
        for (String value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println();

        // Выводим с помощью итератора
        System.out.println("Вывод с помощью итератора");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        list.clear();
        System.out.println("После очистки:");
        System.out.println(list);
    }
}