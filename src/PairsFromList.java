import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Problem URL: https://practice.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1#
 */
public class PairsFromList {

    public static int countPairs(LinkedList<Integer> head1,
                                 LinkedList<Integer> head2,
                                 int x) {

        int count = 0;

        Set<Integer> s1 = new HashSet<>(head1);
        Set<Integer> s2 = new HashSet<>(head2);
        for (int n : s1) if (s2.contains(x - n)) count++;

        return count;
    }
}
