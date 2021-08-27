package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCacheThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread starts here");
        ExecutorService executor = Executors.newCachedThreadPool();
        
        executor.execute(new LoopTaskA());
        executor.execute(new LoopTaskA());
        executor.execute(new LoopTaskA());
        executor.execute(new LoopTaskA());
        executor.execute(new LoopTaskA());
        executor.execute(new LoopTaskA());
        
        executor.shutdown();
        System.out.println("Main Thread ends here");
	}

}
