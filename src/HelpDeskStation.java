public record HelpDeskStation(String stationName) {
	public void callNextInQueue(OnlineMonitoringSystem onlineMonitoringSystem) {
		User user = QueueSystem.getInstance().getNextInQueue();
		if (user == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println(stationName + " calling queue number: " + user.getQueueNumber());
		onlineMonitoringSystem.displayCurrentQueue(stationName, user.getQueueNumber());
	}
	
	public void resetQueue(int resetNumber) {
		QueueSystem.getInstance().resetQueueNumber(resetNumber);
		System.out.println("Queue number reset: " + resetNumber);
	}
}
