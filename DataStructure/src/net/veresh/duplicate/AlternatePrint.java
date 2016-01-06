package net.veresh.duplicate;

import java.util.ArrayList;
import java.util.Iterator;

public class AlternatePrint {
	/*
	 * prints alternate nodes of the given Linked List, first from head to end,
	 * and then from end to head. 
	 * If Linked List has even number of nodes, then
	 * fun2() skips the last node. 
	 * For Linked List 1->2->3->4->5, fun2() prints    1 3 5 5 3 1. 
	 * For Linked List 1->2->3->4->5->6, fun2() prints 1 3 5 5 3 1.
	 */
	public static void main(String[] args) {
		StudentLinkedList l1 = BuildData.get();
		System.out.println(l1);
		int k = 0;
		while (l1 != null) {
			if (k % 2 == 1) {
				System.out.println(l1.getStudent());
				stack(l1);
			}
			l1 = l1.getNext();
			++k;
		}
		Iterator<StudentLinkedList> it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getStudent());
		}
	}

	private static ArrayList<StudentLinkedList> stack = new ArrayList<StudentLinkedList>();

	/**
	 * Simple way to implement stack using ArrayList
	 * @param obj
	 */
	public static void stack(StudentLinkedList obj) {
		stack.add(0, obj);	 
	}

}
