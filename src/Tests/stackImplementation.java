package Tests;

import Implementation.StackUsingQueue;
import Implementation.myStack;

public class stackImplementation {

	public static void main(String[] args) {
		myStack<String> stack = new myStack<String>(20);	
		myStack<String> revstack = new myStack<String>(20);
		/*try {
			
				stack.push("2");
				stack.peek();
				stack.push("10");
				stack.peek();
				stack.push("15");
				stack.peek();
				stack.push("20");
				stack.peek();
				
//				stack.pop();
//				stack.pop();
				stack.peek();
				
				stack.isEmpty();
				stack.isFull();
				
				System.out.println("Reversing stack");
				revstack = stack.reverse(stack);
				System.out.println("Reversing stack complete");
				revstack.peek();
				revstack.pop();
				revstack.peek();
				revstack.minStack(revstack);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
/**** 9. Implement Stack using Queue *************/
		
		StackUsingQueue stackQue =  new StackUsingQueue(20);
		try {
			stackQue.push("AAA");
			stackQue.size();
			stackQue.peek();
			stackQue.push("BBB");
			stackQue.pop();
			stackQue.size();
			stackQue.peek();
			stackQue.push("CCC");
			stackQue.push("DDD");
			stackQue.push("EEE");
			stackQue.peek();
			stackQue.size();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*********************************************************/

	}

}

