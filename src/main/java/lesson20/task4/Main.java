package lesson20.task4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("testDir/test.txt");
        Reader reader = new InputStreamReader(in);

        int result = reader.read();
//        System.out.println((char) result);
//        result = reader.read();
//        System.out.println((char) result);

        while (result != -1) {
            System.out.print((char) result);
            result = reader.read();
            if (result == -1) {
                System.out.println();
                System.out.println("Файл закончился");
            }
        }
    }
}
