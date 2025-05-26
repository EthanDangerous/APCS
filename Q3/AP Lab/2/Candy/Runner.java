public class Runner {

	// Test the Candy and BoxOfCandy classes
	
	public static void main(String args[]) {
		
		// Test part (a)
		BoxOfCandy boxA = new BoxOfCandy(4, 3);
		
		boxA.addCandy(0,1,"lime");
		boxA.addCandy(1,1,"orange");
		boxA.addCandy(2,2,"cherry");
		boxA.addCandy(3,1,"lemon");
		boxA.addCandy(3,2,"grape");
		
		System.out.println("Testing part (a): ");
		System.out.println("Box before moveCandyToFirstRow calls: ");
		boxA.printBox();
		System.out.println("\nmoveCandyToFirstRow(0) returns " + boxA.moveCandyToFirstRow(0));
		System.out.println("moveCandyToFirstRow(1) returns " + boxA.moveCandyToFirstRow(1));
		System.out.println("moveCandyToFirstRow(2) returns " + boxA.moveCandyToFirstRow(2));
		System.out.println("\nBox after moveCandyToFirstRow calls: ");
		boxA.printBox();
		
		// Test part (b)
		BoxOfCandy boxB = new BoxOfCandy(3, 5);
		boxB.addCandy(0, 0, "lime");
		boxB.addCandy(0, 1, "lime");
		boxB.addCandy(0, 3, "lemon");
		boxB.addCandy(1, 0, "orange");
		boxB.addCandy(1, 3, "lime");
		boxB.addCandy(1, 4, "lime");
		boxB.addCandy(2, 0, "cherry");
		boxB.addCandy(2, 2, "lemon");
		boxB.addCandy(2, 4, "orange");
		
		
		System.out.println(" \nTesting part (b): ");
		System.out.println("Box before removeNextByFlavor calls: ");
		boxB.printBox();
		
		Candy result = boxB.removeNextByFlavor("cherry");
		String flavor = "null";
		if( result != null )
			flavor = result.getFlavor();
		System.out.println("\nBox after removeNextByFlavor(\"cherry\"): " + flavor);
		boxB.printBox();
		
		result = boxB.removeNextByFlavor("lime");
		flavor = "null";
		if( result != null )
			flavor = result.getFlavor();
		System.out.println("\nBox after removeNextByFlavor(\"lime\"): " + flavor);
		boxB.printBox();
		
		result = boxB.removeNextByFlavor("grape");
		flavor = "null";
		if( result != null )
			flavor = result.getFlavor();
		System.out.println("\nBox after removeNextByFlavor(\"grape\"): " + flavor);
		boxB.printBox();
	}
}
		
		