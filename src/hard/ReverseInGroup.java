package hard;

import java.util.ArrayList;
import java.util.List;

public class ReverseInGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head != null && k > 1) {

            ListNode currNode = head;
            int size = getSize(currNode);
            int subListCnt = size / k;

            currNode = head;
            ListNode subList = null;
            int reversedListSize = 0;
            List<ListNode> list = new ArrayList<>();

            for (int i = 0; i < subListCnt; i++) {
                int batch = k;
                while (batch > 0 && currNode != null) {
                    subList = prepend(subList, currNode.val);
                    reversedListSize++;
                    currNode = currNode.next;
                    batch--;
                }
                list.add(subList);
                subList = null;
            }

            ListNode reversed = mergeReversedList(list);

            currNode = head;

            return (size - reversedListSize > 0) ? addRemaining(currNode, reversedListSize, reversed) : reversed;

        }

        return head;
    }

    private ListNode mergeReversedList(List<ListNode> list) {

        ListNode reversed = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            ListNode temp = reversed;
            while (temp.next != null) temp = temp.next;
            temp.next = list.get(i);
        }

        return reversed;
    }

    private ListNode addRemaining(ListNode currNode, int reversedListSize, ListNode reversed) {

        while (reversedListSize > 0) {
            currNode = currNode.next;
            reversedListSize--;
        }

        return append(reversed, currNode);
    }

    private int getSize(ListNode currNode) {

        int size = 0;

        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }

        return size;
    }

    ListNode append(ListNode originalNode, ListNode nodeToAdd) {

        ListNode currNode = originalNode;

        while (currNode.next != null) currNode = currNode.next;
        currNode.next = nodeToAdd;

        return originalNode;
    }

    ListNode prepend(ListNode node, int val) {

        if (node == null) return new ListNode(val);
        ListNode newNode = new ListNode(val);
        newNode.next = node;

        return newNode;
    }

}

class ListNode {

    public int val;

    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}