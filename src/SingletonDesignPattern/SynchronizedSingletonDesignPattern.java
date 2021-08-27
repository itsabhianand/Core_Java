package SingletonDesignPattern;

public class SynchronizedSingletonDesignPattern {
	
	public static void main(String args[]) {
	
	Thread t1 = new Thread(new Runnable() {
		
		public void run() {
			ABC obj1 = ABC.getInstance();
		}
	});
	
     Thread t2 = new Thread(new Runnable() {
		
		public void run() {
			ABC obj2 = ABC.getInstance();
		}
	});
     
     t1.start();
     t2.start();
}

    static class ABC {
	private static ABC obj;
	
	  private ABC() {
		System.out.println("Instance created");
	  }
	
	  public static ABC getInstance() {
		if(obj == null) {
		synchronized(ABC.class) {
			if(obj == null) { // Again checking it to make atomic in nature.
				obj = new ABC();
			}
		}
		 
	  }
		
	   return obj;
    }
}

} 
