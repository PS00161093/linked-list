import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem URL: https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1#
 *
 * where, k <= length of the linked list.
 */
public class RotateListByK {

    public Node rotate(Node head, int k) {

        Node currNode = head;
        List<Integer> list = new ArrayList<>();
        while (currNode != null) {
            list.add(currNode.data);
            currNode = currNode.next;
        }


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int rotatedIndex = i + k;
            if (rotatedIndex < list.size()) map.put(i, rotatedIndex);
            else map.put(i, rotatedIndex - list.size());
        }

        int index = 0;
        currNode = head;
        while (currNode != null) {
            currNode.data = list.get(map.get(index));
            currNode = currNode.next;
            index++;
        }

        return head;

    }
}
