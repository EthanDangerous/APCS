import java.awt.Color;
import java.awt.Graphics;

public class Box{
	private int x;
	private int y;
	
	private int width;
	private int height;
	
	private Color black;
	

	public Box(int x, int y){
		this.x = x;
		this.y = y;
		this.width = 50;
		this.height = 50;
		this.black = new Color(0,0,0);

	}
	
	public void drawMe(Graphics g){

		g.setColor(black);
		g.drawRect(x,y,width,height);

		
	}
	

	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}


	
	

}





