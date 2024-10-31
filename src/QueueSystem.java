import java.util.LinkedList;
import java.util.Queue;

public class QueueSystem {
	static QueueSystem instance;
	private int currentNumber = 1;
	private final Queue<User> queue = new LinkedList<>();
	
	private QueueSystem() {}
	
	public static synchronized QueueSystem getInstance() {
		if (instance == null) {
			instance = new QueueSystem();
		}
		return instance;
	}
	
	public synchronized User getNextInQueue() {
		return queue.poll();
	}
	
	public synchronized int registerUserToQueue(User user) {
		user.setQueueNumber(currentNumber++);
		queue.add(user);
		return user.getQueueNumber();
	}
	
	public synchronized void resetQueueNumber(int currentNumber) {
		if (currentNumber < 1) {
			System.out.println("Invalid queue number. Queue number must be greater than 0.");
			return;
		}
		
		this.currentNumber = currentNumber;
		System.out.println("Queue reset to number: " + currentNumber);
	}
}
