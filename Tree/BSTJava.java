package Tree;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root; //
            while (true) {
                if (newNode.data < temp.data) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
        }
    }

    void display() {
        displayRec(this.root);
    }

    void displayRec(Node root) {
        if (root == null)
            return;
        // System.out.println(root.data); // preorder
        displayRec(root.left);
        System.out.println(root.data); // inorder
        displayRec(root.right);
        // System.out.println(root.data); // post order
    }
}

public class BSTJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BST b = new BST();
        for (int i = 0; i < n; i++) {
            b.insert(in.nextInt());
        }
        b.display();
    }
}
