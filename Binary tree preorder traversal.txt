////On OJ  

/*
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
*/

class Solution{
    
    List<Integer> ans=new ArrayList<>();
  public List<Integer> postorder(TreeNode root){
    //write your code here.
    if(root==null){
        return ans;
    }
    
    postorder(root.left);
    postorder(root.right);
    ans.add(root.data);
    
    return ans;
    
    
  }
}
