package learn.DSA.LearnLinkedList;

public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
     class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //insert node in first
    public LinkedList addFirst(LinkedList list, int data){

         Node new_node = new Node(data);
         new_node.next = head;
         head = new_node;

         return list;
    }

    // Method to insert a new node in last
    public  LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);


        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }

            // Insert the new_node at last node
            curr.next = new_node;  // new node ka next null
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public void printList()
    {
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + "-> ");

            // Go to next node
            currNode = currNode.next;
        }

        System.out.print("null");
    }

    // Driver code
    public static void main(String[] args)
    {

        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        list.printList();
        // Insert the values
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);
        list = list.insert(list, 6);
        list = list.insert(list, 7);
        list = list.insert(list, 8);

        list = list.addFirst(list, 11);


        // Print the LinkedList
        list.printList();
    }
}
