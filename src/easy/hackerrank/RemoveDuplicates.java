/**
 * <a href="https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem">...</a>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = null;
        if (head != null) {
            ListNode c = head;
            ListNode p;
            while (c != null) {
                res = add(res, c.val);
                p = c;
                c = c.next;
                while (c != null && p.val == c.val) {
                    c = c.next;
                }
            }
            return res;
        }

        return head;
    }

    public ListNode add(ListNode node, int n) {
        if (node == null) return new ListNode(n);
        ListNode c = node;
        while (c.next != null) {
            c = c.next;
        }
        c.next = new ListNode(n);
        
        return node;
    }
}
