/**
 * 
 */
package myPractice;

/**
 * @author LocalAdmin
 *
 */
import TypeDeclarations.SingleLLNode;
import Implementation.LinkedListsImplementation;

public class LinkedListsPS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final LinkedListsImplementation myll = new LinkedListsImplementation();
		SingleLLNode sll = new SingleLLNode(3);
		myll.addNode(sll);
		SingleLLNode sl2 = new SingleLLNode(5);
		myll.addNode(sl2);
		SingleLLNode sl3 = new SingleLLNode(8);
		myll.addNode(sl3);
		SingleLLNode sl4 = new SingleLLNode(11);
		myll.addNode(sl4);
		SingleLLNode sl5 = new SingleLLNode(15);
		myll.addNode(sl5);
//		SingleLLNode sl6 = new SingleLLNode(18);
//		myll.addNode(sl6);
		System.out.println("\nList after adding node : ");
		myll.displayList();
		System.out.println("\nList after removing last node :" );
		myll.RemoveLast();
		myll.displayList();
		System.out.println("\nList after removing first node :" );
		myll.removeFirst();
		myll.displayList();
		System.out.println("\nList after removing Second Last node :" );
		myll.removeSecondLastNode();
		myll.displayList();
		System.out.println("\nSearching for value in the list :" );
		myll.searchLL(15);
		System.out.println("\nMidnode:");
		myll.midNode();
		myll.listSize();
		
	}

}
