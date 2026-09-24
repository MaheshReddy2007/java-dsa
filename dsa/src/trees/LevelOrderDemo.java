package trees;

import java.util.*;

class Node {
    Node left;
    int data;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderDemo {

    static Node addTree(Scanner sc) {

        System.out.println("Enter data:");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        System.out.println("Enter left child (-1 for no child) for " + data + " :");
        root.left = addTree(sc);

        System.out.println("Enter right child (-1 for no child) for " + data + " :");
        root.right = addTree(sc);

        return root;
    }

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.remove();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = addTree(sc);

        System.out.println("Level Order Traversal:");
        levelOrder(root);

        sc.close();
    }
}