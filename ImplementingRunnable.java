
class MyRunnable1 implements Runnable{
	
	public void run() {
		
		int i=0;
		while(i<500) {
			System.out.println("Runnable1 is running and i = " + i);
			i++;
		}
		
	}
}

class MyRunnable2 implements Runnable{
	
	public void run() {
		int i=0;
		while(i<500) {
			System.out.println("Runnable2 is running and i = " + i);
			i++;
		}
	}
}

public class ImplementingRunnable {

	    public static void main(String[] args) {
	    	
	    	MyRunnable1 obj1 = new MyRunnable1();
	    	Thread t1 = new Thread(obj1);
	    	Thread t2 = new Thread(new MyRunnable2());
	    	t1.start();
	    	t2.start();
	    }
}
