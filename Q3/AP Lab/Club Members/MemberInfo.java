public class MemberInfo
{
	private String name;
	private int gradYear;
	private boolean hasGoodStanding;
	
	/** Constructs a MemberInfo object for the club member with name name,
	* graduation year gradYear, and standing hasGoodStanding.
	*/
	public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
	{ /* implementation not shown */ 
		this.name = name;
		this.gradYear = gradYear;
		this.hasGoodStanding = hasGoodStanding;
	}
	/** Returns the graduation year of the club member. */
	public int getGradYear()
	{ /* implementation not shown */ 
		return gradYear;
	}
	/** Returns true if the member is in good standing and false otherwise. */
	public boolean inGoodStanding()
	{ /* implementation not shown */ 
		return hasGoodStanding;
	}
	
	// There may be instance variables, constructors, and methods that are not shown.
	
	public String toString(){
		return "(" + name + ", " + gradYear + ", " + hasGoodStanding + ")\n";
	}
} 