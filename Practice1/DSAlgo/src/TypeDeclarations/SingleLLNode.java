/**
 * 
 */
package TypeDeclarations;

/**
 * @author LocalAdmin
 *
 */
public class SingleLLNode {
	
	public SingleLLNode(int data) {
		super();
		this.data = data;
	}
	private int data;
	private SingleLLNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SingleLLNode getNext() {
		return next;
	}
	public void setNext(SingleLLNode next) {
		this.next = next;
	}
	
	
}
