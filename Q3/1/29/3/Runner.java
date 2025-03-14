import  java.util.ArrayList;

public class Runner{
	public static void main(String args[]){
		//What do you have to import to use ArrayList?
		
		//What do you think the ? in ArrayList< ? > represents?
		ArrayList<Song> songList1 = new ArrayList<Song>();
		
		//What do you think the method add() does?
		songList1.add(new Song("John", "Happy"));
		songList1.add(new Song("Jose", "Hello"));
		
		//What do you think the method get() does?
		//What method gets called by default when you don't use getName() ?
		System.out.println();
		System.out.println( songList1.get(0).getName() );
		System.out.println( songList1.get(1).getName() );
		System.out.println( songList1.get(0) );
		System.out.println( songList1.get(1) );
		
		//What do you think the method set() does?
		System.out.println();
		songList1.set(1, new Song("Jen", "Happy Days") );
		System.out.println( songList1.get(1) );



		ArrayList<Song> songList2 = new ArrayList<Song>();
		songList2.add(new Song("me", "abc"));
		songList2.add(new Song("you", "123"));
		songList2.add(new Song("Elvis", "Las Vegas"));

		System.out.println( songList2.get(0) );
		System.out.println( songList2.get(2) );
	}
}
