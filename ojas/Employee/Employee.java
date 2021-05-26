package com.ojas.Employee;

class Employee {
	String name;
	int empid;
	double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, int empid, double salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
}

enum ManagerType {
	HR, SALES,
}

class Manager extends Employee {
	ManagerType type;

	public Manager(String name, int empid, double salary, ManagerType type) {
		super(name, empid, salary);
		this.type = type;
	}

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}

	void setSalary() {
		if (this.type == ManagerType.HR) {
			salary += 10000;
		} else {
			salary += 5000;
		}
	}

	@Override
	public String toString() {
		return "Manager [type=" + type + ", name=" + name + ", employeeID=" + empid + ", salary=" + salary + "]";
	}
}

class Clerk extends Employee {
	private static final String accuracy = null;
	int speed;
	int acuuracy;
	int increment = 0;

	public Clerk(String name, int empid, double salary, int speed, int acuuracy) {
		super(name, empid, salary);
		this.speed = speed;
		this.acuuracy = acuuracy;
	}

	public Clerk(String name, int empid, double salary) {
		super(name, empid, salary);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAcuuracy() {
		return acuuracy;
	}

	public void setAcuuracy(int acuuracy) {
		this.acuuracy = acuuracy;
	}

	void setSalary() {
		if (increment == 0) {
			if (speed >= 70 && acuuracy >= 80) {
				salary += 100;
				increment++;
			}
		}
	}

	public String toString() {
		return "clerk [speed=" + speed + ", accuracy=" + accuracy + ", increment=" + increment + ", name=" + name
				+ ", employeeID=" + empid + ", salary=" + salary + "]";
	}

}
