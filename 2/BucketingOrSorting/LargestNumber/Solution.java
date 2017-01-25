import java.util.*;

public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	    List<Integer> sorted = sort(a);
	    StringBuilder sb = new StringBuilder();
	    for (Integer i : sorted) {
	        sb.append(String.valueOf(i));
	    }
	    return sb.toString();
	}

	private List<Integer> sort(final List<Integer> a) {
	    List<Integer> s = new ArrayList<>(a.size());
	    s.add(a.get(0));
	    for (int i = 1; i < a.size(); i++) {
	        Integer v = a.get(i);
	        insert(v, s);
	    }
	    return s;
	}

	private void insert(Integer v, List<Integer> s) {
	    // TODO better insertion
	    for (int i = 0; i < s.size(); i++) {
    	    Integer mv = s.get(i);
    	    int cr = compare(v, mv);
    	    if (cr == 0 || cr == 1) { // equals or v is greater than mv so it should be put on the left (closer to zero)
    	        if (v == 0 && i == 0) {
    	          return; // Skip leading zeros
    	        }
    	        s.add(i, v);
    	        return;
    	    }
	    }
	    s.add(v);
	}

	private int compare(Integer a, Integer b) {
	    if (a == b) {
	        return 0;
	    }
	    String as = String.valueOf(a);
	    String bs = String.valueOf(b);

	    String ab = as + bs;
	    String ba = bs + as;

	    char[] ca = ab.toCharArray();
	    char[] cb = ba.toCharArray();
	    for (int i = 0; i < ca.length; i++) {
	        if (ca[i] != cb[i]) {
	            return ca[i] < cb[i] ? -1 : 1;
	        }
	    }
	    return 0;
	}
}
