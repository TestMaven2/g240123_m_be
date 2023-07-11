package lesson24.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("testFile.txt");
            BufferedReader reader1 = new BufferedReader(reader);

            System.out.println(reader1.read());

            reader1.close();

            int x = 15;
            int y = 0;
            System.out.println(x / y);
        } catch (IOException e) {
            System.out.println("Файл не найден");
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль");
        }

    }
}
