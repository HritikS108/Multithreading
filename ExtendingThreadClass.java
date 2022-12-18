import java.util.*;

class MyThread extends Thread{
		
	    MyThread(String name){
	    	super(name);
	    }
	
	   @Override public void run() {
		   int i=0;
		   while(i<500) {
			   System.out.println("running thread " + this.getName() + " i = " + i);
			   i++;
		   }
		   
	   }
	   
}

public class ExtendingThreadClass {
    
	public static void main(String[] args) {
		
		   MyThread t1 = new MyThread("alpha");
		   MyThread t2 = new MyThread("beta");
		   t1.start();
		   t2.start();
		   
		   try {
			   t1.sleep(400);
		   }
		   catch(Exception e){
			   System.out.println("exception occured");
		   }
		   
		   
	}
	    
}
