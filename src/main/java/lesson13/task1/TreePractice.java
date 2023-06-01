package lesson13.task1;

public class TreePractice {

    public static void main(String[] args) {

        MyBinaryTree tree = new MyBinaryTree();

        tree.add(10,"Node 10");
        tree.add(2, "Node 2");
        tree.add(13, "Node 13");
        tree.add(1, "Node 1");
        tree.add(6, "Node 6");
        tree.add(12, "Node 12");
        tree.add(81, "Node 81");
        tree.add(5, "Node 5");

        TreeUtils.breadthFirstSearch(tree);
        TreeUtils.depthInorder(tree);
    }
}
