class DeleteGivenNode {

    /*
     * https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem?isFullScreen=true
     * Complete the 'deleteNode' function below.
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {

        if (llist == null) return null;
        if (position == 0) return llist.next;

        int i = 0;
        SinglyLinkedListNode c = llist;
        SinglyLinkedListNode p = null;
        while (i < position) {
            p = c;
            c = c.next;
            i++;
        }
        p.next = c.next;
        return llist;
    }

}
