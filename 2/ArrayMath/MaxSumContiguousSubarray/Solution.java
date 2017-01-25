import java.util.*;

public class Solution {
  // DO NOT MODFIY THE LIST
  public int maxSubArray(final List<Integer> a) {
    int sum = a.get(0);
    int max = sum;
    for (int i = 1; i < a.size(); i++) {
      int v = a.get(i);
      sum = Math.max(v, sum + v);
      max = Math.max(max, sum);
    }
    return max;
  }
}
