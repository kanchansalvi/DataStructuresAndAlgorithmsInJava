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
		myll.RemoveLast();
		myll.displayList();
		
	}

}
