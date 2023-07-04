package lesson22.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompileFlagTest {

    public static void main(String[] args) {

        String source = "Apple, Banana, Orange";
        String regEx = "a";
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(source);

        while (matcher.find()) {
            System.out.println("Индекс вхождения буквы а - " + matcher.start());
        }
    }
}
