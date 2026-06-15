package LinkedList11;

class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }
}

public class list1 {
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

        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);
        System.out.println(f.val);
        System.out.println(g.val);

        System.out.println("  " + a);

        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);
        System.out.println(f.next);
        System.out.println(g.next);

    }

}
