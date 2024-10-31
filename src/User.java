public class User {
	private int queueNumber;
	private final String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public int getQueueNumber() {
		return queueNumber;
	}
	
	public void setQueueNumber(int queueNumber) {
		this.queueNumber = queueNumber;
	}
	
	public String getName() {
		return name;
	}
}
