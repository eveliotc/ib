public class Solution {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
        final int size = a.size();
        if (size == 0) return -1;
        if (size == 1) return a.get(0) == b ? 0 : -1;

        return rotatedSearch(a, b);
    }

    static int rotatedSearch(final List<Integer> a, int b) {
        int start = 0;
        int end = a.size() - 1;

        int firstV = a.get(start);
        int lastV = a.get(end);

        if (lastV > firstV) { // Not actually rotated
            return binarySearch(a, b); // O(log n)
        }

        while (start < end) {
            firstV = a.get(start);
            lastV = a.get(end);
            int mid = start + (end - start) / 2;
            int midV = a.get(mid);

            if (midV == lastV && mid != end) { // duplicates
                return linearSearch(a, b); // O(n)
            }

            if (midV > lastV) { // Smallest value it's (mid, end]
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        if (start == end) {
            final int smallestIndex = start;
            final int greatestIndex = start - 1;
            int smallest = a.get(smallestIndex);
            int greatest = a.get(greatestIndex);
            if (b == smallest) return smallestIndex;
            if (b == greatest) return greatestIndex;

            if (b > smallest && b <= a.get(a.size() - 1)) {
                int index = binarySearch(a.subList(smallestIndex, a.size()), b);
                return index == -1 ? -1 : smallestIndex + index;
            }
            if (b >= a.get(0) && b < greatest) {
                return binarySearch(a.subList(0, greatestIndex), b);
            }
        }

        return -1;
    }

    static int linearSearch(final List<Integer> a, int b) {
        int start = 0, end = a.size() - 1;
        while (start <= end) {
            if (a.get(start) == b) return start;
            if (a.get(end) == b) return end;
            start++;
            end--;
        }
        return -1;
    }

    static int binarySearch(final List<Integer> a, int b) {
        int start = 0, end = a.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int v = a.get(mid);
            if (v == b) {
                return mid;
            }

            if (v < b) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}

