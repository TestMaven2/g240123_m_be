package lesson4.task1;

public class Main {

    public static void main(String[] args) {

        int value = 7;
        Person person = new Person("Max");
        System.out.println(value);
        System.out.println(person.getName());
        System.out.println(person.hashCode());
        System.out.println(person);

        Person person1 = person;

        value = changeValue(value);
        changeValue(person1);

        System.out.println("После вызова методов");
        System.out.println(value);
        System.out.println(person.getName());
        System.out.println(person.hashCode());
        System.out.println(person);

        System.out.println(person.equals(person1));
    }

    public static int changeValue(int value) {
        value++;
        return value;
    }

    public static void changeValue(Person person) {
        person.setName("John");
    }
}