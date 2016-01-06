package net.veresh.duplicate;

 
import net.veresh.LinkedList;
import net.veresh.LinkedListOperations;

public class BuildData {

	public static StudentLinkedList get() {
		
		StudentLinkedList head = null;
		StudentLinkedList prev = null;
		for (int i = 0; i < 2; ++i) {
			StudentLinkedList current = new StudentLinkedList();
			Student s = new Student();
			s.setName("John - " + i);
			s.setAddress("Bangalore - " + i);
			s.setTelephone("990-000-0000 - " + i);
			current.setStudent(s);
			if (head ==null)
				head = current;
			else 
				prev.setNext(current);
			prev = current;
			//System.out.println(head);
		}
		//System.out.println(" >>> " + head);
		return head;
	}

	public static void main(String args[]) {
		 LinkedListOperations t = new LinkedListOperations();
		get();
		//t.startTraversal(get());
		/*
		StudentLinkedList current = new StudentLinkedList();
	 
		Student s = new Student();
		s.setName("John - " + Math.random());
		s.setAddress("Bangalore - " + Math.random());
		s.setTelephone("990-000-0000 - " + Math.random());
		current.setStudent(s);
		
		StudentLinkedList current1 = new StudentLinkedList();
		s = new Student();
		s.setName("John - " + Math.random());
		s.setAddress("Bangalore - " + Math.random());
		s.setTelephone("990-000-0000 - " + Math.random());
		current1.setStudent(s);
		current.setNext(current1);
		
		System.out.println(current);
		*/
	}

}
