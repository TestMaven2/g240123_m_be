package lesson21.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamTest {

    public static void main(String[] args) throws IOException {

        File file = new File("output.txt");
        file.createNewFile();

        try (FileOutputStream out = new FileOutputStream(file, false);
             Scanner scanner = new Scanner(System.in)) {

            out.write('X');

//            while (true) {
//                out.write(scanner.nextLine().charAt(0));
//            }

            String text = " Hello World!";
            byte[] bytes = text.getBytes();

            out.write(bytes);
            out.write(bytes, 8, 4);


        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}
