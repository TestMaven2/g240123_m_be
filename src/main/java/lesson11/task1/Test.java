package lesson11.task1;

public class Test implements TestInterface {

    @Override
    public String test(int value) {
        return "test";
    }

    @Override
    public String test(int value, double value1) {
        return "another test";
    }

    public static void main(String[] args) {

        System.out.println(new Test().test(5, 2.3));
    }
}
