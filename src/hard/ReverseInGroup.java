package hard;

import java.util.ArrayList;
import java.util.List;

public class ReverseInGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head != null && k > 1) {

            ListNode c = head;
            int size = 0;
            List<ListNode> list = new ArrayList<>();
            while (c != null) {
                c = c.next;
                size++;
            }
            int subListCnt = size / k;
            int tempSize = 0;
            ListNode res = null;
            c = head;
            for (int i = 0; i < subListCnt; i++) {
                int batch = k;
                while (batch > 0 && c != null) {
                    res = addtoEnd(res, c.val);
                    tempSize++;
                    c = c.next;
                    batch--;
                }
                list.add(res);
                res = null;
            }

            ListNode op = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                ListNode add = list.get(i);
                ListNode temp = op;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = add;
            }
            c = head;
            if (size - tempSize > 0) {
                while (tempSize > 0) {
                    c = c.next;
                    tempSize--;
                }
                op = add(op, c);
            }

            return op;
        }
        return head;
    }

    ListNode add(ListNode o, ListNode l) {
        ListNode t = o;
        while (t.next != null) {
            t = t.next;
        }
        t.next = l;

        return o;
    }

    ListNode addtoEnd(ListNode node, int v) {

        if (node == null) return new ListNode(v);
        ListNode newNode = new ListNode(v);
        newNode.next = node;
        return newNode;
    }

}
