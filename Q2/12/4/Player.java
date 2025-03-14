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
		y = y - 3;
	}
	
	public void moveDown(){
		y = y + 3;
	}
	
	public void moveLeft(){
		x = x - 3;
	}
	
	public void moveRight(){
		x = x + 3;
	}

	public void setX(int x){
		this.x = x;
	}

	
	

	public boolean checkCollisionTarget(Box box){
		
	
		int pX = getX();
		int pY = getY();
		int pWidth = getWidth();
		int pHeight = getHeight();
		int tX = box.getX();
		int tY = box.getY();
		int tWidth = box.getWidth();
		int tHeight = box.getHeight();
		
		if( pX+pWidth >= tX && pX <= tX + tWidth  &&  
			pY+pHeight >= tY && pY <= tY + tHeight ){
				System.out.println("Collision");
				return true;
		}
		
		return false;
		

	}

}





