import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;



public class Screen extends JPanel {

	private Dog myDog;

	public Screen(){
		myDog = new Dog(100, 100);
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		myDog.drawMe(g);
	}

	public void animate(){
		while(true){
			myDog.move();
			repaint();
			try{
				Thread.sleep(10); //milliseconds
			} catch (InterruptedException ex){
				Thread.currentThread().interrupt();
			}
		}
	}
}