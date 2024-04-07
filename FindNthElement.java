import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LList {
    Node head;

    LList() {
        head = null;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    int find(int pos) {
        int count = 1;
        Node temp = head;
        while (count < pos && temp != null) {
            temp = temp.next;
            count++;
        }
        return temp.data;
    }
}

public class FindNthElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LList l = new LList();
        for (int i = 0; i < n; i++) {
            l.insertAtEnd(in.nextInt());
        }
        int pos = in.nextInt();
        System.out.println(l.find(pos));
        in.close();
    }
}
