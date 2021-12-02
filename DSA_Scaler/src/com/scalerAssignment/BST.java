package com.scalerAssignment;

import java.util.Stack;

public class BST {

	// for Valid BST
	Stack<Integer> stk = new Stack<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/*
 * Given an array where elements are sorted in ascending order, convert it to a height Balanced Binary Search Tree (BBST).
 * Balanced tree : a height-balanced binary tree is defined as a binary tree in which 
 * the depth of the two subtrees of every node never differ by more than 1.
 */
	
/*
 * Valid Binary Search Tree
 * Given a binary tree represented by root A.
 * Assume a BST is defined as follows:
 * 1) The left subtree of a node contains only nodes with keys less than the node's key.
 * 2) The right subtree of a node contains only nodes with keys greater than the node's key.
 * 3) Both the left and right subtrees must also be binary search trees.
 */
	public int isValidBST(TreeNode A) {
	
	    getInOrder(A);
	    int temp = stk.pop();
	    while(!stk.isEmpty()){
	        if(stk.peek() >= temp) return 0;
	        temp = stk.pop();
	   }
	        return 1;
	
	    }
	
    public void getInOrder(TreeNode root){
        if(root==null)return;
        
          getInOrder(root.left);
          stk.push(root.val);
         getInOrder(root.right);
    }
    
/*
 * Largest BST Subtree
 * Given a Binary Tree A with N nodes.
 * Write a function that returns the size of the largest subtree which is also a Binary Search Tree (BST).
 * If the complete Binary Tree is BST, then return the size of whole tree.
 * NOTE:
 * Largest subtree means subtree with most number of nodes.
 */
    
/*
 * Kth Smallest Element In Tree
 * Given a binary search tree represented by root A, 
 * write a function to find the Bth smallest element in the tree.
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
