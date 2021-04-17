import java.util.HashMap;
import java.util.Map;

/**
 * Problem URL: https://practice.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1#
 */
public class CloneLinkedList {

    public Node copyList(Node head) {

        if (head == null) return null;

        Node c = head;
        Map<Node, Node> map = new HashMap<>();
        while (c != null) {
            Node clone = new Node(c.data);
            map.put(c, clone);
            c = c.next;
        }

        Node c1 = head;
        while (c1 != null) {
            Node n = map.get(c1);
            if (c1.next != null) n.next = map.get(c1.next);
            if (c1.arb != null) n.arb = map.get(c1.arb);
            c1 = c1.next;
        }

        return map.get(head);
    }

}

class Node {

    int data;
    Node next, arb;

    Node(int d) {
        data = d;
        next = arb = null;
    }

}
