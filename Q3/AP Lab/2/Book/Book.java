public class Book
{
	/** The title of the book */
	private String title;

	/** The price of the book */
	private double price;

	/** Creates anew Book with given title and price */
	public Book(String bookTitle, double bookPrice)
	{ 
		title = bookTitle;
		price = bookPrice;
	}

	/** Returns the title of the book */
	public String getTitle()
	{ 
		return title; 
	}

	/** Returns a string containing the title and price of the Book */
	public String getBookInfo()
	{
		return title + "-" + price;
	}

	public double getPrice(){
		return price;
	}
	
	// There may be instance variables, constructors, and methods that are not shown.
}