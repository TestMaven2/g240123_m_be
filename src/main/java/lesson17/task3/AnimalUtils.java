package lesson17.task3;

import java.util.List;

public class AnimalUtils {

    public static void copy(List<? extends LandAnimal> source, List<? super LandAnimal> target) {
//        for (LandAnimal currentAnimal : source) {
//            target.add(currentAnimal);
//        }

        target.addAll(source);
    }
}
