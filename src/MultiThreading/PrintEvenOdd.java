package MultiThreading;

public class PrintEvenOdd {
     
	int counter = 1;
	 int num = 50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PrintEvenOdd obj = new PrintEvenOdd();
        Runnable obj1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj.printOdd();
			}
        	
        };
        
        Runnable obj2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj.printEven();
			}
        	
        };
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.setName("Thread1");
        t2.setName("Thread2");
        
        t1.start();
        t2.start();
        
	}
	
	public synchronized void printEven() {
		 
		int timer = 0;
		
		while(counter < num) {
			timer++;
			
			if(counter % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName() + " Num ----> " + counter);
			counter++;
			notify();
		}
		
		System.out.println("Time PrintEvenNumber " + timer);
	}
	
	public synchronized void printOdd() {
		 
		int timer = 0;
		
		while(counter < num) {
			timer++;
			
			if(counter % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName() + " Num ----> " + counter);
			counter++;
			notify();
		}
		
		System.out.println("Time PrintOddNumber " + timer);
	}

}
