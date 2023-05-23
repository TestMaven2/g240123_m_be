package lesson10.task1;

public class PrimitiveComparing {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 5;

        boolean result = a == b;
        System.out.println("Результат сравнения a и b: " + result);

        result = a == c;
        System.out.println("Результат сравнения a и c: " + result);

        Integer i = 5;
        result = a == i;
        System.out.println("Результат сравнения int и Integer: " + result);

        Integer i1 = new Integer(5);
        result = i == i1;
        System.out.println("Результат сравнения двух Integer: " + result);

        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 = "Java";

        s4 = s4 + "!";
        System.out.println(s3);
        System.out.println(s4);
    }
}
