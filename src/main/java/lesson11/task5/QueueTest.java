package lesson11.task5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Hello");
        queue.add("World");
        queue.add("I");
        queue.add("study");
        queue.add("Java");

        System.out.println(queue);

        System.out.println(queue.element());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}