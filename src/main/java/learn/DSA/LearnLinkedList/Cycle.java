package learn.DSA.LearnLinkedList;

public class Cycle {

   static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }

       @Override
       public String toString() {
           return "Node{" +
                   "data=" + data +
                   ", next=" + next +
                   '}';
       }
   }

    public static void main(String[] args) {
        Node node1 = new Node(3);
//        Node node2 = new Node(2);
//        Node node3 = new Node(0);
//        Node node4 = new Node(-4);

  //      node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node2;

        System.out.println(hasCycle(node1));

    }

    public static boolean hasCycle(Node head) {



        if(head.next==null || head.next.next==null)
            return false;

        Node slow=head;
        Node fast = slow.next.next;

        while(slow!=null ) {
            if (slow.data == fast.data)
                return true;
            else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }

          return false;

    }

}
