package edu.kh.inheritance.practice.model.vo;

public class Employee extends Person {

	private int salary;
	private String dept;

	public Employee() {
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name; // Person 클래스에서 name 은 Protected 로 선언되었기 때문에 직접 대입.
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String information() {
		return super.information() + 
				String.format(" / 급여 : %d / 부서 : %s", 
								salary, dept);
		
		
	}

}
