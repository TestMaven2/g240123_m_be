package lesson16.task1;

import java.util.List;

public class StudentUtils {

    public static void printStudents(List<Student> students, Filter filter) {
        for (Student student : students) {
            if (filter.test(student)) {
                System.out.println(student);
            }
        }
    }
}