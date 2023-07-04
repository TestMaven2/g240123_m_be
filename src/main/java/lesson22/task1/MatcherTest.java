package lesson22.task1;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    public static void main(String[] args) {

        String regEx = ".www.";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher("http://www.example.comwww5");

        System.out.println(matcher.matches());

//        System.out.println(matcher.find());

        while (matcher.find()) {
            System.out.printf("Результат метода start - %d, метода end - %d\n", matcher.start(), matcher.end());
        }
    }
}
