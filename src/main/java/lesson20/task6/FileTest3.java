package lesson20.task6;

import java.io.File;
import java.io.IOException;

public class FileTest3 {

    public static void main(String[] args) throws IOException {

        System.out.println("Создание файла в папке");
        System.out.println("1. Создаём объект, который ссылается на папку");
        File dir = new File("testDirectory");
        System.out.println("2. Создаём папку через объект");
        dir.mkdir();
        System.out.println("3. Создаём объект, который ссылается на файл");
        File file = new File("testDirectory/test3.txt");
        System.out.println("4. Создаём сам файл через объект");
        file.createNewFile();
    }
}
