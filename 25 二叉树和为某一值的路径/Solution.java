import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    private ArrayList<ArrayList<Integer>> PathAll = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> Path = new ArrayList<Integer>();
	
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	
    	if(root == null){
        	return PathAll;
        }
    	Path.add(root.val);
    	target = target - root.val;
    	if((target == 0)&&(root.left==null)&&(root.right==null)){
    		PathAll.add(new ArrayList<Integer>(Path)); //直接PathAll.add(Path)就不行，为什么呢
    	}
    	FindPath(root.left,target);
    	FindPath(root.right,target);
    	Path.remove(Path.size()-1);
    	return PathAll;
    }
}