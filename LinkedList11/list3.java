package LinkedList11;

class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }
}

class linkedlist {
    node head;
    node tail;
    int size;

    void addattail(int val) {
        node temp = new node(val);
        if (tail == null) {
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
        size++;
    }

    void display() {
        if (head == null) {
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class list3 {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addattail(10);
        list.addattail(11);
        list.addattail(12);
        list.addattail(13);
        list.addattail(14);
        list.addattail(15);
        list.addattail(16);
        list.display();
    }

}
