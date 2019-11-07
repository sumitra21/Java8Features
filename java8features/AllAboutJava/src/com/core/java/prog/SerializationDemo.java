package com.core.java.prog;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) {
		
		Department d1 = new Department();
		d1.setDeptName("Finance");
		Employee e = new Employee();
		e.setA(25);
		e.setId("101"); e.setName("Sumitra");e.setDept(d1);
		
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.ser"));
			out.writeObject(d1);
			out.close();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.ser"));
			Department emp = (Department)in.readObject();
			
			System.out.println("After Desirialization....");
			System.out.println("A = "+emp.getA());
			System.out.println("Id = "+emp.getId());
			System.out.println("Name = "+emp.getName());
			System.out.println("Dept = "+emp.getDeptName());
			
			in.close();
			
		} catch (IOException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
	}

}

class Employee{
	
	private static int a;
	private transient String id;
	private String name;
	private Department dept;
	
	public Employee(){
		
	}
	
	
	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		Employee.a = a;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}
	
	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

class Department extends Employee implements Serializable{
	
	private String deptName;
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "Department [name=" + deptName + "]";
	}
}

