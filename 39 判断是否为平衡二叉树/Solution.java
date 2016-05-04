public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
        	return true;
        }
        int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		if(Math.abs(left-right)>1){
			return false;
		}
		return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    public int TreeDepth(TreeNode pRoot)
    {
		if(pRoot==null){
			return 0;
		}
		int left = TreeDepth(pRoot.left);
		int right = TreeDepth(pRoot.right);
		return (left>right)?(left+1):(right+1);
    }
}