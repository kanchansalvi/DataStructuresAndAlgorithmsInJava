/*
 * Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.

Example 1:
Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9  
Note:

The number of nodes in the given tree will be between 1 and 100.
Each node will have a unique integer value from 0 to 1000.
 */

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class increasingBST897 {
	TreeNode prev, head;
	  
    public TreeNode increasingBST(TreeNode root) {
      
      getNode(root);
      
      return head;
    }
  
  public void getNode(TreeNode root){
    if(root == null) return;
    
    getNode(root.left);
    
        if (prev == null) {
            head = root; 
            prev = root; 

        }
        else{
        root.left = null;
        prev.right = root; 
        prev = root; 
    }
    getNode(root.right);
    
  }
  
  public static class TreeNode {
	     int val;
	       TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
  
	 public static TreeNode stringToTreeNode(String input) {
	        input = input.trim();
	        input = input.substring(1, input.length() - 1);
	        if (input.length() == 0) {
	            return null;
	        }
	    
	        String[] parts = input.split(",");
	        String item = parts[0];
	        TreeNode root = new TreeNode(Integer.parseInt(item));
	        Queue<TreeNode> nodeQueue = new LinkedList<>();
	        nodeQueue.add(root);
	    
	        int index = 1;
	        while(!nodeQueue.isEmpty()) {
	            TreeNode node = nodeQueue.remove();
	    
	            if (index == parts.length) {
	                break;
	            }
	    
	            item = parts[index++];
	            item = item.trim();
	            if (!item.equals("null")) {
	                int leftNumber = Integer.parseInt(item);
	                node.left = new TreeNode(leftNumber);
	                nodeQueue.add(node.left);
	            }
	    
	            if (index == parts.length) {
	                break;
	            }
	    
	            item = parts[index++];
	            item = item.trim();
	            if (!item.equals("null")) {
	                int rightNumber = Integer.parseInt(item);
	                node.right = new TreeNode(rightNumber);
	                nodeQueue.add(node.right);
	            }
	        }
	        return root;
	    }
	    
	    public static String treeNodeToString(TreeNode root) {
	        if (root == null) {
	            return "[]";
	        }
	    
	        String output = "";
	        Queue<TreeNode> nodeQueue = new LinkedList<>();
	        nodeQueue.add(root);
	        while(!nodeQueue.isEmpty()) {
	            TreeNode node = nodeQueue.remove();
	    
	            if (node == null) {
	              output += "null, ";
	              continue;
	            }
	    
	            output += String.valueOf(node.val) + ", ";
	            nodeQueue.add(node.left);
	            nodeQueue.add(node.right);
	        }
	        return "[" + output.substring(0, output.length() - 2) + "]";
	    }
	    
	    public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String line;
	        while ((line = in.readLine()) != null) {
	            TreeNode root = stringToTreeNode(line);
	            
	            TreeNode ret = new increasingBST897().increasingBST(root);
	            
	            String out = treeNodeToString(ret);
	            
	            System.out.print(out);
	        }
	    }
}
