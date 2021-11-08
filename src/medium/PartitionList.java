package medium;

import hard.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/partition-list/
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        ListNode c = head;
        while (c != null) {
            if (c.val < x) smaller.add(c.val);
            else greater.add(c.val);
            c = c.next;
        }

        ListNode res = null;
        for (int n : smaller) res = add(res, n);
        for (int n : greater) res = add(res, n);

        return res;
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
