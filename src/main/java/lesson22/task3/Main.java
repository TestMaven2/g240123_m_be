package lesson22.task3;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // Проверка IP адресов
        // 1. Должен состоять из четырёх блоков, разделённых точкой
        // 2. Каждый блок может иметь значение от 0 до 255.
        // 3. Нули в начале допускаются, то есть может быть блок 005.

        checkIP("10.5.127.34");
        checkIP("10.5.127,34");
        checkIP("10.5.127..34");
        checkIP("10.5.12i.34");
        checkIP("10.5.256.34");
        checkIP("10.5.321.34");
        checkIP("10.5.249.34");
        checkIP("10.5.272.34");
        checkIP("10.5.127.34");
        checkIP("10.0000.127.34");
        checkIP("10.100.127.34.5");
        checkIP("10.100.127.34.");
        checkIP("10.100.127");
        checkIP(".10.100.127.255");
        checkIP("0.0.0.0");
        checkIP("255.255.255.255");
        checkIP("255.255.255.2*5");

        // Любое число из одной цифры 0-9
        // Любое двузначное число 0-99
        // Трёхзначные, которые начинаются с 1 либо 0
        // Трёхзначное число, которое начинается на 2, при этом не может быть больше 255
        // Использовать знак |
    }

    public static void checkIP(String ip) {
        String regExFor1Block = "([0-9]{1,2}|(0|1)[0-9]{2}|2[0-4][0-9]|25[0-5])";
        String regEx = regExFor1Block + "\\." + regExFor1Block + "\\." + regExFor1Block + "\\." + regExFor1Block;
        System.out.println(ip + " " + Pattern.compile(regEx).matcher(ip).matches());
    }
}