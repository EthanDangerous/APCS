public class Runner {

	public static void main(String[] args) {
		
		// Test the Sign class
		Sign sign1 = new Sign("ABC222DE", 3);
		
		System.out.println("\n sign1.numberOfLines() = " +sign1.numberOfLines());
		System.out.println(" sign1.getLines() = " +sign1.getLines());
		System.out.println(" sign1.getLines() = " +sign1.getLines());
		
		Sign sign2 = new Sign("ABCD", 10);
		System.out.println("\n sign2.numberOfLines() = " +sign2.numberOfLines());
		System.out.println(" sign2.getLines() = " +sign2.getLines());
		
		Sign sign3 = new Sign("ABCDEF", 6);
		System.out.println("\n sign3.numberOfLines() = " +sign3.numberOfLines());
		System.out.println(" sign3.getLines() = " +sign3.getLines());
		
		Sign sign4 = new Sign("",4);
		System.out.println("\n sign4.numberOfLines() = " +sign4.numberOfLines());
		System.out.println(" sign4.getLines() = " +sign4.getLines());
		
		Sign sign5 = new Sign("AB_CD_EF", 2);
		System.out.println("\n sign5.numberOfLines() = " +sign5.numberOfLines());
		System.out.println(" sign5.getLines() = " +sign5.getLines());
	}
}