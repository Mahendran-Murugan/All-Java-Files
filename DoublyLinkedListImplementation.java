
class DNode{
    int data;
    DNode prev;
    DNode next;
    DNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList{
    DNode head;
    DoublyLinkedList(){
        head = null;
    }

    void addFirst(int data){
        DNode newNode = new DNode(data);
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data){
        DNode newNode = new DNode(data);
        if(head == null){
            head = newNode;
        }else{
            DNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void print(){
        DNode temp = head;
        System.out.print("null ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.addFirst(2);
        dl.addFirst(3);
        dl.addFirst(4);
        dl.print();
    }
}
