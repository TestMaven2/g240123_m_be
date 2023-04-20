package lesson2.task1;

public class Ananas extends Fruit {

    public Ananas() {
        System.out.println("Вызван конструктор Ananas");
    }

    public Ananas(String color) {
        super(7);
        this.color = color;
    }

    public Ananas(int size, String color) {
        super(size);
        this.color = color;
        System.out.println("Вызван конструктор Ananas с размером и цветом");
    }

    @Override
    public void printInfo() {
        System.out.println("Это ананас");
    }
}
