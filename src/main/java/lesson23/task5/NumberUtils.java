package lesson23.task5;

public class NumberUtils<T extends Number> {

    private T value;

    public NumberUtils(T value) {
        this.value = value;
    }

    public void printIntegerValue() {
        System.out.println(value.intValue());
    }
}