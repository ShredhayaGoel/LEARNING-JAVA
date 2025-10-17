package LinkedList;

    
    class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert a new node at the beginning of the list
    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;  // Link to current head
        head = newNode;       // Update head to new node
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
    public class createlist {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements to create the list: 3 -> 2 -> 1 -> null
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);

        System.out.println("Linked list after inserting nodes:");
        list.printList();  // Output: 3 -> 2 -> 1 -> null
    }
}
