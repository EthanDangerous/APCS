import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;


public class Screen extends JPanel{


	private Sedan sd;
	private SportsCar sc;
	private SUV sv;
	private Truck tr;


	public Screen(){

		sd = new Sedan(100, 100, Color.BLUE);
		sc = new SportsCar(300, 200, Color.RED);
		sv = new SUV(500, 300, Color.CYAN);
		tr = new Truck(175, 400, Color.GREEN);

	}
	
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//draw background
		g.setColor( Color.white );
		g.fillRect(0,0,800,600);

		sd.drawMe(g);
		sc.drawMe(g);
		sv.drawMe(g);
		tr.drawMe(g);
	}

	
	
}



