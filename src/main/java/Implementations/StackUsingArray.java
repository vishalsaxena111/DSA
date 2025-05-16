package Implementations;

class Stack{
    int maxsize;
    int top;
    int[] stackArr;

    public Stack(int size){

        this.maxsize= size;
        this.top=-1;
        this.stackArr = new int[size];

    }

    public void push(int element){

        if(isFull()) {
            System.out.println("stack is full");
            return;
        }

        stackArr[++top] = element;

    }

    public int pop(){

        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }

        return stackArr[--top];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stackArr[top];

    }

    private boolean isFull(){
        return top == maxsize-1;
    }

    private boolean isEmpty(){
        return top == -1;
    }

    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArr[i] + " ");
        }
    }


}

public class StackUsingArray {

    public static void main(String[] args)throws ClassNotFoundException {
        Stack stack = new Stack(5);

        stack.push(2);
        stack.push(4);
        stack.push(5);

        stack.print();
        System.out.println();
        stack.pop();
        stack.print();
        System.out.println();
        System.out.println(stack.peek());
    }


}
