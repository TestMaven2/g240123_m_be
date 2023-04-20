package lesson2.task2;

import java.io.Serializable;

public class Bird extends Animal implements Flyable {

    @Override
    public void live() {

    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    public void fly(int speed) {
        System.out.println("Птица летит со скоростью " + speed);
    }
}
