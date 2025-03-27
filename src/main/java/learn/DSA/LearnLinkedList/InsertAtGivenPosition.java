package learn.DSA.LearnLinkedList;

public class InsertAtGivenPosition {

    static class Node{
        int data;
        Node next;

        public Node(int d){
            this.data =d;
            this.next = null;
        }
    }

    static class examples{

        public static Node insertAtPosition(Node head, int d, int pos){

            if(head==null)
                return new Node(d);

            Node newNode= new Node(d);
            Node curr = head;

            int length=1;
            while (curr!=null){
                length++;
                curr = curr.next;
            }

            if(pos > length || pos<0)
                System.out.println("position is exceeding the list length");
            else if(pos==length){
                curr = head;
                while (curr.next!=null){
                    curr= curr.next;

                }
                curr.next = newNode;
            } else if (pos==0) {
               // System.out.println("hhh"+head.data);
                newNode.next= head;
                head = newNode;

            } else {
                int matcher =1;
                curr = head;
                while (curr!=null){
                    if(matcher==pos-1){
                        newNode.next = curr.next;
                        curr.next = newNode;
                        return head;
                    }
                    curr = curr.next;
                    matcher++;

                }
            }

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

        examples.print(head);
        head =examples.insertAtPosition (head, 3,-1);
        examples.print(head);

    }
}
