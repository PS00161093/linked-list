/**
 * Problem URL: https://leetcode.com/problems/remove-linked-list-elements/
 */
public class DeleteNode {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return head;

        ListNode currNode = head;
        ListNode prevNode = null;
        head = null;

        while (currNode != null) {
            if (currNode.val == val) {
                if (prevNode != null) {
                    prevNode.next = currNode.next;
                }
            } else {
                if (prevNode == null) {
                    head = currNode;
                }
                prevNode = currNode;
            }
            currNode = currNode.next;
        }

        return head;

    }
}
