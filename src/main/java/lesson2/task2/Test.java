package lesson2.task2;

public class Test {

    public static void main(String[] args) {

        Flyable[] flyables = new Flyable[2];
        flyables[0] = new Bird();
        flyables[1] = new Airplane();

        for (Flyable flyable : flyables) {
            flyable.fly();
        }

        Bird bird = new Bird();
        bird.fly();
        bird.fly(7);
        bird.live();

        Flyable bird1 = new Bird();
        ((Bird) bird1).live();


        int i = 45;
        long l = i;

        int i2 = (int) l;

        String s = "Hello";
    }
}
