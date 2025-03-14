import java.awt.Color;
import java.awt.Graphics;

public class Target{
	private int x;
	private int y;
	
	private int width;
	private int height;

	private boolean visible = true;
	
	private Color red;
	
	public boolean getVisible(){
		return visible;
	}
	public void setVisible(boolean v){
		visible = v;
	}

	public Target(int x, int y){
		this.x = x;
		this.y = y;
		this.width = 75;
		this.height = 75;
		this.red = new Color(255,0,0);
	}
	
	public void drawMe(Graphics g){
		if(visible){
			g.setColor(red);
			g.fillOval(x,y,width,height);
		}
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





