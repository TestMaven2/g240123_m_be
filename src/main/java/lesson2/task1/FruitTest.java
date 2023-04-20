package lesson2.task1;

public class FruitTest {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.color = "Жёлтый";

        System.out.println(fruit.color);
        fruit.printInfo();

        Ananas ananas = new Ananas();
//        ananas.color = "Коричневый";

        System.out.println(ananas.color);
        ananas.printInfo();

        ananas.color = "Коричневый";
        System.out.println(ananas.color);

        System.out.println("Создаём фрукт");
        Fruit fruit1 = new Fruit();

        System.out.println("Создаём ананас");
        Ananas ananas1 = new Ananas();

//        Fruit fruit2 = new Fruit("Green");
        Ananas ananas2 = new Ananas("Brown");

        System.out.println("Создаём ананас с размером и цветом");
        Ananas ananas3 = new Ananas(4, "Зелёный");
    }
}