import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerPattern implements Callable<String> {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		BlockingQueue sharedQueue = new LinkedBlockingQueue();
		List<Future<String>> list = new ArrayList<Future<String>>();

		Thread producerThread = new Thread(new Producers(sharedQueue));
		Thread consumerThread = new Thread(new Consumers(sharedQueue));

		//producerThread.start();
		//consumerThrad.start();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(producerThread);
		executorService.submit(consumerThread);
		executorService.shutdown();

	}

	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName();

	}

}

class Producers implements Runnable {
	private final BlockingQueue sharedQueue;

	public Producers(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Produced: " + i);
				sharedQueue.put(i);
			} catch (InterruptedException ex) {
				Logger.getLogger(Producers.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}

	}

}

class Consumers implements Runnable {
	private final BlockingQueue sharedQueue;

	public Consumers(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + sharedQueue.take());
			} catch (InterruptedException ex) {
				Logger.getLogger(Consumers.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}

	}

}
