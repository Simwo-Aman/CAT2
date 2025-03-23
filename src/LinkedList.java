
public class LinkedList {

    // class for the nodes in our linked list
    class Node {
        int data;    // The value stored in this node
        Node next;   // Points to the next node in the list

        // Constructor to make a new node with some data
        public Node(int data) {
            this.data = data;   // Stores the data
            this.next = null;   // New nodes don't point to anything yet
        }
    }

    private Node head; // The head points to the first node in our list

    //  new list created
    public LinkedList() {
        this.head = null;
    }

    //Function that adds a new node with the given data at the beginning of the list
    public void insertAtBeginning(int data) {
        //  new node to hold this data
        Node newNode = new Node(data);

        // new node should point to the current first node
        newNode.next = head;

        // Updated head to point to our new first node
        head = newNode;

        System.out.println(data + " inserted at the beginning");
    }


     //Function that adds a new node with the given data at the end of the list
         public void insertAtEnd(int data) {
        // new node to hold this data
        Node newNode = new Node(data);

        // Special case: if the list is empty
        if (head == null) {
            head = newNode;
            System.out.println(data + " inserted at the end");
            return;
        }
        // Start at the head
        Node current = head;

        // Traverse until we find the last node
        while (current.next != null) {
            current = current.next;
        }
        // Make the last node point to our new node
        current.next = newNode;
        System.out.println(data + " inserted at the end");
    }

    //Function that removes the first node from the list
        public int deleteFromBeginning() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return -1;  // Return -1 to indicate there was nothing to delete
        }
        // Save the data so we can return it
        int deletedData = head.data;
        // Move head to point to the second node
        // (which becomes the new first node)
        head = head.next;

        System.out.println(deletedData + " deleted from the beginning");
        return deletedData;
    }

   //Prints out all the elements in the linked list
     public void display() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // Start at the head
        Node current = head;
        // Print the list
        System.out.print("Linked List: ");
        // Go through each node and print its data
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;  // Move to the next node
        }
        // Print null to show the end of the list
        System.out.println("null");
    }

   // Test method to demonstrate the linked list operations
      public static void main(String[] args) {
        // Create a new empty linked list
        LinkedList list = new LinkedList();

        // some numbers added at the beginning
        list.insertAtBeginning(1);
        list.insertAtBeginning(7);
        list.display();

        //some numbers added at the end
        list.insertAtEnd(20);
        list.insertAtEnd(16);
        list.display();

        // Delete from the beginning testing
        list.deleteFromBeginning();
        list.display();
        list.deleteFromBeginning();
        list.display();
    }
}