package lesson17.task4;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // 1. Преобразовать строку в число.
        // 2. Округлить это число.
        // 3. Возвести это число в квадрат.

        Function<String, Double> function1 = x -> Double.parseDouble(x);
        Function<Double, Long> function2 = x -> Math.round(x);
        Function<Long, Long> function3 = x -> x * x;

        Function<String, Long> result = function1.andThen(function2).andThen(function3);

        System.out.println(result.apply("4.76"));

        // Альтернативный вариант
        Function<String, Long> total = x -> {
            double result1 = Double.parseDouble(x);
            long result2 = Math.round(result1);
            return result2 * result2;
        };

        Function<String, Long> total1 = x -> (long) Math.pow((double) (Math.round(Double.parseDouble(x))), 2);

        System.out.println(total.apply("4.76"));
        System.out.println(total1.apply("4.76"));

        Function<String, Long> result1 = function2.andThen(function3).compose(function1);

        System.out.println(result1.apply("4.76"));
    }
}
