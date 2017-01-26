public class Solution {
    public int lengthOfLastWord(final String a) {
        String t = a == null ? "" : a.trim();
        if (t.isEmpty()) {
            return 0;
        }
        char[] c = t.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == ' ') {
                return c.length - i - 1;
            }
        }
        return t.length();
    }
}

