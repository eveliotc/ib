import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> a, int k) {
        List<Integer> sorted = new ArrayList<>(a);
        Collections.sort(sorted);
        return sorted.get(k - 1);
    }
}
