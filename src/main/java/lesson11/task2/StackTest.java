package lesson11.task2;

import lesson10.task2.Cat;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        String result1 = stack.push("Hello");
        stack.add("World");
        stack.add("I");
        stack.add("study");
        boolean result = stack.add("Java");

        System.out.println(stack);
        System.out.println(result);
        System.out.println(result1);

        String element = stack.pop();
        System.out.println("Pop: " + element + " " + element);
        System.out.println(stack);

        element = stack.pop();
        System.out.println("Pop: " + element);
        System.out.println(stack);

        for (String value : stack) {
            System.out.println(value);
        }

        // Exception
//        Stack<Integer> integers = new Stack<>();
//        integers.pop();

        element = stack.peek();
        System.out.println("Peek: " + element);
        System.out.println(stack);

        System.out.println("Вывод стека:");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }
}
