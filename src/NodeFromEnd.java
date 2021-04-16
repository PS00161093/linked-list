/**
 * Problem URL: https://practice.geeksforgeeks.org/problems/nth-ListNode-from-end-of-linked-list/1#
 */
public class NodeFromEnd {

    int getNthFromLast(ListNode head, int n) {

        int index = 0;
        int size = 0;
        ListNode currentNode = head;

        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }

        if (size - n < 0) return -1;

        currentNode = head;
        while (currentNode != null && index != size - n) {
            currentNode = currentNode.next;
            index++;
        }

        return currentNode.val;
    }
}
