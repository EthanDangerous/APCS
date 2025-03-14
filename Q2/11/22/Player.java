import java.awt.Color;
import java.awt.Graphics;

public class Player{
	private int x;
	private int y;
	
	private int width;
	private int height;
	
	private Color blue;
	
	public Player(int x, int y){
		this.x = x;
		this.y = y;
		this.width = 50;
		this.height = 50;
		this.blue = new Color(0,0,255);
	}
	
	public void drawMe(Graphics g){
		g.setColor(blue);
		g.fillRect(x,y,width,height);
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

	
	public void moveUp(){
		y = y - 5;
	}
	
	public void moveDown(){
		y = y + 5;
	}
	
	public void moveLeft(){
		x = x - 5;
	}
	
	public void moveRight(){
		x = x + 5;
	}
	
	public boolean checkCollision(Target target){
		int pX = x;
		int pY = y;
		int pWidth = width;
		int pHeight = height;
		int tX = target.getX();
		int tY = target.getY();
		int tWidth = target.getWidth();
		int tHeight = target.getHeight();

		if( 	pX+pWidth >= tX && pX <= tX + tWidth  &&
				pY+pHeight >= tY && pY <= tY + tHeight ){
			//System.out.println("Collision");
			return true;
		}
		return false;
	}

}





