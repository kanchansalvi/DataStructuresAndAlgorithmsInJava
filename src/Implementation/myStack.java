package Implementation;

import java.util.ArrayList;

public class myStack <T>{
	private ArrayList<T> arr;
	private int index;
	private int MAX_SIZE;
	
	public myStack(int stackSize){
		arr = new ArrayList<T>(stackSize);
		index = 0;
		MAX_SIZE = stackSize;
	}
	
/********** Push an element to stack *************
 * Check if the Stack is full
 * If the Stack is not Full then
 *		 Add the element to an array
 * 		Increment the index to point to the next position
 */
		
	public void push(T element)throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full");			
		}
		arr.add(index++,element);
		System.out.print("Element pushed in stack : ");
		System.out.println(arr.get(index-1));
	}
	
/********** Pop an element from stack *************
 * 
 * Check if the Stack is Empty
 * If the Stack is not Empty then
 *		 Remove the element to from array
 * 		Decrement the index to point to the next position
 */
	
	public T pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		System.out.print("Element popped from stack : ");
		System.out.println(arr.get(index-1));
		return arr.remove(--index);
		
	}
	
/********* Check if Stack is Empty ***************
 * 
 * Return true if index is at O else return false
 */
	
	public boolean isEmpty(){
		if(index == 0) {
			System.out.println("Stack is empty");
		}
		return (index == 0);
	}
	
/********* Check if Stack is Full ***************
* 
* Return true if index is at Maximum size of Stack  else return false
*/
	
	public boolean isFull(){
		if(MAX_SIZE == index) {
			System.out.println("Stack is empty");
		}
		return (MAX_SIZE == index);
	}
	
/*********** Return no. of elements present in the Stack ************
 * 
 * @return index
 */
	public int size(){
		System.out.println("Stack size " + index);
		return index;
	}
	
/*************** Element present at the top of Stack ************
 * 
 * Return the element present at the index-1 position
 * @return element at top of Stack
 * @throws Exception if stack is Empty
 */
	
	public T peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is empty. Nothing to peek");
		}
		System.out.print("You peeked at :");
		System.out.println(arr.get(index-1));
		
		return arr.get(index-1);
	}
	
/****** Reverse the elements present in the Stack *****************
 * 	
 * Create a new Stack with size of the given stack
 * Let numOfElements = no. Of Elements present in Stack
 * Follow these steps until bottom of stack is reached
 * 		push the top element to the new Stack
 * 		pop the element from the old stack
 * 		increment the index of new array to point at next Locaion
 * 
 * @param stack whose elements to be reversed
 * @return stack with reversed elements
 * @throws Exception if the Stack is empty
 */
	
	public myStack<String> reverse(myStack<String> stack) throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty. Nothing to reverse");
		}
		
		myStack<String> newarr = new myStack<String>(index);
		int numOfElements = stack.size();
		
		for (int i=0; i< numOfElements; i++) {
			newarr.push((String) stack.pop());
			newarr.index=i+1;
		}
		
		System.out.println("Stack reversed ");
		return newarr;
		
	}

/************* Find the Minimum Element from the Stack *************************
 * 
 * Create a new empty stack 
 * Let min = element appearing on the top of Stack
 * Follow these Steps until the last element in the Stack is reached
 * 		Pop an element from the given stack
 * 		Push this element in the new Stack
 * 		if the element pushed in the new Stack is less than the min, then initialize min to the value of the element pushed
 * 		Go to the next element in  the given stack
 * Reverse the elements in the new Stack and assign it to the given Stack
 * @param stack
 * @return 
 * @throws Exception if the Stack is Empty
 */
	
	public myStack<String> minStack(myStack<String> stack) throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty. Nothing to reverse");
		}
		
		int numOfElements = stack.size();
		int min = Integer.getInteger(stack.peek());
		
		myStack<String> newarr = new myStack<String>(index);
		
		for (int i=0; i<numOfElements; i++) {
			newarr.push(stack.pop());
			if(Integer.getInteger(newarr.peek()) == min) {
				System.out.println("Min found" + newarr.peek());
			}
			newarr.index=i+1;
		}
		
		System.out.println("Stack reversed ");
		return newarr;
		
	}
	
	
}

