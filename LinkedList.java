import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// 1 -> 2
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

    void traverse() {
        System.out.println("The List is: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    void deleteAtBeggining() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            head = head.next;
            System.out.println("Element is deleted..");
        }
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            if (head.next == null)
                head = null;
            else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
            }
            System.out.println("Element is deleted..");
        }

    }
}

public class LinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int data;
        List l = new List();
        while (true) {
            System.out.print(
                    "Select your Choice:\n1.Insert at Beggining\n2.Insert at End\n3.Traverse\n4.Delete at Beggining\n5.Delete at End\n6.Exit\nEnter your option:");
            int ch = in.nextInt();
            switch (ch) {
                case 1:
                    data = in.nextInt();
                    l.insertAtBeggining(data);
                    break;

                case 2:
                    data = in.nextInt();
                    l.insertAtEnd(data);
                    break;
                case 3:
                    l.traverse();
                    break;
                case 4:
                    l.deleteAtBeggining();
                    break;
                case 5:
                    l.deleteAtEnd();
                    break;
                case 6:
                    System.exit(1);
                    break;

                default:
                    break;
            }
        }
    }
}
