/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public static void main(String... args) {
        Solution solution = new Solution();

        /*

        Input:

        treeNodeOne                   treeNodeTwo
              1                         2
             / \                       / \
            3   2                     1   3
           /                           \   \
          5                             4   7

        */

        TreeNode treeNodeOne = new TreeNode(1);
        treeNodeOne.left = new TreeNode(2);
        TreeNode treeNodeOneRight = new TreeNode(3);
        treeNodeOneRight.right = new TreeNode(5);
        treeNodeOne.right = treeNodeOneRight;

        TreeNode treeNodeTwo = new TreeNode(2);
        TreeNode treeNodeTwoLeft = new TreeNode(3);
        treeNodeTwo.left = treeNodeTwoLeft;
        treeNodeTwoLeft.left = new TreeNode(7);
        TreeNode treeNodeTwoRight = new TreeNode(1);
        treeNodeTwoRight.left = new TreeNode(4);
        treeNodeTwo.right = treeNodeTwoRight;

        /*

        Output:

        Merged tree:
                 3
                / \
               4   5
              / \   \
             5   4   7

        */

        System.out.println(solution.mergeTrees(treeNodeOne, treeNodeTwo));

    }

    public TreeNode mergeTrees(TreeNode treeOne, TreeNode treeTwo) {
        // so many opportunities to fall foul of NPE
        boolean isTreeOneNull = treeOne == null;
        boolean isTreeTwoNull = treeTwo == null;

        if (isTreeOneNull && isTreeTwoNull) return null; // both nodes are null so return null

        TreeNode mergedTree = new TreeNode((isTreeOneNull ? 0 : treeOne.val) + (isTreeTwoNull ? 0 : treeTwo.val));

        mergedTree.left = mergeTrees((isTreeOneNull ? null : treeOne.left), (isTreeTwoNull ? null : treeTwo.left));
        mergedTree.right = mergeTrees((isTreeOneNull ? null : treeOne.right), (isTreeTwoNull ? null : treeTwo.right));

        return mergedTree;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "[val=" + this.val + " right=" + this.right + " left=" + this.left + "] ";
    }
}