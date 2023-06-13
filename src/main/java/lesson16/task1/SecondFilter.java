package lesson16.task1;

public class SecondFilter implements Filter {

    @Override
    public boolean test(Student student) {
        return student.getGender().equals(Gender.FEMALE) && student.getName().toLowerCase().contains("и");
    }

//    @Override
//    public void test(int i) {
//
//    }
}
