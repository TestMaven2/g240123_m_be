package lesson25.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class StudentService {

    private static int id;

    private static Map<Integer, Student> studentMap = new HashMap<>();

    public static int getId() {
        return ++id;
    }

    public static void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    public static Map<Integer, Student> getAllStudents() {
        return studentMap;
    }

    public static int getStudentsNumber() {
        return studentMap.size();
    }

    public static int getStudentByDegree(Degree degree) {
        return (int) studentMap.entrySet().stream().filter(x -> x.getValue().getDegree().equals(degree)).count();
    }

    public static int getStudentAvgAge() {
        int commonAge = 0;
        for (Student student : studentMap.values()) {
            commonAge += student.getAge();
        }
        return commonAge / studentMap.size();
    }

    public static int getStudentAvgAgeByDegree(Degree degree) {
        int commonAge = 0;
        int studentCount = 0;
        for (Student student : studentMap.values()) {
            if (degree == student.getDegree()) {
                commonAge += student.getAge();
                studentCount++;
            }
        }
        return commonAge / studentCount;
    }

    public static List<Student> getStudentListByDegree(Degree degree) {
        List<Student> list = new ArrayList<>();
        for (Student student : studentMap.values()){
            if (degree == student.getDegree()){
                list.add(student);
            }
        }
        return list;
    }


}
