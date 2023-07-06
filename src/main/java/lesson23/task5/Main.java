package lesson23.task5;

public class Main {

    public static void main(String[] args) {

        Long l = 123L;
        Integer i = 7;
        Float f = 34.76f;
        Double d = 12.6;
        Byte b = 100;
        String s = "Hello";

        NumberUtils<Long> utils = new NumberUtils<>(l);
        NumberUtils<Integer> utils1 = new NumberUtils<>(i);
        NumberUtils<Float> utils2 = new NumberUtils<>(f);
        NumberUtils<Double> utils3 = new NumberUtils<>(d);
        NumberUtils<Byte> utils4 = new NumberUtils<>(b);
//        NumberUtils<String> utils5 = new NumberUtils<>(s);

        utils.printIntegerValue();
        utils1.printIntegerValue();
        utils2.printIntegerValue();
        utils3.printIntegerValue();
        utils4.printIntegerValue();
//        utils5.printIntegerValue();
    }
}
