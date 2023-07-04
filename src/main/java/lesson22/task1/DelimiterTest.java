package lesson22.task1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class DelimiterTest {

    public static void main(String[] args) {

        String source = "Hello7World45I123study87Java";
        String regEx = "[0-9]{1,3}";
        Pattern pattern = Pattern.compile(regEx);

        String[] words = pattern.split(source);
        Arrays.stream(words).forEach(x -> System.out.print(x + " "));
        System.out.println();

        String source1 = "Banana          Apple  Orange     Pear";
        String s = source1.replaceAll("[ ] *", "\s");
        System.out.println(s);
    }
}
