public class OnlineMonitoringSystem {
	public void displayCurrentQueue(String stationName, Integer number) {
		System.out.println("Queue number " + number + " please go to " + stationName);
	}
	
	public void requestQueueNumber(String userName) {
		User user = new User(userName);
		int queueNumber = QueueSystem.getInstance().registerUserToQueue(user);
		System.out.println(user.getName() + ", your queue number is " + queueNumber);
	}
}
