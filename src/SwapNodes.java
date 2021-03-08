/**
 * Swap pair nodes
 *
 * @author Prashant Sharma
 */
public class SwapNodes {

    /**
     *
     * @param head
     * @return swapped list
     */
    public ListNode swapPairs(ListNode head) {

        if (head != null) {
            int temp;
            ListNode currentNode = head;
            while (currentNode != null) {
                if (currentNode.next != null) {
                    temp = currentNode.next.val;
                    currentNode.next.val = currentNode.val;
                    currentNode.val = temp;
                    currentNode = currentNode.next;
                }
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}