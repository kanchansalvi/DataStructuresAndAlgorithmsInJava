package com.scalerAssignment;

import java.util.ArrayList;
import java.util.Queue;

public class Trees2 {
	static int check = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeNode root = new TreeNode(4);
		//Height Balanced Tree
		System.out.print("Is it Height balanced Tree"+isBalanced(root));
		
		//LeftView of tree
		System.out.print("Left View of Tree"+rightView(root));
		//LeftView of tree
		System.out.print("Left View of Tree"+leftView(root));

	}
	
/*
 * Given a root of binary tree A, determine if it is height-balanced.

A height-balanced binary tree is defined as a binary tree in which the 
depth of the two subtrees of every node never differ by more than 1.
 */
	//public class Solution {
	   
	    public static int isBalanced(TreeNode A) {

	        if(A==null) return 1;
	        getHeight(A);
	        return check; 

	    }
	public static int getHeight(TreeNode A){
	    if (check == 0) return 0; 
	    if(A==null) return 0;
	     else{
	        int lht = getHeight(A.left);
	        int rht = getHeight(A.right);

	        if(Math.abs(lht-rht)>1) check = 0; 
	             return 1 + Math.max(lht, rht);
	     }
	}
	/*
	 * Given a binary tree of integers denoted by root A. Return an array of integers representing the right view of the Binary tree.

Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.
	 */
public static ArrayList<Integer> rightView(TreeNode A) { 
        
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        int delcnt = 1, addcnt=0;
        que.add(A);

        while(que.peek() != null){
            
            while(delcnt>0){
                A=que.peek();
                if(A.left != null){ que.add(A.left); addcnt++;};
                if(A.right!= null){ que.add(A.right); addcnt++;};
                 if(delcnt == 1) arr.add(que.peek().val);
                que.remove(); 
                delcnt--;
            }
          delcnt=addcnt;
          addcnt=0;
        } 
        return arr;
    }

/*
 * Given a binary tree of integers. Return an array of integers representing the left view of the Binary tree.

Left view of a Binary Tree is a set of nodes visible when the tree is visited from Left side
 */
public static ArrayList<Integer> leftView(TreeNode A) { 

    ArrayList<Integer> arr = new ArrayList<>();
    Queue<TreeNode> que = new LinkedList<TreeNode>();
    int delcnt = 1, addcnt=0;
    que.add(A);

    while(que.peek() != null){
        arr.add(que.peek().val);
        while(delcnt>0){
            A=que.peek();
            if(A.left != null){ que.add(A.left); addcnt++;};
            if(A.right!= null){ que.add(A.right); addcnt++;};
             
            que.remove(); 
            delcnt--;
        }
      delcnt=addcnt;
      addcnt=0;
    } 
    return arr;
  }
/*
 * Given a binary tree of integers. Find the difference between the sum of nodes at odd level and sum of nodes at even level.

NOTE: Consider the level of root node as 1.
 */

/*
 * Given two binary trees, check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */

/*
 * Given a binary tree of integers denoted by root A. Return an array of integers representing the top view of the Binary tree.

Top view of a Binary Tree is a set of nodes visible when the tree is visited from top.

Return the nodes in any order.
 */
}
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