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

    void addathead(int val) {
        node temp = new node(val);
        if (head == null) {
            head = tail = temp;
        }
        temp.next = head;
        head = temp;
        size++;
    }

    void deletenode(int val) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            head = tail = null;
        }
        size--;
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
        list.addathead(9);
        list.display();
        list.addathead(52);
        list.display();
        list.addathead(94552);
        list.display();
        list.addathead(911);
        list.display();
        list.addathead(955);
        list.display();
        list.deletenode(955);
        list.display();
    }

}
