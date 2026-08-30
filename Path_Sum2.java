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

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
       

      
    }
    void dfs (TreeNode root , int remaining){
        if(root == null){
            return;
        }

        path.add(root.val);
        remaining -=root.val;

        if(root.left == null && root.right == null && remaining ==0){
            res.add(new ArrayList<>(path));
        }
        dfs(root.left , remaining);
        dfs(root.right , remaining);

        path.remove(path.size()-1);    // it is for backtracking
    }
}
