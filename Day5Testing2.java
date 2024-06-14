class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackClass {
    StackNode head, tail;

    StackClass() {
        head = tail = null;
    }

    void insertAtEnd(int data) {
        if (tail == null) {
            StackNode newNode = new StackNode(data);
            if (head == null) {
                tail = newNode;
            }
            newNode.next = head;
            head = newNode;
        } else {
            StackNode newNode = new StackNode(data);
            tail.next = newNode;
            tail = newNode;
        }
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            StackNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            System.out.println(temp.data);
        }
    }

    public int peek() {
        if (tail == null) {
            System.out.println("Empty");
            return -1;
        }
        return tail.data;
    }
}

public class Day5Testing2 {
    public static void main(String[] args) {
        StackClass l = new StackClass();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.deleteAtEnd();
        l.insertAtEnd(40);
    }
}

// Singly 1 -> 2 -> null
// Doubly 1 -> <- 2 -> <- null

// head = null

// head = 1

// newnode.next = head = 1

// 0 -> 1

// newnode.next = head = null

// head -> 10 -> null

// head -> null

// head -> 10

// no value tail = null

// head -> 10 -> null

// tail -> 10 -> null

// 20.next -> null

// tail.next = newNode;

// head -> 10 -> 20 -> 30 -> 40

// head -> 10 -> null

// head -> 10 -> 20 -> null

// head = head.next;