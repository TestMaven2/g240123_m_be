package lesson1.task1;

public class Dog {

    private String breed;
    private double age;
    private double age1;
    private String color;

    public Dog(String breed, double age, String color) {
        if (age < 0) {
            System.out.println("Возраст не может быть меньше нуля.");
            age = 0;
        }
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public Dog() {

    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(double age) {
        this.age = age;
    }

    public Dog(int value) {

    }

    public double getAge() {
        return age;
    }

    public double getAge1() {
        return age1;
    }

//    public void setAge(double age) {
//        if (age < 0) {
//            System.out.println("Возраст не может быть меньше нуля.");
//            age = 0;
//        }
//        this.age = age;
//    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void bark() {
        System.out.println("Гав!");
    }

    void hungry() {
        System.out.println("Собака голодна");
    }

    void sleep() {
        System.out.println("Собака спит");
    }
}