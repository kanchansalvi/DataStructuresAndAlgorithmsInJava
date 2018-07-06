package Implementation;


public class StackUsingQueue {
	private String[] arr;
	private int front;
	private int rear;
	private int MAX_SIZE;
	
	public StackUsingQueue(int stackSize) {
		arr = new String[stackSize];
		front = 0;
		rear = 0;
		MAX_SIZE = stackSize;
	}
	
/********** Push an element to stack *************
 * Check if the Stack is full
 * If the Stack is not Full then
 *		 Add the element to an array
 * 		Increment the rear of Queue to point to the next position
 */
	public void push(String string) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full");			
		}
		arr[rear] = string;
		System.out.println("Element pushed to Stack : " + arr[rear]);
		rear++;
		
	}

/********** Pop an element from stack *************
* 
 * Check if the Stack is Empty
 * If the Stack is not Empty then
 *		 Remove the element to from array
 * 		Decrement the rear to point to the next position
 */
	
	public String pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		System.out.println("Element popped from Stack : " + arr[rear-1]);
		return arr[rear--];
		
	}
	
/*************** Element present at the top of Stack ************
 * 
 * Return the element present at the rear-1 position
 * @return element at top of Stack
 * @throws Exception if stack is Empty
 */
	
	public String peek() {
		System.out.println("You peeked at : " + arr[rear-1]);
		return arr[rear-1];
	}

/********* Check if Stack is Empty ***************
 * 
 * Return true if front and rear are at the same position.
 * 		 else return false
 */

	public boolean isEmpty(){
		if(front == rear) {
			System.out.println("Stack is empty");
		}
		return (front == rear);
	}
	
/********* Check if Stack is Full ***************
* 
* Return true if rear is at Maximum size of Stack  else return false
*/

	public boolean isFull(){
		if(MAX_SIZE == rear) {
			System.out.println("Stack is full");
		}
		return (MAX_SIZE == rear);
	}
	
/*********** Return no. of elements present in the Stack ************
 * 
 * @return rear
 */
	public int size() {
		System.out.println("Your Stack Size is : " + rear);
		return rear;
	}

}

