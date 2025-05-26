public class Runner {

	public static void main(String[] args) {
	
		// Test part (a)
		WeatherData wDataA = new WeatherData();
		
		// initialize with test values for part (a)
		wDataA.addTemp(99.1);
		wDataA.addTemp(142);
		wDataA.addTemp(85);
		wDataA.addTemp(85.1);
		wDataA.addTemp(84.6);
		wDataA.addTemp(94.3);
		wDataA.addTemp(124.9);
		wDataA.addTemp(98);
		wDataA.addTemp(101);
		wDataA.addTemp(102.5);
		
		System.out.println("PART A:");
		// Print the ArrayList
		wDataA.printData();
		wDataA.cleanData(85, 120);
		System.out.println("\n ArrayList after call to cleanData(85, 120): ");
		wDataA.printData();
		
		// Test part (b)
		WeatherData wDataB = new WeatherData();
		wDataB.addTemp(100.5);
		wDataB.addTemp(98.5);
		wDataB.addTemp(102);
		wDataB.addTemp(103.9);
		wDataB.addTemp(87.5);
		wDataB.addTemp(105.2);
		wDataB.addTemp(90.3);
		wDataB.addTemp(94.8);
		wDataB.addTemp(109.1);
		wDataB.addTemp(102.1);
		wDataB.addTemp(107.4);
		wDataB.addTemp(93.2);
		
		System.out.println("\nPART B:");
		wDataB.printData();
		System.out.println("\nThe longest heat wave after the call to longestHeatWave(100.5) is " + wDataB.longestHeatWave(100.5));
		System.out.println("The longest heat wave after the call to longestHeatWave(95.2) is " + wDataB.longestHeatWave(95.2));
		}
	}
		
		