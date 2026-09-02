/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root ,root.val);
    }

    public int dfs(TreeNode root , int maxi){ // maxi = max value so far from root to desired node
        if(root == null ){
            return 0;

        }
        int count = 0;
        if(root.val>=maxi){
            count = 1;
        }
        // update maxi 
        maxi = Math.max(maxi,root.val);

        count+=dfs(root.left , maxi);      // add dfs to count
        count+= dfs(root.right , maxi);

        return count;


    }
}
