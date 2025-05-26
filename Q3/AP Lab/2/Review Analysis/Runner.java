import java.util.ArrayList;

public class Runner {
	public static void main(String[] args){
		Review[] allReviews = new Review[5];
		allReviews[0] = new Review(4, "Good! Thx");
		allReviews[1] = new Review(3, "OK site");
		allReviews[2] = new Review(5, "Great!");
		allReviews[3] = new Review(2, "Poor! Bad.");
		allReviews[4] = new Review(3, "");
		
		System.out.println("Testing Part A:");
		ReviewAnalysis ra = new ReviewAnalysis(allReviews);
		System.out.println("Average Rating: " + ra.getAverageRating());
		
		
		System.out.println("\nTesting Part B:");
		ArrayList<String> comments = ra.collectComments();
		for(String each : comments ){
			System.out.println( each );
		}
	}
}