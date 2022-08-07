/**
 * <a href="https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem">...</a>
 */
class CyclicList {
    static boolean hasCycle(SinglyLinkedListNode head) {

        if (head == null) return false;
        SinglyLinkedListNode faster = head;
        SinglyLinkedListNode slower = head;

        while (true) {
            if (faster.next != null) faster = faster.next.next;
            else return false;
            slower = slower.next;
            if (slower == null || faster == null) return false;
            if (slower == faster) return true;
        }
    }
    
}
