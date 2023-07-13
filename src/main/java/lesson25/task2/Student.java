package lesson25.task2;

public class Student {
    private int id;
    private String name;
    private int age;
    private Degree degree;

    public Student(String name, int age, Degree degree) {
        this.id = StudentService.getId();
        this.name = name;
        this.age = age;
        this.degree = degree;
        StudentService.addStudent(this);
    }

    public int getId() {
        return id;
    }

    public Degree getDegree() {
        return degree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
