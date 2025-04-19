import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;



public class Screen extends JPanel {

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		drawBranch(g, 400, 400, 70, 90);
		g.drawLine(400,400 ,400,550);
	}

	public void drawBranch(Graphics g, int startX, int startY, int distance, int degree){
		g.drawLine(startX, startY, startX+distance, startY-distance);
		g.drawLine(startX, startY, startX-distance, startY-distance);
		int startX2 = startX+distance;
		int startX3 = startX-distance;
		int startY2 = startY-distance;
		int distance2 = distance/2;
		if(distance2 >2){
			drawBranch(g, startX2, startY2, distance2, degree);
			drawBranch(g, startX3, startY2, distance2, degree);
		}
//		g.drawLine(startX, startY, startX-distance, startY-distance);
//		startX = startX / 2;
//		startY = startY / 2;
		//We won't use degree as it's not needed for part 1 and part 2.

		//Include a base case (stop condition).  At some point, the recursive method call has to end.

		//Draw the left branch from x and y, you can use the distance variable to get the end points.
		//Draw the right branch from x and y, you can use the distance variable to get the end points.

		//Shorten the distance for the next set of branches above
		//Call drawBranch(*) for the left side passing in graphics, endx, and endy for the left branch, and the new distance
		//Call drawBranch(*) for the right side passing in graphics, endx, and endy for the right branch, and the new distance

	}
}
