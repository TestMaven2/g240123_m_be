package lesson10.task2;

import java.util.Comparator;
import java.util.Objects;

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        // Сравнить возраст котов.
        // Если возраст разный - возвращаем разницу в возрасте.
        // Если возраст одинаковый, то сравнить вес котов.
        // Если вес разный - возвращаем разницу в весе.
        // Если вес одинаковый, то сравнить цвет по алфавиту.

        if (cat1.getAge() != cat2.getAge()) {
            return cat1.getAge() - cat2.getAge();
        }

        if (Double.compare(cat1.getWeight(), cat2.getWeight()) != 0) {
            return Double.compare(cat2.getWeight(), cat1.getWeight());
        }

        if (cat1.getColor() != null) {
            return cat1.getColor().compareTo(cat2.getColor());
        }

        return 0;
    }
}