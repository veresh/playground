package net.veresh;
/**
 * Simple linked list class.
 * @author veresh
 *
 */
public class LinkedList {

	private Object data;
	private LinkedList next;
	
	public Object getData() {
		return this.data;
	}
	
	public void setData(String data) {
		this.data = data;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}

	public LinkedList getNext() {
		return this.next;
	}

}
