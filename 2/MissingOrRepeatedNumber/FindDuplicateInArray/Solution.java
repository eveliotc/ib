import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        Set<Integer> u = new HashSet<>(a.size());
        for (int i = 0; i < a.size(); i++) {
            if (!u.add(a.get(i))) {
                return a.get(i);
            }
        }
        return -1;
    }
}
