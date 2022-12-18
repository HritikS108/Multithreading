import Employee.*;

public class Main {

	  public static void main(String[] args) {
		  
		    SoftwareEngineer emp1 = new SoftwareEngineer("hritik",22);
		    emp1.setSalary(100000);
		    System.out.println(emp1.getAge());
		    
		    Manager emp2 = new Manager("swaraj",22);
		    emp2.setSalary(110000);
		    System.out.println(emp2.getSalary());
		    
	  }
}
