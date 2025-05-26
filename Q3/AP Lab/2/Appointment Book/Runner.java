public class Runner {
	public static void main(String[] args) {
		
		// Test code from part (a) 
		AppointmentBook aBook = new AppointmentBook();
		
		aBook.reserveBlock(2, 0, 10);
		aBook.reserveBlock(2, 15, 15);
		aBook.reserveBlock(2,45,5);
		
		System.out.println("Test Part a:");
		System.out.println("findFreeBlock(2, 15) returns " + aBook.findFreeBlock(2, 15));   // should print 30
		System.out.println("findFreeBlock(2, 9) returns " + aBook.findFreeBlock(2, 9));    // should print 30
		System.out.println("findFreeBlock(2, 15) returns " + aBook.findFreeBlock(2, 20));  // should print -1
		
		// Test code from part (b)
		
		
		AppointmentBook bBook = new AppointmentBook();
		
		bBook.reserveBlock(2, 0, 25);
		bBook.reserveBlock(2, 30, 30);
		bBook.reserveBlock(3, 15, 26);
		bBook.reserveBlock(4, 0, 5);
		bBook.reserveBlock(4, 30, 14);
		
		System.out.println("\nTest Part b:");
		
		bBook.printTable();
		System.out.println();
		System.out.println("makeAppointment(2, 4, 22) returns " + bBook.makeAppointment(2, 4, 22));
		System.out.println("makeAppointment(2, 4, 3) returns " + bBook.makeAppointment(3, 4, 3));
		System.out.println("makeAppointment(2, 4, 30) returns " + bBook.makeAppointment(2, 4, 30));
		System.out.println();
		bBook.printTable();
	}
}
		
		
		
		