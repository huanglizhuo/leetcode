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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<Integer>();
        return helper(root,k,set);
    }
    
    public boolean helper(TreeNode root,int k,Set<Integer> set){
        if(root==null){
            return false;
        }else{
            if(set.contains(k-root.val)){
                return true;
            }
            set.add(root.val);
        }
        return helper(root.left,k,set)||helper(root.right,k,set);
    }
}
