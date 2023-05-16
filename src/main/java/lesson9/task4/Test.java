package lesson9.task4;

import java.util.Arrays;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        String[] array = {"Banana", "Cherry", "Apple", "Potato", "Lemon", "Orange", "Melon"};
        System.out.println("Array:   " + Arrays.toString(array));

        Set<String> result = ArrayToSet.convertToSet1(array);
        System.out.println("Result1: " + result);

        result = ArrayToSet.convertToSet2(array);
        System.out.println("Result2: " + result);

        result = ArrayToSet.convertToSet3(array);
        System.out.println("Result3: " + result);

        result = ArrayToSet.convertToSet4(array);
        System.out.println("Result4: " + result);

        result = ArrayToSet.convertToSet4(array);
        System.out.println("Result4: " + result);

        result = ArrayToSet.convertToSet4(array);
        System.out.println("Result4: " + result);

        result = ArrayToSet.convertToSet5(array);
        System.out.println("Result5: " + result);
    }
}
