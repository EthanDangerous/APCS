public class Runner {
	public static void main(String[] args){
		Textbook bio2015 = new Textbook("Biology" , 49.75, 2);
		Textbook bio2019 = new Textbook("Biology" , 39.75, 3);
		System.out.println("bio 2019 edition: " + bio2019.getEdition());
		System.out.println("bio 2019 info: " + bio2019.getBookInfo());
		System.out.println("bio 2019 can sub for bio 2015: " + bio2019.canSubstituteFor(bio2015));
		System.out.println("bio 2015 can sub for bio 2019: " + bio2015.canSubstituteFor(bio2019));
		
		Textbook math = new Textbook("Calculus" , 45.25, 1);
		System.out.println("bio 2015 can sub for math: " + bio2015.canSubstituteFor(math));
	}
}