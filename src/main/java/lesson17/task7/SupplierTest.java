package lesson17.task7;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Integer> func = () -> 7;
        print(func);

        Supplier<Integer> func1 = () -> (int) (Math.random() * 20) + 1;
        print(func1);
    }

    public static void print(Supplier<Integer> func) {
        for (int i = 0; i < 10; i++) {
            System.out.print(func.get() + " ");
        }
        System.out.println();
    }
}
