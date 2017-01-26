import java.util.*;

public class Solution {
    Set<ArrayList<Integer>> uniques;

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        clear();
        add(a);
        permute(a, 0, a.size() - 1);
        return new ArrayList<ArrayList<Integer>>(uniques);
    }

    private void permute(ArrayList<Integer> a, int start, int end) {
        if (start == end) {
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(a, start, i);
            permute(a, start + 1, end);
            swap(a, start, i);
        }
    }

    private void swap(ArrayList<Integer> w, int i, int wi) {
        Integer v = w.get(i);
        w.set(i, w.get(wi));
        w.set(wi, v);
        add(w);
    }


    private void add(ArrayList<Integer> p) {
        uniques.add(new ArrayList<>(p));
    }

    private void clear() {
        uniques = new HashSet<>();
    }
}