class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        final int size = a.size();
        int start = 0, end = size - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int v = a.get(mid);
            if (v == b) {
                return mid;
            } else if (v < b) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
