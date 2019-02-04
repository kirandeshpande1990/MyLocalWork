import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DeadLockExample implements Callable<String>, Runnable {
	static DeadLockExample example;

	private void method1() {
		synchronized (String.class) {
			System.out.println("Inside string");

		}
		synchronized (Integer.class) {
			System.out.println("inside integer");
		}
	}

	private void method2() {
		synchronized (Integer.class) {
			System.out.println("inside integer");
		}

		synchronized (String.class) {
			System.out.println("Inside string");

		}

	}

	public static void main(String[] args) {
		example = new DeadLockExample();

		Thread t1 = new Thread(example);
		Thread t2 = new Thread(example);
		
			t1.start();
			t2.start();
			
		

		ExecutorService service = Executors.newFixedThreadPool(10);

		/*
		 * try { for (int i = 0; i < 10; i++) {
		 * 
		 * Future<String> future = service.submit(example);
		 * System.out.println(future.get()); }
		 * 
		 * } catch (InterruptedException e) { e.printStackTrace(); } catch
		 * (ExecutionException e) { e.printStackTrace(); }
		 */

	}

	@Override
	public String call() throws Exception {

		example.method1();
		example.method2();
		return Thread.currentThread().getName();
	}

	@Override
	public void run() {
		example.method1();
		example.method2();
		// TODO Auto-generated method stub

	}

}
