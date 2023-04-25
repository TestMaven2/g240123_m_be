package lesson3.task2;

import lesson1.task1.Dog;
import lesson1.task3.Cat;

public class CityTest {

    public static void main(String[] args) {

        City.valueOf("BERLIN");

        Dog dog = new Dog("Setter", 10, "Black");

        City[] cities = City.values();
        System.out.println();

        for (City city : cities) {
            System.out.println(city);
        }

        City berlin = City.BERLIN;

        String cityInfo = berlin.toString();
        System.out.println();

        System.out.println(berlin.toString(true));
        System.out.println(berlin.toString(false));

        City lisbon = City.LISBON;

        System.out.println(berlin.isPopular());
        System.out.println(lisbon.isPopular());
    }
}
