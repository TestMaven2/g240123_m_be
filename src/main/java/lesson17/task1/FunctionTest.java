package lesson17.task1;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        // Функция округляет значение, которое мы передаём в качестве параметра.
        Function<Double, Long> function = x -> Math.round(x);

        System.out.println(function.apply(3.65));
        System.out.println(function.apply(15.245));
    }
}
