package learn.DSA.LearnLinkedList;

public class InsertAtMiddleExamples {

    static class Node{
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static class  example{

        public static Node inserAtMiddle(Node head, int x){

            if(head==null)
                return new Node(x);

            Node newNode = new Node(x);
            Node curr = head;

            int length=0;
            while(curr!=null){
                length++;
                curr = curr.next;
            }
            int pos = length % 2==0 ? length/2 : (length+1)/2;

            curr =head;

            while (pos-- > 1){
                curr = curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;

            return head;
        }

        public static void print(Node head){
           Node curr = head;
            while(curr!=null) {
                System.out.print(curr.data + "-> ");
                curr = curr.next;
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        Node head= new Node(1);
        head.next = new Node(2);
        head.next.next  = new Node(4);
        head.next.next.next = new Node(5);

        example.print(head);
        head = example.inserAtMiddle(head,3);
        example.print(head);

    }
}
