package lesson11.task6;

public class MyDequeTest {

    public static void main(String[] args) {
        MyArrayDeque deque = new MyArrayDeque();

        deque.addToHead(2);

        System.out.println(deque);

        deque.addToTail(4);

        System.out.println(deque);

        deque.addToHead(1);

        System.out.println(deque);

        deque.addToTail(5);
        System.out.println(deque);

        System.out.println(deque.size());

        System.out.println(deque.peekHead());
        System.out.println(deque.peekTail());

        System.out.println(deque.getByIndex(1));

//        System.out.println(deque.removeHead());
//        System.out.println(deque);
//
//        System.out.println(deque.removeTail());
//        System.out.println(deque);
//
//        System.out.println(deque.size());
//
//        deque.removeHead();
//        deque.removeHead();
//        System.out.println(deque);
//
//        deque.removeTail();
//        System.out.println(deque);
//
//        System.out.println(deque.size());

        System.out.println(deque.contains(5));
    }


}
