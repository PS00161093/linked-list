package medium;


import src.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        while (left < right) {
            ListNode lef = getNodeAt(left, head);
            ListNode rig = getNodeAt(right, head);
            int temp = lef.val;
            lef.val = rig.val;
            rig.val = temp;

            left++;
            right--;
        }
        return head;
    }

    public ListNode getNodeAt(int idx, ListNode head) {
        ListNode c = head;
        for (int i = 1; i < idx; i++) {
            c = c.next;
        }

        return c;
    }
}
