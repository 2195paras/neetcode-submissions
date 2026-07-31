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
     public boolean isBalanced(TreeNode root) {


    if(height(root)==-1){
      return false;
    }else {
      return true;  }

  }

  public static int height(TreeNode root){
    if(root == null){
      return 0;
    }

    int heightLeft = height(root.left);

    if (heightLeft == -1) {
      return -1;
    }

    int heightRight = height(root.right);

    if (heightRight == -1) {
      return -1;
    }

    int diff=Math.abs(heightLeft-heightRight);

    if(diff>1){
      return -1;
    }else {
      return 1+Math.max(heightLeft,heightRight);
    }
      }
}
