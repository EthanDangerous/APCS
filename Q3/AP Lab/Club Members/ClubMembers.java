import java.util.ArrayList;

public class ClubMembers
{
	private ArrayList<MemberInfo> memberList;
	
	public ClubMembers(){
		memberList = new ArrayList<MemberInfo>();
	}
	
	
	/** Adds new club members to memberList, as described in part (a).
	* Precondition: names is a non-empty array.
	*/
	public void addMembers(String[] names, int gradYear)
	{ /* to be implemented in part (a) */ 
		for(int i = 0; i<names.length; i++){
			memberList.add(new MemberInfo(names[i], gradYear, true));
		}
	}
	
	
	/** Removes members who have graduated and returns a list of members who have graduated
	* and are in good standing, as described in part (b).
	*/
	public ArrayList<MemberInfo> removeMembers(int year)
	{ /* to be implemented in part (b) */
		ArrayList<MemberInfo> newList = new ArrayList<MemberInfo>();
		for(int i = 0; i<memberList.size()-1; i++){
			if(memberList.get(i).inGoodStanding()){
				newList.add(memberList.get(i));
			}
		}
		return newList;
	}
	
	// There may be instance variables, constructors, and methods that are not shown.
	public String toString(){
		String txt = "";
		for(int i=0; i<memberList.size(); i++){
			txt += memberList.get(i).toString();
		}
		return txt;
		
	}
	
	
	public void setupPartB(){
		memberList.add(new MemberInfo("SMITH, JANE", 2019, false));
		memberList.add(new MemberInfo("FOX, STEVE", 2018, true));
		memberList.add(new MemberInfo("XIN, MICHAEL", 2017, false));
		memberList.add(new MemberInfo("GARCIA, MARIA", 2020, true));
	}
} 