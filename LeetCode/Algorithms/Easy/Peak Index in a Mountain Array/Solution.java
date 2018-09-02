// TAG: binarySearch
class Solution {

    public static void main(String ...args) {
        int[] mountain = {0, 3, 8, 7, 6, 5, 4, 4, 2, 0};
        peakIndexInMountainArray(mountain);
        peakIndexInMountainArrayFaster(mountain);
        peakIndexInMountainArrayWithBinarySearch(mountain);
    }

    public static int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length; ++i) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                return i;
            }
        }
        return -1; // no peak.
    }

    // alternatve solutions
    // faster - assumes the mountain increases until it doesn't
    public static int peakIndexInMountainArrayFaster(int[] A) {
        int i = 0;
        while (A[i] < A[i + 1]) i++;
        return i;
    }

    // even faster still with binary search
    public static int peakIndexInMountainArrayWithBinarySearch(int[] A) {
        int start = 0, end = A.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < A[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }


}