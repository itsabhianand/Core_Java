package ExecutorService;

public class LoopTaskA implements Runnable{
	
	
	private int id;
	private static int count = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("######## TASK -" + id + "> STARTING #####");
		
		for(int i = 4; i>0; i--) {
			System.out.println("######### TASK -" + id + "> TICK TICK " + i);
		}
		
		try {
			Thread.sleep((long) (Math.random()*1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("######## TASK -" + id + "> DONE #####");
	}
	
	
	LoopTaskA(){
		this.id = ++count;
	}

}
