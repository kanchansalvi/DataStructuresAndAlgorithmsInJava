package Tests;
import Implementation.MyDoublyLinkedList;


public class TestDoubleLL {
	public static void main(String[] args) {
		MyDoublyLinkedList cll = new MyDoublyLinkedList();
		
		cll.add(10);
		cll.display();
		cll.add(20);
		cll.display();
		cll.add(30);
		cll.display();
		
		System.out.println(MyDoublyLinkedList.sCount);
		
		MyDoublyLinkedList cll2 = new MyDoublyLinkedList();
	
		//implement remove/find/size
	}

}
