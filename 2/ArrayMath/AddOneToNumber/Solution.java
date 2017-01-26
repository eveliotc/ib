import java.util.*;

public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        final int size = a.size();
        int i = 0;
        while (size > 1 && a.get(i) == 0 && i < size) {
            i++;
        }

        int l = a.size() - 1;
        Deque<Integer> r = new ArrayDeque<>(size);
        boolean add = true;
        while (l >= i) {
            int item = a.get(l);
            int last = add ? item + 1 : item;
            if (last > 9) {
                r.addFirst(0);
            } else {
                add = false;
                r.addFirst(last);
            }
            l--;
        }
        if (r.peekFirst() == 0) {
            r.addFirst(1);
        }
        return new ArrayList<>(r);
    }
}
