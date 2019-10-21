/**
 * 
 */
package Implementation;

/**
 * @author LocalAdmin
 *
 */
import TypeDeclarations.SingleLLNode;

public class LinkedListsImplementation {
	
	public SingleLLNode head;

	public LinkedListsImplementation() {
		head = null;
	}
	
//	Adding an node to the list
	
	public void addNode(SingleLLNode nodeToAdd) {
		
		if(head == null) {
			head = nodeToAdd;
		}
		else {
			while(head.getNext() != null) {
			head =  head.getNext();
			}
			
			 head.setNext(nodeToAdd);
		}
		System.out.println("Node added : " +nodeToAdd.getData());
	}
	
//	Remove the last node:
//	1) Check if the head of list is empty
//	  a) If the head is empty goto:(2) else goto:(3)
//	2) Print that the list is empty
//	3) Create a currentNode to store the current head node.
//	4) Check if the next of the node is empty
//		a) if next of the head is empty goto:(5) else goto:(6)
//	5) Make the next of the currentNode to null.
//	6) Assign currentNode the value of head node.
//	7) Move the head to the next node.
//	8) Repeat the steps(4) - (7) until head is not null

	/*
	 * 1) null list
	 * 2) 2
	 */
	public void RemoveLast() {
		
		SingleLLNode prevNode = head;
		SingleLLNode node = head;
		if(node == null) {
			System.out.println("List is empty");
		}
		
		else {
			
			if(node.getNext()==null)
				node = null;
			
			while(node.getNext() != null) {
				
					prevNode = node;
				    node = node.getNext();
			}
			prevNode.setNext(null);
		}
		displayList();
	}
	
/*
* Remove the Second Last node from the List 
* 1) Create a previous node and set it to null
* 2) If the list has single node -> return
* 3) Do this until the head reaches the last node
* 	 a) 
* 
*/
	
/*
* Remove the first Element from the list: 
* 1) Move the head to the next node
*/
	
public void removeFirst() {
	head = head.getNext();
}

/*
* Display the List: 
* 1) Check if the node is null 
* 2) If the node is not null: 
* 		a) Print the node 
* 		b) Go to the next node 
* 3) Repeat Step (2) while the node is not null
*/
		
public void displayList() {
	SingleLLNode node = head;
	while(node != null) {
		System.out.println(node.getData());
		node = node.getNext();
	}
}

}
