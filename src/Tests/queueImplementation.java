package Tests;

import Implementation.QueueUsingStack;
import Implementation.myQueue;

public class queueImplementation {

	
	public static void main(String[] args) {
		
		myQueue que = new myQueue(10);	
		try {
			
				que.enqueue(10);
				que.peek();
				que.enqueue(20);
				que.peek();
				//que.dequeue();
				que.enqueue(30);
				//que.dequeue();
				que.enqueue(40);
				que.peek();
				que.enqueue(50);
				que.enqueue(1);
				//que.enqueue("70");
				
				//que.dequeue();que.dequeue();que.dequeue();que.dequeue(); //que.dequeue();
				
/* 6. Find min in queue
 */
				que.minQueue(que);
				que.peek();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
/******** 10. Implement Q using stack/s *********************/
		QueueUsingStack questack = new QueueUsingStack(10);
		try {
			
			//questack.peek();
			questack.enqueue(10);
			questack.peek();
			questack.enqueue(20);
			questack.peek();
			questack.enqueue(30);
			questack.peek();
			questack.dequeue();
			questack.peek();
			questack.enqueue(40);
			questack.peek();
			questack.queSize();
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
/******************************************************************/

	}

}
