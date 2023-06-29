package lesson21.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Arrays;

public class InputStreamTest {

    public static void main(String[] args) {

        File file = new File("testDir/test.txt");


        try (FileInputStream in = new FileInputStream("testDir/test.txt");
             FileInputStream in1 = new FileInputStream(file);
             FileReader reader = new FileReader(file)) {

            System.out.println("Байтов осталось: " + in.available());

            System.out.println("Пропускаем 15 байт");
            in.skip(15);

            System.out.println("Байтов осталось: " + in.available());

            System.out.println("Информация из файла: " + (char) in.read());

            System.out.println("Считываем всю оставшуюся информацию:");

            int data = in.read();

            while (in.available() > 0) {
                System.out.print((char) data);
                data = in.read();
            }
            System.out.print((char) data);
            System.out.println();
            System.out.println("Выводим в консоль полученный массив bytes");

            byte[] bytes = in1.readAllBytes();
            for (byte current : bytes) {
                System.out.print((char) current);
            }
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}