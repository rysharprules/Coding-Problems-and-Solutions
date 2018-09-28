// TAG: binarySearch
class Solution {

    public static void main(String... args) {
        Solution solution = new Solution();

        /*
        nums1 = [1, 3]
        nums2 = [2]

        The median is 2.0
         */
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));

        /*
        nums1 = [1, 2]
        nums2 = [3, 4]

        The median is (2 + 3)/2 = 2.5
         */
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public double findMedianSortedArrays(int[] numbers1, int[] numbers2) {
        int numbers1Length = numbers1.length, numbers2Length = numbers2.length;
        int left = (numbers1Length + numbers2Length + 1) / 2;
        int right = (numbers1Length + numbers2Length + 2) / 2;
        return (getNth(numbers1, 0, numbers2, 0, left) + getNth(numbers1, 0, numbers2, 0, right)) / 2.0;
    }

    public double getNth(int[] numbers1, int numbers1Start, int[] numbers2, int numbers2Start, int k) {
        if (numbers1Start > numbers1.length - 1) return numbers2[numbers2Start + k - 1];
        if (numbers2Start > numbers2.length - 1) return numbers1[numbers1Start + k - 1];
        if (k == 1) return Math.min(numbers1[numbers1Start], numbers2[numbers2Start]);

        int numbers1Mid = Integer.MAX_VALUE, numbers2Mid = Integer.MAX_VALUE;
        if (numbers1Start + k / 2 - 1 < numbers1.length) numbers1Mid = numbers1[numbers1Start + k / 2 - 1];
        if (numbers2Start + k / 2 - 1 < numbers2.length) numbers2Mid = numbers2[numbers2Start + k / 2 - 1];

        if (numbers1Mid < numbers2Mid) {
            return getNth(numbers1, numbers1Start + k / 2, numbers2, numbers2Start, k - k / 2);
        }
        return getNth(numbers1, numbers1Start, numbers2, numbers2Start + k / 2, k - k / 2);
    }
}