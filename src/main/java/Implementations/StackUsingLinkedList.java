package Implementations;
// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
public class StackUsingLinkedList {
    private Node top; // Top of the stack

    // Constructor
    public StackUsingLinkedList() {
        this.top = null;
    }

    // Push operation (insert at head)
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + value);
    }

    // Pop operation (remove from head)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    // Peek operation (view top element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.display();

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
