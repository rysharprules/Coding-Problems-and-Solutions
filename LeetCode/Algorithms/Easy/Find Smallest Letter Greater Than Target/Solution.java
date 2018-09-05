// TAG: binarySearch
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] test = new char[]{'c', 'f', 'j'};

        System.out.println(solution.nextGreatestLetter(test, 'a')); // c
        System.out.println(solution.nextGreatestLetter(test, 'c')); // f
        System.out.println(solution.nextGreatestLetter(test, 'd')); // f
        System.out.println(solution.nextGreatestLetter(test, 'g')); // j
        System.out.println(solution.nextGreatestLetter(test, 'j')); // c
        System.out.println(solution.nextGreatestLetter(test, 'k')); // c
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int lo = 0, hi = n;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (letters[mid] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        // lo can end up pointing to index n, in which case we return the first element
        return letters[lo % n];
    }
}