/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeWithoutHeadRef {

    public void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
