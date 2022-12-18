package Employee;
// default class

class Employee{
	
	// public and private variables and methods
	// if we define constructor as private then objects of class cant be created outside this class.
	int id;
	private String name;
	int age;
	static int numOfEmployees=0;            // keep count of employees. value will be same in all objects
	
	public Employee(String name, int age) {
		this.name = name;
		
		// 
		if(age < 18 || age > 70) {
			System.out.println("Age is not valid");
			return;
		}
		
		this.age=age;
		numOfEmployees++;
		this.id = numOfEmployees ;
	}
	
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}
	
};