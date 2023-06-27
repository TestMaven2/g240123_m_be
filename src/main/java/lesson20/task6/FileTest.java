package lesson20.task6;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("testFile.txt");
        System.out.println("Файл существует? - " + file.exists());
        System.out.println(file.createNewFile());
        System.out.println("Файл существует? - " + file.exists());

        File file1 = new File("first/second/third/fourth/secondTest.txt");
        System.out.println("Файл второй существует? - " + file1.exists());
        System.out.println(file1.createNewFile());

        File file2 = new File("first");
        file2.mkdir();

        System.out.println("Определяем, наш объект является папкой или файлом?");
        System.out.println("Это файл? - " + file2.isFile());
        System.out.println("Это папка? - " + file2.isDirectory());

        File file3 = new File("first/second/third/fourth");
        file3.mkdirs();

        file1.createNewFile();
        System.out.println("Существует ли файл, к которому привязан объект file1? " + file1.exists());
    }
}
