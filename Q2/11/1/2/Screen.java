import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;



public class Screen extends JPanel {

	private Color yellow;
	private Color green;
	private Color green2;
	private Color ground;
	private Color sky;
	private int sunY = 500;
	private int nightY = 300;
	private Color night;

	public Screen(){
		yellow = new Color(255, 255, 0);
		green = new Color(0, 200, 0);
		green2 = new Color(100, 255, 0);
		ground = new Color(31, 155, 41);
		sky = new Color(120, 120, 225);
		night = new Color(51, 51, 51);
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		drawSky(g);
		drawNight(g);
		drawSun(g);
		drawGrass(g);
		drawGround(g);
	}

	public void drawSky(Graphics g){
		g.setColor(sky);
		g.fillRect(0, 0, 800, 600);
	}

	public void drawSun(Graphics g){
		g.setColor(yellow);
		g.fillOval(10, sunY, 50, 50);
	}

	public void drawNight(Graphics g){
		g.setColor(night);
		g.fillRect(0, nightY, 800, 700);
	}

	public void drawGround(Graphics g){
		g.setColor(ground);
		g.fillRect(0, 415, 800, 200);
	}

	private double y = 390 + (Math.random() * 15);
	private int y2 = (int)y;
	private double y3 = 390 + (Math.random() * 15);
	private int y4 = (int)y3;

	public void drawGrass(Graphics g){
		g.setColor(green);
		int count = 0;
		int x = 0;
		while(count <= 100){
			g.fillRect(x, y2, 5, 30);
			x += 8;
			//y = 395 + (Math.random() * 10);
			//y2 = (int)y;
			count++;
		}
		g.setColor(green2);
		count = 0;
		x = 5;
		while(count <= 100){
			g.fillRect(x, y4, 5, 30);
			x += 8;
			//y = 395 + (Math.random() * 10);
			//y2 = (int)y;
			count++;
		}
	}

	public void animate(){
		while(true){
			sunY--;
			nightY--;

			if(sunY < -600){
				sunY = 600;
				sky = new Color(51, 51, 51);
			}

			try {
				Thread.sleep(10); //in milliseconds
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			repaint();
		}
	}
}