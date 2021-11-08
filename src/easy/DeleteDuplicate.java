package easy;

import hard.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class DeleteDuplicate {

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode c = head;
        if (head != null) {
            ListNode res = null;
            while (c != null) {
                if (!set.contains(c.val)) {
                    res = add(res, c.val);
                    set.add(c.val);
                }
                c = c.next;
            }
            return res;
        }

        return head;
    }

    public ListNode add(ListNode node, int val) {
        ListNode newNode = new ListNode(val);
        if (node == null) return newNode;
        ListNode c = node;
        while (c.next != null) c = c.next;
        c.next = newNode;
        return node;
    }
}
