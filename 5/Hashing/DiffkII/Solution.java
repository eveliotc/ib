// Naive
public class Solution {
    public int diffPossible(final List<Integer> a, int b) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (Math.abs(a.get(i) - a.get(j)) == b) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
