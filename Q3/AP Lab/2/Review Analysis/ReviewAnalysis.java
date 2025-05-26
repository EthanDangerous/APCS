import java.util.ArrayList;

public class ReviewAnalysis
{
	/** All user reviews to be included in this analysis */
	private Review[] allReviews;
	
	
	/** Initializes allReviews to contain all the Review objects to be analyzed */
	public ReviewAnalysis(Review[] allReviews)
	{
		this.allReviews = allReviews;
	}
	
	
	/** Returns a double representing the average rating of all the Review objects to be
	* analyzed, as described in part (a)
	* Precondition: allReviews contains at least one Review.
	* No element of allReviews is null.
	*/
	public double getAverageRating()
	{ /* to be implemented in part (a) */
		double total = 0;
		for(Review each : allReviews){
			total += each.getRating();
		}
		return total/allReviews.length;
	}
	
	
	/** Returns an ArrayList of String objects containing formatted versions of
	* selected user comments, as described in part (b)
	* Precondition: allReviews contains at least one Review.
	* No element of allReviews is null.
	* Postcondition: allReviews is unchanged.
	*/
	public ArrayList<String> collectComments()
	{ /* to be implemented in part (b) */ 
		ArrayList<String> returnList = new ArrayList<String>();
		for(int i = 0; i<allReviews.length-1; i++){
			if(allReviews[i].getComment().indexOf("!") != -1){
				if((allReviews[i].getComment().indexOf("!") != allReviews[i].getComment().length()) && (allReviews[i].getComment().indexOf(".") != allReviews[i].getComment().length())){
					returnList.add(i + "-" + allReviews[i].getComment() + ".");
				}else{
					returnList.add(i + "-" + allReviews[i].getComment());
				}
			}
		}
		return returnList;
	}
} 