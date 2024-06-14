class Stack {
    int stack[];
    int top;

    Stack(int len) {
        stack = new int[len];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (stack.length - 1 == top);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stack[++top] = data;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }
}

public class Day5Testing {
    public static void main(String[] args) {
        Stack st = new Stack(101);
        st.push(0);
        st.push(10);
        System.out.println(st.peek());
    }
}

// stack -> LIFO

// op: push() pop() peek() top -1 top++ top--

// array 100 [0][1][2][3] .. [99]

// Queue -> FIFO