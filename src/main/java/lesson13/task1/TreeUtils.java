package lesson13.task1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeUtils {

    public static void breadthFirstSearch(MyBinaryTree tree) {

        if (tree == null || tree.isEmpty()) {
            return;
        }

        Queue<MyBinaryTree.Node> queue = new LinkedList<>();
        queue.add(tree.getRoot());

        while (!queue.isEmpty()) {
            MyBinaryTree.Node currentNode = queue.poll();
            System.out.print(currentNode.getValue() + " ");

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        System.out.println();
    }

    public static void depthInorder(MyBinaryTree tree) {

        if (tree == null || tree.isEmpty()) {
            return;
        }

        Stack<MyBinaryTree.Node> stack = new Stack<>();
        MyBinaryTree.Node current = tree.getRoot();

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            current = stack.pop();

            System.out.print(current.getValue() + "  ");

            current = current.getRight();
        }
        System.out.println();
    }
}