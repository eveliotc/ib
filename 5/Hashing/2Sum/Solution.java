class Solution {
    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            Integer n = a.get(i);
            List<Integer> idx = m.get(n);
            if (idx == null) {
                idx = new ArrayList<>();
                m.put(n, idx);
            }
            idx.add(i);
        }
        
        int[] r = new int[2];
        for (int i = 0; i < a.size(); i++) {
            int target = b - a.get(i);
            List<Integer> idx = m.get(target);
            if (idx == null) {
                continue;
            }
            
            if (i > idx.get(0)) {
                continue;
            }
            int ptarget = b - target;
            boolean same = ptarget == target;
            
            if (same && idx.size() < 2) {
                continue;
            }
            
            int index1 = (same ? idx.get(0) : i) + 1;
            int index2 = idx.get(same ? 1 : 0) + 1;
            if (r[1] > index2 || isZeroes(r)) {
                r[0] = index1;
                r[1] = index2;
            }
            
        }
        
        ArrayList<Integer> rl = new ArrayList<>();
        if (isZeroes(r)) {
            return rl;
        }
        
        rl.add(r[0]);
        rl.add(r[1]);
        
        return rl;
    }
    
    static boolean isZeroes(int[] r) {
        return r[0] == 0 || r[1] == 0;
    }
}
