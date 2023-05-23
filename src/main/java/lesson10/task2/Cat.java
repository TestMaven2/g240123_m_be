package lesson10.task2;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

    private int age;
    private String color;
    private double weight;

    public Cat(int age, String color, double weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        // Не сравнивается ли объект сам с собой
//        if (this == obj) {
//            return true;
//        }
//
//        // Не сравнивается ли объект с null
//        if (obj == null) {
//            return false;
//        }
//
//        // Не сравниваются ли между собой объекты разных классов
//        if (!this.getClass().equals(obj.getClass())) {
//            return false;
//        }
//
//        Cat cat = (Cat) obj;
//
//        // Проверяем, равны ли все характеристики объектов друг другу
//        return this.age == cat.age && Objects.equals(color, cat.color) && Double.compare(this.weight, cat.weight) == 0;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, weight);
    }

    @Override
    public int compareTo(Cat o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }

    @Override
    public String toString() {
        // Cat: age - 5, color - Black, weight -
        return String.format("Cat: age - %d, color - %s, weight - %.2f.", age, color, weight);
    }
}