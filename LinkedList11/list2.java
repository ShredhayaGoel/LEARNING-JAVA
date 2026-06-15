package LinkedList11;

// traversing linked list 
class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }
}

public class list2 {
    // by while loop
    public static void displaydata(node head) {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displaydata2(node head) {
        // by for loop
        for (node temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.val);
        }
        System.out.println();
    }

    public static void displaydata3(node head) {
        // through recursion
        if (head == null) {
            return;
        }
        System.out.println(head.val);
        displaydata3(head.next);
    }

    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(11);
        node c = new node(12);
        node d = new node(13);
        node e = new node(14);
        node f = new node(15);
        node g = new node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        displaydata(a);
        displaydata2(a);
        displaydata3(a);
    }
}
