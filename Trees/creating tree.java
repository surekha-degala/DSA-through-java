public class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
        }
    }

    public static void main(String[] args) {
        // Create tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Tree created successfully!");
    }
}

