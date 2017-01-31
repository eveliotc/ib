public class Solution {
    public int colorful(int a) {
        HashSet<Integer> r = new HashSet<>();
        char[] d = String.valueOf(a).toCharArray();
        for (int i = d[0] == '-' ? 1 : 0; i < d.length; i++) {
            int v = Character.getNumericValue(d[i]);
            if (!r.add(v)) {
                return 0;
            }
            int m = v;
            for (int j = i + 1; j < d.length; j++) {
                int n = Character.getNumericValue(d[j]);
                m *= n;
                if (!r.add(m)) {
                    return 0;
                }
            }
        }

        return 1;
    }
}

