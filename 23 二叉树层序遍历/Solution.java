import java.util.*;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
   		ArrayList <Integer> A = new ArrayList <Integer>();
   		if(root==null){
   			 return A;
   		}
   		Queue<TreeNode> q = new LinkedList<TreeNode>();
   		q.add(root);
   		while(!q.isEmpty()){
   			TreeNode n = q.poll();
   			A.add(n.val);
   			if(n.left!=null){
   				q.add(n.left);
   			}
   			if(n.right!=null){
   				q.add(n.right);
   			} 
   		 }
   		 return A;
   	 
    }
}