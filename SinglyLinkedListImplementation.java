
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class linkedList{
    Node head;
    linkedList(){
        head = null;
    }

    void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void delFirst(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            head = head.next; 
        }
    }

    void delLast(){
        if(head == null){
            System.out.println("List is empty");
        }else if(head.next.next == null){
            head = head.next; 
        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
}

public class SinglyLinkedListImplementation {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.print();
        ll.delFirst();
        ll.print();
        ll.delLast();
        ll.print();
    }
}
