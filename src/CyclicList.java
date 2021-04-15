/**
 * Find cyclic dependency in linked-list: Floyd's cycle-finding algorithm, also known as tortoise and hare algorithm.
 * <p>
 * The idea is to have two references to the list and move them at different speeds.
 * Move one forward by 1 node and the other by 2 nodes.
 * <p>
 * If the linked list has a loop they will definitely meet.
 * Else either of the two references(or their next) will become null.
 */
public class CyclicList {

    public boolean isCyclicList(ListNode root) {

        if (root == null) return false;

        ListNode slower = root;
        ListNode faster = root;

        while (true) {

            if (faster.next != null) faster = faster.next.next;
            else return false;

            slower = slower.next;

            if (slower == null || faster == null) return false;

            if (slower == faster) return true;

        }
    }

}
