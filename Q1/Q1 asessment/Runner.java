import java.util.Scanner;
import javax.swing.JFrame;

public class Runner {

	public static void main( String args[] ) {
        
        //be sure to make a class diagram
        
        Scanner sc = new Scanner(System.in);
        JFrame frame = new JFrame("Scenery");

        System.out.println("Would you like day(1) or night(2)? only enter a number.");
        int timeChoice = sc.nextInt();

        System.out.println("Would you like sun(1) clouds(2) or rain(3)? only enter a number.");
        int weatherChoice = sc.nextInt();

        // this puts both choices into Scenery
        Scenery canvas = new Scenery(timeChoice, weatherChoice);
        frame.add(canvas);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}