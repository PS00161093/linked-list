/**
 * <a href="https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem">...</a>
 */
class MergeSortedList {

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        if (head1 == null) return head2;
        if (head2 == null) return head1;

        SinglyLinkedListNode c1 = head1;
        SinglyLinkedListNode c2 = head2;
        SinglyLinkedListNode sortedList = null;

        while (c1 != null && c2 != null) {
            if (c1.data > c2.data) {
                sortedList = add(sortedList, c2.data);
                c2 = c2.next;
            } else if (c1.data < c2.data) {
                sortedList = add(sortedList, c1.data);
                c1 = c1.next;
            } else {
                sortedList = add(sortedList, c1.data);
                sortedList = add(sortedList, c2.data);
                c1 = c1.next;
                c2 = c2.next;
            }
        }

        if (c1 != null) {
            while (c1 != null) {
                sortedList = add(sortedList, c1.data);
                c1 = c1.next;
            }
        }

        if (c2 != null) {
            while (c2 != null) {
                sortedList = add(sortedList, c2.data);
                c2 = c2.next;
            }
        }

        return sortedList;

    }
}
