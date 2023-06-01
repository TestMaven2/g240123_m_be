package lesson13.task1;

public class MyBinaryTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void add(int key, String value) {
        if (isEmpty()) {
            root = new Node(key, value);
        } else {
            Node current = root;
            Node parent = null;
            while (current != null) {
                if (key == current.key) {
                    current.value = value;
                    return;
                } else if (key < current.key) {
                    parent = current;
                    current = current.left;
                } else {
                    parent = current;
                    current = current.right;
                }
            }
            if (key < parent.key) {
                parent.left = new Node(key, value);
            } else {
                parent.right = new Node(key, value);
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    protected class Node {

        private int key;
        private String value;
        private Node left;
        private Node right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public int getKey() {
            return key;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        @Override
        public String toString() {
            // Key - 2, value - Node 2, left - 1, right - 3
            return String.format("Key - %d, value - %s, left - %d, right - %d.", key, value,
                    left == null ? null : left.key,
                    right == null ? null : right.key);
        }
    }
}