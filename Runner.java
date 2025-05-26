import javax.swing.*;
import java.awt.*;

public class Runner {

	public static Screen canvas = new StartScreen(1920, 1080);
	public static JFrame frame;
  
	public static void main(String[] args) {

		//Create the frame.
		frame = new JFrame("Dots and Boxes");

		Image icon = new ImageIcon("icon.png").getImage();
		frame.setIconImage(icon);

		//What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create panel and add it to the frame
		frame.add(canvas);

		//Fit the preferred size its subcomponents.
		frame.pack();
		
		//Show it.
		frame.setVisible(true);

		//call animate in canvas
		canvas.animate();
	}
}
