/**
 * All operations in a LinkedList.
 * @author veresh
 *
 */
package net.veresh;

public class LinkedListOperations {

	public void startTraversal(LinkedList head) {
		if (head != null) {
			System.out.println(">> " + head.getData());
			startTraversal(head.getNext());
		}
	}

	/**
	 * 
	 * @param head
	 *            This is the head of the linkedlist
	 * @param node
	 *            This is the node to be find.
	 * @return
	 */
	public int peek(LinkedList head, LinkedList node) {
		int position = 0;
		// TODO Optimize this someday.
		while (head != null) {
			++position;
			if (head.getData() == node.getData()) {
				break;
			}
			head = head.getNext();
		}
		return position;
	}

	public boolean delete(LinkedList head, LinkedList node) {
		// For deletion we need to
		LinkedList prev = new LinkedList();
		while (head != null) {
			System.out.println("On :: " + head.getData() + " , prev :: " + prev.getData());
			if (head.getData() == node.getData()) {
				prev.setNext(head.getNext());
				break;
			}
			prev = head;
			head = head.getNext();
		}
		return false;
	}

	public void addLast(LinkedList head, LinkedList node) {
		LinkedList prev = new LinkedList();
		while (head != null) {
			prev = head;
			head = head.getNext();
		}
		prev.setNext(node);
	}

	public LinkedList addFirst(LinkedList head, LinkedList node) {
		node.setNext(head);
		return node;
	}

	public void addAfter(LinkedList head, LinkedList node) {
			node.setNext(head.getNext());
			head.setNext(node);
			head = head.getNext();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.setData("first");

		LinkedList l2 = new LinkedList();
		l2.setData("second");
		l1.setNext(l2);

		LinkedList l3 = new LinkedList();
		l3.setData("third");
		l2.setNext(l3);

		LinkedList l4 = new LinkedList();
		l4.setData("forth");
		l3.setNext(l4);

		LinkedList l5 = new LinkedList();
		l5.setData("fifth");
		l4.setNext(l5);

		LinkedListOperations t = new LinkedListOperations();
		t.startTraversal(l1);
		System.out.println("Position :::" + t.peek(l1, l3));
		t.delete(l1, l3);
		t.startTraversal(l1);
		

		LinkedList l6 = new LinkedList();
		l6.setData("sixth");
		t.addLast(l1, l6);;
		t.startTraversal(l1);
		System.out.println(" ================ Add First =============== ");
		LinkedList l7= new LinkedList();
		l7.setData("seventh");
		t.startTraversal(t.addFirst(l1, l7));
		System.out.println(" ================ Add After =============== ");
		LinkedList l8 = new LinkedList();
		l8.setData("eight");
		t.addAfter(l2, l8);
		t.startTraversal(l1);
	}
}
