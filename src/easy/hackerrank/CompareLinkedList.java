/**
 * <a href="https://www.hackerrank.com/challenges/compare-two-linked-lists/problem">...</a>
 */
class CompareLinkedList {

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode c1 = head1;
        SinglyLinkedListNode c2 = head2;

        while (c1 != null && c2 != null) {
            if (c1.data != c2.data) return false;
            c1 = c1.next;
            c2 = c2.next;
            if (c1 == null && c2 == null) return true;
            if (c1 == null || c2 == null) return false;
        }

        return false;
    }
}
