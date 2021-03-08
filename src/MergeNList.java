/**
 * Merge N Sorted LinkedList
 *
 * @author Prashant Sharma
 */

public class MergeNList {

    /**
     *
     * @param lists
     * @return merged & sorted list
     */
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists != null && lists.length > 0) {
            ListNode mergedList = lists[0];
            for (int i = 1; i < lists.length; i++) {
                ListNode currentNode = lists[i];
                while (currentNode != null) {
                    mergedList = addSorted(mergedList, currentNode.val);
                    currentNode = currentNode.next;
                }
            }
            return mergedList;
        }
        return null;
    }

    /**
     *
     * @param mergedList
     * @param val
     * @return
     *
     * Add new Node in the list in sorted fashion.
     */
    public ListNode addSorted(ListNode mergedList, int val) {

        if (mergedList == null) return new ListNode(val);

        ListNode newNode = new ListNode(val);
        ListNode currentNode = mergedList;
        ListNode previousNode = null;

        while (currentNode != null && val >= currentNode.val) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        newNode.next = currentNode;
        if (previousNode != null) previousNode.next = newNode;
        else mergedList = newNode;

        return mergedList;
    }
}

/**
 * The type List node.
 */
class ListNode {

    int val;

    ListNode next;

    ListNode() { }

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}