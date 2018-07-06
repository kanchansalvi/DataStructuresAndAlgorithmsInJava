package Tests;

import Implementation.MyLinkedList;

public class TestLinkedList {

	public static MyLinkedList cll = new MyLinkedList();
	
	
	public static void main(String[] args) {
		
//		cll.add(10);
//		cll.add(20);
		cll.add(30);
		cll.add(40);
		cll.add(50);
		cll.add(60);
		cll.add(60);
		cll.display();
//		cll.numOfElements();
		//cll.reverseList();
//		System.out.println("Reversed List");
//		cll.display();
//		MyLinkedList mll = cll.copyList();
//		mll.display();
//		MyLinkedList rll = mll.reverseList1();
//		System.out.println("Reversed List");
//		rll.display();
		

//		cll.add(30);
//		cll.removeNode(20);
//		cll.display();
		
		/*Find middle of the linked list and return its value		*/
		//cll.midvalue();
		
/******* 11. Insert an element in a LL such that it is always sorted *******/
		cll.sortedAdd(50);
		cll.add(60);
		cll.sortedAdd(55);
		cll.display();
/**************************************************************************/
/******* 12. Print LL using Recursion reversely **************************/
		cll.recDisplay();
		cll.numOfElements();
/*********************************************************************/

/******** 13. Reverse LL using Recursion ****************************/
		MyLinkedList mll = cll.copyList();
		mll.display();
		MyLinkedList rll = mll.recReverseList();
		System.out.println("\n******************\n"
				+ "Reversed List\n*******************\n");
    	rll.display();
/*******************************************************************/

	}
		
	

}
