import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingleton implements Callable<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Future<String>> list = new ArrayList<Future<String>>();
		ExecutorService service = Executors.newFixedThreadPool(20000);
		TestSingleton class1 = new TestSingleton();
		for (int i = 0; i < 50000; i++) {
			 Future<String> future = service.submit(class1);
			list.add(future);
		}
		 for(Future<String> fut : list){
	            try {
	                //print the return value of Future, notice the output delay in console
	                // because Future.get() waits for task to get completed
	                System.out.println(new Date()+ "::"+fut.get());
	            } catch (InterruptedException | ExecutionException e) {
	                e.printStackTrace();
	            }
	        }
	        //shut down the executor service now
		 service.shutdown();

	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1);
		System.out.println(DoubleCheckedLockingSingleton.getInstance().toString());
		 return Thread.currentThread().getName();

	}

}
