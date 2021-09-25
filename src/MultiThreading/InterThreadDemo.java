package MultiThreading;

public class InterThreadDemo { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SudoMap map = new SudoMap();
          Producer p = new Producer(map);  
          Consumer c = new Consumer(map);
          
          Thread t1 = new Thread(p);
          Thread t2 = new Thread(c);
          
          t1.start();
          t2.start();
	}
	
}

class SudoMap {
	int num;
	boolean valueSet = false;
	
	public synchronized void put(int num) {
		
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Value put is -------->" + num);
		this.num = num;
		valueSet = true;
		notify();
	}
	
	public synchronized void get() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Value get is -------->" + num);
		valueSet = false;
		notify();
	}
}


class Producer implements Runnable {
   
	SudoMap map;
	Producer(SudoMap map){
		this.map = map;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true) {
			map.put(i++);
		    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


class Consumer implements Runnable {
	   
	SudoMap map;
	
	Consumer(SudoMap map){
		this.map = map;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			map.get();
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
