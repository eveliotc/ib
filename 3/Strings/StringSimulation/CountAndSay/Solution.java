public class Solution {
    public String countAndSay(int a) {
        String result = "1";
        for (int i = 1; i < a; i++) {
            result = countAndSay(result);
        }
        return result;
    }

    private String countAndSay(String s) {
        char[] cs = s.toCharArray();
        int n = 0;
        char c = cs[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {
            if (c == cs[i]) {
                n++;
            } else {
                sb.append(n).append(c);
                c = cs[i];
                n = 1;
            }
        }
        if (n > 0) {
            sb.append(n).append(c);
        }
        return sb.toString();
    }
}

