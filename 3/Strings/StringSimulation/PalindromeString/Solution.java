public class Solution {
    public int isPalindrome(String a) {
        char[] cs = a.trim().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : cs) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        cs = sb.toString().toCharArray();
        int h = cs.length / 2;
        for (int i = 0; i < h; i++) {
            if (cs[i] != cs[cs.length - 1 - i]) {
                return 0;
            }
        }
        return 1;
    }
}

