package com.scalerAssignment;

public class Recursion_Other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    ListNode temp;
    public boolean isPalindrome(ListNode A) {
        temp = A;        
        return check(A);
    }
    
    public boolean check(ListNode head){
    	 if(head == null) return true;
         // System.out.print("\n-A-"+head.val);
         boolean ans = check(head.next);
         // System.out.print("\n-B-"+head.val+"  ans="+ans);
         boolean isEqual = (temp.val == head.val)? true : false; 
         // System.out.print("\n-C-"+isEqual+"  t="+temp.val+" h="+head.val);
         temp = temp.next;
         // System.out.print("\n-D-"+temp.val);
         return ans && isEqual;
    }
    
    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
}


