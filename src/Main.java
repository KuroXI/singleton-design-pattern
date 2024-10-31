import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HelpDeskStation station1 = new HelpDeskStation("Help Desk 1");
		HelpDeskStation station2 = new HelpDeskStation("Help Desk 2");
		HelpDeskStation station3 = new HelpDeskStation("Help Desk 3");
		
		OnlineMonitoringSystem onlineMonitoringSystem = new OnlineMonitoringSystem();
		
		Scanner scanner = new Scanner(System.in);
		do {
			_printController();
			
			int input = scanner.nextInt();
			switch (input) {
				case 1:
					System.out.print("Enter your username: ");
					onlineMonitoringSystem.requestQueueNumber(scanner.next());
					break;
				case 2:
					_helpDeskSwitchCases(station1, onlineMonitoringSystem, scanner);
					break;
				case 3:
					_helpDeskSwitchCases(station2, onlineMonitoringSystem, scanner);
					break;
				case 4:
					_helpDeskSwitchCases(station3, onlineMonitoringSystem, scanner);
					break;
				case 5:
					System.out.println("Exit - John Victor Gonzales");
					scanner.close();
					System.exit(0);
				default:
					System.out.println("Invalid input");
					break;
			}
		} while (true);
	}
	
	private static void _printController() {
		System.out.println("\n1 - Request a Queue Number");
		System.out.println("2 - Help Desk 1");
		System.out.println("3 - Help Desk 2");
		System.out.println("4 - Help Desk 3");
		System.out.println("5 - Exit\n");
		
		System.out.print("Enter your choice: ");
	}
	
	private static void _helpDeskSwitchCases(
		HelpDeskStation station,
		OnlineMonitoringSystem onlineMonitoringSystem,
		Scanner scanner
	) {
		_helpDeskController();
		
		int input = scanner.nextInt();
		switch (input) {
			case 1:
				station.callNextInQueue(onlineMonitoringSystem);
				break;
			case 2:
				System.out.print("Enter queue number: ");
				station.resetQueue(scanner.nextInt());
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid input");
				break;
		}
	}
	
	private static void _helpDeskController() {
		System.out.println("\n1 - Call next in Queue");
		System.out.println("2 - Reset Queue");
		System.out.println("3 - Go back\n");
		
		System.out.print("Enter your choice: ");
	}
}
