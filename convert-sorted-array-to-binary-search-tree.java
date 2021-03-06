/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0)  
            return null;  
        return helper(nums,0,nums.length-1);  
    }
    public TreeNode helper(int[] nums,int l,int r){
        if(l>r){
             return null;  
        }
        int m = (l+r)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(nums,l,m-1);
        root.right= helper(nums,m+1,r);
        return root;
    }
}
