package lesson2.task1;

public class Fruit {

    protected String color;
    protected int size;

    public Fruit() {
        System.out.println("Вызван конструктор Fruit");
    }

    public Fruit(int size) {
        this.size = size;
        System.out.println("Вызван конструктор Fruit с размером");
    }

    public Fruit(String color) {
        System.out.println("Вызван конструктор Fruit с цветом");
    }

    public void printInfo() {
        System.out.println("Это фрукт");
    }
}