package lesson15.task1;

public class BooleanTest {

    public static void main(String[] args) {

        // true true
//        int b = 1;
//        int c = 5;

        // true false
//        int b = 1;
//        int c = 6;

        // false true
//        int b = 0;
//        int c = 5;

        // false false
        int b = 0;
        int c = 6;

        System.out.println(test1(b, c));
        System.out.println(test2(b, c));
    }

    public static boolean test1(int b, int c) {
        return !((b != 0) || (c <= 5));
        // true, true -> !(true || true) -> !true -> false
        // true, false -> !(true || false) -> !true -> false
        // false, true -> !(false || true) -> !true -> false
        // false, false -> !(false || false) -> !false -> true
    }

    public static boolean test2(int b, int c) {
        return (b == 0) && (c > 5);
        // false, false -> false && false -> false
        // false, true -> false && true -> false
        // true, false -> true && false -> false
        // true, true -> true && true -> true
    }
}