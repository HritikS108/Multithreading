package Employee;

public class SoftwareEngineer extends Employee{

         int salary;
         double bonus;
         
        public SoftwareEngineer(String name, int age){
        	 super(name,age);
         }
         
         public void setSalary(int amount) {
     		
    		 if(amount <= 0) {
    			 System.out.println("invalid salary");
    			 return;
    		 }
    		 this.salary = amount;
    	}
    	
         public int getAge() {
     		return this.age;
     	}
     	
         
        public int getSalary() {
        	return this.salary;
        }
        
        public void setBonus(double bonusAmt) {
        	bonus = bonusAmt;
        }
}
