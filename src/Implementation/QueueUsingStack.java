package Implementation;

public class QueueUsingStack {
	
	private int MAX_SIZE ;
	private int[] arr, arrQue;
	private int index;
	
	
	public QueueUsingStack(int quesize) {

		arr = new int[quesize];
		arrQue = new int[quesize];
		MAX_SIZE = quesize;
		index = 0;
	}
	
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty. Nothing to peek");
		} else {
			System.out.println("You peeked at : " + arrQue[index-1]);
			return arrQue[index-1];
		}
	}
	
	public int queSize(){
			System.out.println("Current Size of Queue : " + index);
			return index;
	}
	
	public void enqueue(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full. Element discarded by Queue");
		} else {	 
			arr[index] = element;
			System.out.println("Element added to Queue = " + arr[index]);
			index++;	
		}	
		syncQueStack(arr, arrQue);
	}
	
	public void dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty. Nthing to remove");
		} else {
			 System.out.println("Element removed from Queue =  " + arrQue[index-1]);		
			 index--;
			 syncQueStack(arrQue, arr);
		}
		}
	public boolean isFull(){
		return (MAX_SIZE == index);
	}
	
	public boolean isEmpty(){
		return (index == 0);
	}
	
	public int[] syncQueStack(int[] arr1, int[] arr2) {
	  int j = index-1;
		for(int i=0; i<=index-1; i++) {
			arr2[i] = arr1[j];
			j--;
		}
		return arrQue;
	}
}
