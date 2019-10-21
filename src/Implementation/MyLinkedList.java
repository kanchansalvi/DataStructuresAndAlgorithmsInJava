package Implementation;

public class MyLinkedList {
	private Node head;
	private static boolean DEBUG = false;
	private int numElements = 0;
	
	public MyLinkedList() {
		head = null;
	}

	public void display() {
		Node p = head;	
		while(p != null) {
			/*if(DEBUG)*/ System.out.println("display : " +p.nodevalue + "   ");
			p=p.next;
		}
	}
	
/********** Adding an element to the List **********
 * 
 * Create a new node to be added to the end of the List
 * Get the last node where the new node is to be added
 * If the new node to be added is the first node in the List, then initialize head of the List to new Node
 * Else add new node to the next of the last node
 */
	
	public void add(final int num) {
		final Node newN = new Node(num);
		
		Node lastNode = getLastNode();
		
		if(lastNode == null){//empty LL
			head = newN;
		}else{
			lastNode.next = newN;			
		}
		if(DEBUG)System.out.print(newN.nodevalue + " 1  ");
		 
	}
	
/**************  Finding the Last Node of the List *****************
 * 
 * If the List is empty, return the head of the List
 * If not empty, 
 * 	Initialize a node to head
 *  Keep traversing the list until the next node of the List is NULL reached
 *  Return this node
 */
	
	private Node getLastNode(){
		if(head == null){ ///empty list
			return null;
		}
		
		Node p = head;	
		while(p.next != null){
			if(DEBUG) System.out.print(p.nodevalue + " 2  ");
			p = p.next;
		}
		return p;
	}
	
/*********** Removing the Node from the List ***********************
 * 
 * Create a new Node prevNode and assign it to NULL. This node will keep track of the previous element of removed node
 * Initialize the head to a node
 * Repeat below steps until the Last node in the List is reached
 * 		If value of the traversed node equals the value of the Node to be deleted, then
 * 			Assign the next of the current Node to the previous Node
 * 			Delete the Current Node
 * 		Else
 * 			assign the prevNode value of the current node
 * 			Go to the next node
 *  Return the Removed Node
 */
	
	public Node removeNode(int val){
		Node prev=null;
		Node p = head;
		
		while(p != null){
			if(p.nodevalue==val){
				return delnode(prev, p, head);
//				break;
			}
			prev = p;
			p=p.next;
			
		}
		return head;
	
	}
	
/************** Deleting the Node from the List ***************/

	private Node delnode(Node prev, Node p, Node startnode) {		
		if(prev != null){
			prev.next = p.next;
		} else {
			startnode = p.next;
		}
		return startnode;		
	}
	
	public void deletenode(Node startnode,int delnodevalue){

		Node p = startnode;
		while(p != null){
			if(p.nodevalue==delnodevalue){
				//we found element to be deleted
				System.out.println("Found ......" + p.nodevalue);
			}			
			p=p.next;
		}
	}
	
/***************Returns the no. of elements present in  LL ***************************
 * Initialize the node to head
 * Let the no. of elements be 0
 * Traverse the List by pointing the head to next 
 * Keep on incrementing the element count
 * Continue traversing and counting until the last element in List is reached
 */
	
	public int numOfElements() {
		Node p = head;	
		numElements = 0;
		while(p != null) {        //continue until the end of LL
			numElements++;        // keep counting the elements
			System.out.print("display : " +p.nodevalue + "   ");
			p=p.next;             // Go to next NODE
		}
		System.out.println("Number of elements : " + numElements);
		return numElements;
	}
	
	
/********** Returns the elements in the List Reversed *********
 *  Copy the given LL to new List
 *  Let N = no. of Elements in the List
 *  Create a new empty LL -> revLL
 *  Follow the below steps for N Times
 *  	Get Last element of NewList
 *  	Add Last element to revLL
 *  	Remove the last element from newLL
 */
	
	public MyLinkedList reverseList1() {
		
	   MyLinkedList newLL = copyList();
	   int N = newLL.numOfElements();
	   MyLinkedList revLL = new MyLinkedList();
	   
	   	for( int i=0; i<N; i++) {	  
		  revLL.add(newLL.getLastNode().nodevalue);
		  newLL.removeNode(newLL.getLastNode().nodevalue);
	   	}
		
	   return revLL;
	}
	
/**************** Returns the duplicate copy of given LL ****************
 * Create a new blank LL where the list is to be copied
 * Initialize a Node to head to traverse the List
 * Keep on adding the elements to the newLL until the last node is reached 
 */
	
	public MyLinkedList copyList() {
		
		MyLinkedList newLL = new MyLinkedList();
		Node p = head;
		
		while(p != null) {
			newLL.add(p.nodevalue);
			p=p.next;
		}
		return newLL;
	}
	
/************* Returns the middle value in the linked list 
 *  If the LL contains odd no. of elements, middle value eg. 7 ->4
 *  For even no.of elements even no. value is returned eg 8-> 4  **************************************
 *  
 *  Initialize the Node to head
 *  Find the middle position of the list by dividing the total elements in the list into half
 *  Keep on traversing the list until the middle position of the elements in the list is reached
 */
	
public int midvalue() {
		
		Node p = head;
		int myMid= numOfElements()/2;
		
		if(numOfElements()%2 == 1) {
			myMid =myMid +1;
		}
		System.out.println(" My Mid =" + myMid);
		for(int i=0; i<myMid-1; i++) {
			p=p.next;
		}	
		System.out.println("My Middle value = " + p.nodevalue);
		return p.nodevalue;
	}

/**********11. Adding an element to the List such that it is always sorted **********
 * 
 * Create a new node to be added to the end of the List
 * Traverse the list until the previous node is less and 
 *    next node is greater than given value of node to add
 *  Add the given node between this nodes. * 
 */

public void sortedAdd(final int num) {
	final Node newN = new Node(num);
	Node prevN = new Node(-1);
	boolean nodeadded = true;
	
	Node p = head;
		if(p == null) {
		head = newN;
		}
		else {
		prevN=p;
		p=p.next;
		
			while(nodeadded) {
				if(prevN.nodevalue < num && p.nodevalue > num) {
					prevN.next=newN;
					newN.next=p;
					nodeadded = false;
				} else {
					prevN=p;
					p=p.next;
					nodeadded = true;
				}
			}	
		} 
}

/************ Print LL using Recursive method ********************
 * 
 */

public void recDisplay() {
	Node p = head;
	recDisp(p);
}

public void recDisp(Node p) {
	if(p != null) {
		 System.out.println("Display by recursion : " +p.nodevalue);
		 p=p.next;
		recDisp(p);
	}
}

/*************Print REverse LL using Recursion  *************************/

public MyLinkedList recReverseList() {
	
	   MyLinkedList newLL = copyList();
	   int N = newLL.numOfElements();
	   MyLinkedList revLL = new MyLinkedList();
	   return recRev(N, newLL, revLL);
	}

	
	private MyLinkedList recRev(int N, MyLinkedList newLL, MyLinkedList revLL) {
		if(N > 0) {
		revLL.add(newLL.getLastNode().nodevalue);
		  newLL.removeNode(newLL.getLastNode().nodevalue);
		  N--;
		  recRev(N, newLL, revLL);
	}
		newLL.display();
	return revLL;
}


	private class Node {
		private int nodevalue;
		private Node next;
			
		public Node(int val) {
				nodevalue = val;
				next = null;
		}			
	}

}
