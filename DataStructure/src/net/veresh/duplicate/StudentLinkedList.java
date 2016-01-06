package net.veresh.duplicate;

/**
 * Simple linked list class.
 * @author veresh
 */
public class StudentLinkedList {

	private Student student;
	private StudentLinkedList next;
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentLinkedList getNext() {
		return this.next;
	}

	public void setNext(StudentLinkedList next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "StudentLinkedList [student=" + student + ", next=" + this.next + "]";
	}

}
