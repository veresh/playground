package net.veresh.duplicate;

import java.util.HashMap;

/*
 * name, telephone, address. duplication exist if the same name and phone number 
 * appears in two different lists or repeat more than ones in the same list. 
 */

public class Student {
	private String name;
	private String telephone;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return (name.hashCode()+telephone.hashCode()) ;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", telephone=" + telephone + ", address=" + address + "]";
	}
	public static void main(String args []){
		Student s = new Student();
		s.setAddress("BTM");
		s.setName("veresh");
		s.setTelephone("990-889-0000");
		Student s1 = new Student();
		s1.setAddress("BTM");
		s1.setName("veresh");
		s1.setTelephone("990-889-0000");
		HashMap<Integer,Student> map = new HashMap<Integer,Student>();
		map.put(s.hashCode(), s);
		map.put(s1.hashCode(), s1);
		System.out.println(map);
		
	}
}
