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
	
//	Adding a node to the list
	
	public void addNode(SingleLLNode nodeToAdd) {
		
		SingleLLNode node = head;
		
		if(node == null) {
			node = nodeToAdd;
			head = node;
		}
		else {
			while(node.getNext() != null) {
				node =  node.getNext();
			}
			
			node.setNext(nodeToAdd);
		}		
	}
	
//	Remove the last node:
	
public void RemoveLast() {
		
		SingleLLNode prevNode = null;
		SingleLLNode node = head;
		if(node == null) {
			System.out.println("List is empty");
			return;
		}
			
			while(node.getNext() != null) {
				
					prevNode = node;
				    node = node.getNext();
			}
			prevNode.setNext(null);
	}
	
/*
* Remove the Second Last node from the List 
*/
public void removeSecondLastNode() {
	SingleLLNode node = head;
	SingleLLNode prevNode = null;
	SingleLLNode secPrevNode = null;
	if(node == null || node.getNext() == null) {
		return;
	}
//	else {
	while(node.getNext() != null) {
		secPrevNode = prevNode;
		prevNode = node;
		node = node.getNext();
	}
	secPrevNode.setNext(prevNode.getNext()) ;
//	}
}
/*
* Remove the first Element from the list: 
* 1) Move the head to the next node
*/
	
public void removeFirst() {
	if(head == null) { 
		return;
	}
	head = head.getNext();
}

//Search a value in the LL 
public void searchLL(int val) {
	
	SingleLLNode node = head;
	if(head == null) {
		System.out.println("Empty List");
		return;
	}
	
	while(node != null) {
		if(node.getData() == val) {
			System.out.println("Value Found");	
			return;
		}
		else
			node = node.getNext();
	}
	System.out.println("Value Not Found");
}

//Finding the middle node in the list
public void midNode() {
	SingleLLNode midNode = head;
	SingleLLNode node = head;
	int counter = 0;
	
	if(node == null) {
		System.out.println("Empty List");
		return;
		}
	
	while(node != null) {
		counter++;
		node = node.getNext();
		if((counter%2)!=0 && (counter!=1)) {midNode=midNode.getNext();}
	}
	System.out.println("MidNode = " + midNode.getData());
}

//Count the no. of node in the list
public int listSize() {
	SingleLLNode node = head;
    int counter=0;
	
	while(node != null) {
		counter++;
		node = node.getNext();
	}
	System.out.println("Size of List : " + counter);
	return counter;
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
		System.out.print(node.getData() + " ");
		node = node.getNext();
	}
}

}
