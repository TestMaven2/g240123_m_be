package lesson21.task1;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println("Программа начала работу");
        System.out.println("Вызываем метод div из метода main");
        int result = div(8, 0);
        System.out.println("В методе main получен результат - " + result);
        System.out.println("Конец работы");
    }

    public static int div(int x, int y) {
        System.out.printf("Метод div начал работу с параметрами %d и %d\n", x, y);
        int result;

        try {
            result = x / y;
        } catch (Exception e) {
            System.out.println("Возникла ошибка в методе div");
            result = 0;
        } finally {
            System.out.println("Отработал блок finally");
        }

        System.out.printf("Метод div закончил работу с результатом %d\n", result);
        return result;
    }
}
