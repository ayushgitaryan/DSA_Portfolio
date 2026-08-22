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
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        
        // preorder traversal says NLR
        return build(preorder , Integer.MAX_VALUE);


    }
    private TreeNode build(int [] preorder , int bound){
        if(index == preorder.length || preorder[index] > bound ){
            return null;
        }

        //Root - Left - Right
        TreeNode root = new TreeNode(preorder[index]);    // root
        index++;

        //left 
        root.left = build(preorder , root.val);
        //right
        root.right = build(preorder , bound);

        return root;


    }
}
