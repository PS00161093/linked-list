import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveElement {

    public ListNode removeElements(ListNode head, int val) {

        List<Integer> list = new ArrayList<>();
        ListNode c = head;
        while (c != null) {
            if (c.val != val) list.add(c.val);
            c = c.next;
        }

        ListNode res = null;
        for (int i : list) res = add(res, i);

        return res;
    }

    public ListNode add(ListNode node, int v) {
        if (node == null) return new ListNode(v);
        ListNode c = node;
        while (c.next != null) c = c.next;
        c.next = new ListNode(v);

        return node;
    }
}
