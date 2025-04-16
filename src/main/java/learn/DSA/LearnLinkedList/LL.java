package learn.DSA.LearnLinkedList;

public class LL {
    Node head;
    int size;
    class Node{
        String data;
        Node next;

        Node(String s){
            this.data=s;
            this.next = null;
            size++;
        }

    }

    public void getSize(){
        System.out.println();
        System.out.println("size is: "+size);
    }

    //  add node at first
    public void addFirst(String s){
        Node newNode = new Node(s);
        newNode.next= head;
        head = newNode;

    }

    // add node at last
    public void addLast(String s){

        Node newNode = new Node(s);

        if(head==null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next!=null){
             curr = curr.next;
        }
        curr.next = newNode;
    }

    // delete at first node

    public void deleteFirst(){

       head = head.next;
       size--;
    }

    // delete at last node
    public void deleteLast(){
        if(head==null)
            System.out.println( "list is empty");

        size--;
        if(head.next== null)
            head = null;

        Node curr = head;
        Node last = head.next;

        while (last.next!=null ){
            curr = curr.next;
            last = last.next;
        }

        curr.next = null;

    }


    public void print(){

        Node curr = head;

        while(curr!=null){
            System.out.print(curr.data+"-> ");
            curr  = curr.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("hello");
        list.addFirst("lits");

        list.addLast("this");
        list.addLast("hii");

        list.print();
        System.out.println();
        list.deleteFirst();

        list.print();
        System.out.println();
        list.deleteLast();

        list.print();
        list.getSize();
    }




}
