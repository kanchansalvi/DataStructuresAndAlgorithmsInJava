package Implementation;


public class MyDoublyLinkedList {
	
	private Node head;
	private Node tail;
	private static boolean DEBUG = false;
	private int numElements;
	
	public static  int sCount = 0;
	
	public MyDoublyLinkedList() {
		head = new Node(-1); 
		tail = new Node(-1);		
		
		numElements = 0;
		
		head.next = tail;
		tail.prev = head;
		
		++sCount;
	}
	
	public void display() {
		Node p = head.next;	
		System.out.println();
		while(p != tail) {
			/*if(DEBUG)*/ 
			System.out.print(p.nodevalue +" ");
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
		final Node currLastNode = tail.prev;
		currLastNode.next=newN;
		newN.prev=currLastNode;
		newN.next=tail;
		tail.prev=newN;		
//		newN.next = tail;
//		newN.prev = tail.prev;
//		tail.prev.next= newN;
//		tail.prev=newN;		
//		
		++numElements;
		if(DEBUG)System.out.print(newN.nodevalue + " 1  ");	 
	}
		
	
	

	
	private class Node {
		private int nodevalue;
		private Node next;
		private Node prev;
			
		public Node(int val) {
				nodevalue = val;
				next = null;
				prev = null;
		}			
	}

}
