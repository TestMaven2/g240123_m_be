package lesson25.task1;

public class ArrayUtils {

    /**
     * Метод возвращает массив размером size,
     * наполненный значениями от 1 до size
     *
     * @param size  размер массива
     * @return      результирующий массив
     */
    public static int[] getArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
