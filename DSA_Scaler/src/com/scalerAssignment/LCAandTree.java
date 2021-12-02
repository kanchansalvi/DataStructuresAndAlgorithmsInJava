package com.scalerAssignment;

public class LCAandTree {

	//For LCA
	 TreeNode lcaNode;
	 boolean isBpresent, isCpresent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	
/*
 * Find the lowest common ancestor in an unordered binary tree A given two values B and C in the tree.
 */
    public int lca(TreeNode A, int B, int C) {

    checkNodespresent(A,B, C);
        if (isBpresent && isCpresent){
             lcaNode = getLCANode(A, B, C);
             return lcaNode.val;
        }
        return -1;
}
	public void checkNodespresent(TreeNode A, int B, int C){

	    if(A==null) return ;
	    checkNodespresent(A.left, B, C);
	    checkNodespresent(A.right, B, C);
	     if(A.val==B) isBpresent=true;
	     if(A.val==C) isCpresent=true;
	}
	    public TreeNode getLCANode(TreeNode root, int B, int C){

	         if (root == null) return root;

	         if( root.val==B || root.val==C){
	              return root;
	         }
	        
	            TreeNode left = getLCANode(root.left, B, C);
	            TreeNode right = getLCANode(root.right, B, C);

	             if (left != null && right != null) // B & C exist below different subtrees;
	              return root;
	        
	            return (left != null)  ? left : right; // B & C exist below the same subtree;
	    }	
/*
 * Given a binary tree A, invert the binary tree and return it.
 * Inverting refers to making left child as the right child and vice versa.
 */
    public TreeNode invertTree(TreeNode A) {

        if(A == null) return null;

            TreeNode temp;
        
            invertTree(A.left);
            invertTree(A.right);

            //Swap nodes
            temp = A.left;
            A.left = A.right;
            A.right = temp;
          
             return A;
        }
   
/*
 * Given a binary tree A. 
 * Check whether it is possible to partition the tree to two trees which have equal sum of values 
 * after removing exactly one edge on the original tree.
 */
class TreeNode {
	  int val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode(int x) {
	   val = x;
	   left=null;
	   right=null;
	  }
}
}
