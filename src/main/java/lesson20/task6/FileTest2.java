package lesson20.task6;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

    public static void main(String[] args) throws IOException {

        System.out.println("Создание файла происходит в два шага");
        System.out.println("1. Мы создаём объект, который будет ссылаться на этот файл");
        File file = new File("thirdTest.txt");
        System.out.println("2. Мы создаём сам файл при помощи созданного объекта");
        file.createNewFile();
    }
}
