public class Solution {
    public String reverseWords(String a) {
        String[] words = a.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String s = words[i].trim();
            if (!s.isEmpty()) {
                sb.append(s).append(' ');
            }
        }
        return sb.toString().trim();
    }
}

