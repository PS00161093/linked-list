/**
 * <a href="https://www.hackerrank.com/challenges/reverse-a-linked-list/problem">...</a>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head != null) {
            Stack<ListNode> s = new Stack<>();
            ListNode c = head;
            ListNode p = null;
            while (c != null) {
                s.push(c);
                c = c.next;
            }

            ListNode res = null;
            while (!s.isEmpty()) {
                res = add(res, s.pop().val);
            }

            return res;
        }

        return head;
    }

    public ListNode add(ListNode node, int n) {
        if (node == null) return new ListNode(n);
        ListNode c = node;
        ListNode p = null;
        while (c.next != null) {
            p = c;
            c = c.next;
        }
        c.next = new ListNode(n);

        return node;
    }
}
