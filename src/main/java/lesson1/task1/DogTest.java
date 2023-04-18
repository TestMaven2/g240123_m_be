package lesson1.task1;

public class DogTest {

    public static void main(String[] args) {

        Dog dog12 = new Dog();
//        System.out.println(dog12.age);

        Dog dog2 = new Dog();

        Dog dog3 = new Dog("Сеттер", 6, "Black");

//        dog2.setAge(7);
        System.out.println(dog2.getAge());
//        dog2.setAge(-3);
        System.out.println(dog2.getAge());

        Dog dog = new Dog("Сеттер", -4, "Green");
        System.out.println(dog.getAge());
//        dog.age = -4;
        System.out.println(dog.getAge());
    }
}
