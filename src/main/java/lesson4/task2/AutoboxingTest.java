package lesson4.task2;

public class AutoboxingTest {

    public static void main(String[] args) {

        // int      Integer
        // double   Double
        // float    Float
        // boolean  Boolean
        // long     Long
        // byte     Byte
        // short    Short
        // char     Character

        int intValue = 8;
        Integer integerValue = null;
        System.out.println(integerValue);

        integerValue = intValue;
        System.out.println(integerValue);

        Integer integer = 7;
        Integer integer1 = new Integer(7);

        int intValue2 = integer1;
        int intValue3 = integer1.intValue();
        System.out.println(intValue2);
    }
}
