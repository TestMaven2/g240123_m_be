package lesson22.task1;

import java.util.regex.Pattern;

public class RegExTest {

    public static void main(String[] args) {
        checkString("A");
        checkString("B");
        checkString("C");
        checkString("D");
        checkString("AA");
        checkString("ABC");
        checkString("CBABBB");
        System.out.println();

        checkString2("DFBudf");
        checkString2("vS");
        checkString2("zcbrGG");
        checkString2("A");
        checkString2("dsfD9Gdfv");
        checkString2("4565$");

    }

    public static void checkString(String source) {
        String regEx = "[ABC]+";
        Pattern pattern = Pattern.compile(regEx);
        System.out.println(pattern.matcher(source).matches());
    }

    public static void checkString2(String source) {
        String regEx = "[A-Za-z]{3,}";
        String regEx1 = "[^A-Xa-z]{3,}";
        String regEx2 = "\\w{3,}";
        String regEx3 = "[0-7]*";
        Pattern pattern = Pattern.compile(regEx);
        Pattern pattern1 = Pattern.compile(regEx1);
        Pattern pattern2 = Pattern.compile(regEx2);
        System.out.println(pattern2.matcher(source).matches());
    }
}
