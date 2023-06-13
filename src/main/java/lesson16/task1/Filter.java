package lesson16.task1;

@FunctionalInterface
public interface Filter {

    boolean test(Student student);

    // Если мы добавим второй абстрактный метод,
    // наш интерфейс перестанет быть функциональным,
    // что сломает логику, завязанную на данный функциональный интерфейс.
//    void test(int i);
}