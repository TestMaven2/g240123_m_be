package lesson17.task5;

import java.util.function.Function;

public class IdentityTest {

    public static void main(String[] args) {

//        Function<String, String> function = x -> x;
        Function<String, String> function = Function.identity();

        System.out.println(function.apply("Test"));
    }
}
