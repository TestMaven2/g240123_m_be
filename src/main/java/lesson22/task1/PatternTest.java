package lesson22.task1;

import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

        // Определить, содержит ли строка последовательность www
        System.out.println(checkString("http://www.example.com"));
        System.out.println(checkString("http://example.com"));
        System.out.println(checkString("www.example.com"));
        System.out.println(checkString("http://www"));
        System.out.println(checkString("www"));
        System.out.println(checkString("dwww"));
        System.out.println(checkString("...www"));
    }

    public static boolean checkString(String source) {
        String regEx = ".{3,}www.*";
        Pattern pattern = Pattern.compile(regEx);
        System.out.println("Шаблон - " + pattern.pattern());
        boolean result = pattern.matcher(source).matches();
        return result;
    }
}
