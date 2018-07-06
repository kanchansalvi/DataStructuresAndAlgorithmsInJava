package Implementation;


public class myQueue {
	
	private int MAX_SIZE ;
	private int[] arr;
	private int rear;
	private int front;
	private int size;
	
	public  myQueue(int quesize){
		arr = new int[quesize];
		MAX_SIZE = quesize;
		rear = 0;
		front =0;
		size = 0;
	}
	
	public void enqueue(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full. Element discarded by Queue");
		} else {
			if(rear == MAX_SIZE){
				 rear = 0;
			}	 
			arr[rear] = element;
			System.out.println("Element added to Queue = " + arr[rear]);
			rear++;
			size++;
		}	
	}
	
	public void dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty. Nthing to remove");
		} else {
			 size--;
			 System.out.println("Element removed from Queue =  " + arr[front]);		
			 front++;
			 if(front == MAX_SIZE){
				 front =0; 
				 }			    
		}
				
	}
	
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty. Nothing to peek");
		} else {
			System.out.println("You peeked at : " + arr[front]);
			return arr[front];
		}
	}
	
	public boolean isEmpty(){
		return (size == 0);
	}
	
	public boolean isFull(){
		return (MAX_SIZE == size);
	}
	
	public int minQueue(myQueue que) throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty. No min could be found ");
		} else {
			
			int min = que.peek();
			que.dequeue();
			que.enqueue(min);
			for( int i=1; i<size; i++) {			
				int myelement = que.peek();
				if(myelement < min) {
					min = myelement;
				}
				que.dequeue();
				que.enqueue(myelement);
				
				
			}
			System.out.println(" Min element = " + min);
			return min;
		}
	}
}
