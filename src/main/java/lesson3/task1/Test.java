package lesson3.task1;

public class Test {

    public static void main(String[] args) {
        Day day = Day.THURSDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Сегодня понедельник");
                break;
            case TUESDAY:
                System.out.println("Сегодня вторник");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня среда");
                break;
            case THURSDAY:
                System.out.println("Сегодня четверг");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница");
                break;
            case SATURDAY:
                System.out.println("Сегодня суббота");
                break;
            case SUNDAY:
                System.out.println("Сегодня воскресенье");
                break;
        }

        System.out.println();

        int[] array = new int[5];
        int[] array1 = {1, 2, 3, 77};

        Day[] days = Day.values();


        for (int i = days.length - 1; i >= 0; i--) {
            System.out.println(i + " - " + days[i]);
        }
    }
}
