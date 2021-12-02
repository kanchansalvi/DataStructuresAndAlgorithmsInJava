package com.scalerAssignment;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(5);
		
		head.next =new ListNode(6);
		head.next = new ListNode(7);
		head.next = new ListNode(8);
		head.next = new ListNode(9);
		ListNode start =head;
		head = start;
		
		while(head != null) {
			System.out.print("node="+head.val);
			head = head.next;
		}
		
	//Remove nth node from the end.
//		System.out.print("Remove nth node of Linked List:" +removeNthFromEnd(new ListNode(5),2));
//		
//		//Given a singly linked list A and an integer B,
//		//reverse the nodes of the list B at a time and return modified linked list.
//		System.out.print("Reverse the nodes of the list B at a time:" +reverseList(new ListNode(5),2));
//		
		//Reorder Linked List
		System.out.print("Reorder LL:" );
		
		//Determine if LL has a cycle in it
		//System.out.print("LL has a cycle ? "+hasCycle(head));
		
		// Is LL a Plindrome
		System.out.print("LL has a cycle ? "+lPalin(head));
		
		
	}
	
	public static ListNode removeNthFromEnd(ListNode A, int B) {

	    ListNode start = new ListNode(0);
	    start.next=A;
	    ListNode slow = start, fast = start;
	    //slow.next = A;
	    int cnt=0, i=1;
	    //Move fast in front so that the gap between slow and fast becomes n
	    while(fast.next !=null && i<=B+1){
	    //for(int i=1; i<=B+1; i++)   {
	        fast = fast.next;
	        i++;
	    }
	    i--;

	    if(i<=B && A.next != null) return A.next;
	    if(i<=B && A.next == null) return null;
	    //Move fast to the end, maintaining the gap
	    while(fast != null) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    //Skip the desired node
	    slow.next = slow.next.next;
	    return start.next;

	    }
	
/*Given a singly linked list A and an integer B, 
 * reverse the nodes of the list B at a time and return modified linked list.
 *  A = [1, 2, 3, 4, 5, 6]
 B  B = 2  ======>[2, 1, 4, 3, 6, 5]
 * */

 public static ListNode reverseList(ListNode A, int B) {
        int n = 0;
        for (ListNode i = A; i != null; n++, i = i.next);
        
        ListNode temp = new ListNode(0);
        temp.next = A;
        for(ListNode prev = temp, tail = A; n >= B; n -= B) {
            for (int i = 1; i < B; i++) {
                ListNode next = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = next;
            }
            
            prev = tail;
            tail = tail.next;
        }
        return temp.next;
    }
/*Given a singly linked list A

 	A:  A0 -> A1 -> … -> An-1 -> An 
		  reorder it to:
 		A0 -> An -> A1 -> An-1 -> A2 -> An-2 -> … 
 		 A = [1, 2, 3, 4, 5] ===>  [1, 5, 2, 4, 3] 
 */
 
 /*Determine if LL has a cycle
  * */
 public static boolean hasCycle(ListNode head) {
     ListNode p = head;
     ListNode q = null;        
     if(head == null){
         return false;
     }
     
     q = p.next;
     
     while(p != null && q != null){
         if(p == q) {
             return true;
         }
         
         p = p.next;
         
         if (q.next != null) q = q.next.next; 
         else q = null;
     }
     
     return false; 
 }
 /*Given a singly linked list A, 
  * determine if its a palindrome. 
  * Return 1 or 0 denoting if its a palindrome or not, respectively.
  * A = [1, 2, 2, 1] ===> 1
  */
public static int lPalin(ListNode A) {
    
    StringBuilder sb = new StringBuilder();
    int size =0;
    ListNode  head = A;
    // Get the size of LL
    while(A != null){
        size++;
        A = A.next;
    }
    if(size<2) return 1;
   //Bring the head to start of LL Eg 1 2 3 2 1 --> traverse 1 2
    A=head;
    StringBuilder s1 = new StringBuilder();
    int cnt=0;
    //Traverse half of the LL 
    while(cnt < size/2){
        s1.append(A.val);
        cnt++;
        A = A.next;
    }
   // If LL is odd size skip the mid element --> skip 3
    if(size%2 == 1) A=A.next;
    StringBuilder s2 = new StringBuilder();
    // Traverse the remaining half of the list ---> 2 1
    while(A != null){
        StringBuilder temp = new StringBuilder();
        temp.append(A.val); temp = temp.reverse();
       s2.append(temp);
        A = A.next; 
    }
    //Reverse the other half of the lidt
    s2=s2.reverse();
 return s1.toString().equals(s2.toString()) ? 1 : 0;
}

}
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
