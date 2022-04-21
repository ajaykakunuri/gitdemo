package com.ajay;

public class Employee {
	int eid;
	String name;
	int sal;
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		
	}
void salary()
{
	System.out.println(sal*10);
}
public static void main(String[] args) {
		Employee e=new Employee();
		e.eid=100;
		e.name="ajay";
		
	
		e.display();
		
		Employee r=new Employee();
		r.sal=100;
        r.salary();
		
	

	}

}