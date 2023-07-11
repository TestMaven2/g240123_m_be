package lesson24.task3;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        first();
    }

    public static void first() {
        try {
            second();
        } catch (Exception e) {
            System.out.println("Ошибка обработана в первом методе");
            throw new RuntimeException("Ошибка из блока catch первого метода");
        }
    }

    public static void second() throws IOException {
        third();
    }

    public static void third() throws IOException {
//        try {
            fourth();
//        } catch (IOException e) {
//            System.out.println("Ошибка была обработана в третьем методе");
//            e.printStackTrace();
//        }
    }

    public static void fourth() throws IOException {
//        try {
            FileReader reader = new FileReader("testFile1.txt");
//        } catch (IOException e) {
//            System.out.println("Возникла ошибка");
//        }
    }
}