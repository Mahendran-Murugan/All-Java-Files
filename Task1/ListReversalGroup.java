package Task1;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head, tail;

    List() {
        head = tail = null;
    }

    void insertAtBeggining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Element is inserted..");
    }

    void insertAtEnd(int data) {
        if (tail == null) {
            insertAtBeggining(data);
        } else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Element is inserted..");
    }

    Node reverse(Node head, int k) {
        if (head == null)
            return head;
        Node currNode = head, prevNode = null, nextNode = null;
        int count = 0;
        while (count < k && currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            count++;
        }
        if (nextNode != null) {
            head.next = reverse(nextNode, k);
        }
        return prevNode;
    }

    void traverse() {
        System.out.println("The List is: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
}

public class ListReversalGroup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List l = new List();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            l.insertAtEnd(in.nextInt());
        }
        int k = in.nextInt();
        l.traverse();
        l.head = l.reverse(l.head, k);
        l.traverse();
    }
}
