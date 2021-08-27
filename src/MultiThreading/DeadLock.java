package MultiThreading;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "FirstString";
       String s2 = "SecondString";
       
       First first = new First(s1,s2);
       Second second = new Second(s1, s2);
       Thread t1 = new Thread(first);
       t1.setName("Thread1");
       Thread t2 = new Thread(second);
       t2.setName("Thread2");
       
       t1.start();
	   t2.start();
	}

}


class First implements Runnable {
	
	String s1;
	String s2;
	
	First(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(s1) {
			System.out.println(Thread.currentThread().getName() + " Locked ---->" + s1);
			
			try {
				Thread.sleep(100);
				synchronized(s2) {
					System.out.println(Thread.currentThread().getName() + " Locked --->" + s2);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Second implements Runnable {
	
	String s1;
	String s2;
	
	Second(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run() {
		synchronized(s2) {
			System.out.println(Thread.currentThread().getName() + " Locked ---->" + s2);
			try {
				Thread.sleep(100);
				/*
				 * synchronized(s1) { System.out.println(Thread.currentThread().getName() +
				 * " Locked --->" + s1); }
				 */
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		synchronized(s1) {
			System.out.println(Thread.currentThread().getName() + " Locked --->" + s1);
		}
		
	}
	
}
