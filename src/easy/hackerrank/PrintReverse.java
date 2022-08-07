public class PrintReverse {

    /*
     * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {

        java.util.Stack<SinglyLinkedListNode> stack = new java.util.Stack<>();

        if (head != null) {
            SinglyLinkedListNode currentNode = head;

            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.next;
            }

            while (!stack.isEmpty()) {
                System.out.println((stack.pop()).data);
            }
        }
    }
}
