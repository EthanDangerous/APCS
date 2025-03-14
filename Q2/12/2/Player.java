import java.awt.Color;
import java.awt.Graphics;

public class Player{
	private int x;
	private int y;
	private int prevX;
	private int prevY;

	private int width;
	private int height;
	
	private Color blue;
	
	public Player(int x, int y){
		this.x = x;
		this.y = y;
		this.prevX = x;
		this.prevY = y;
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
		prevY = y;
		y = y - 4;
	}
	
	public void moveDown(){
		prevY = y;
		y = y + 4;
	}
	
	public void moveLeft(){
		prevX = x;
		x = x - 4;
	}
	
	public void moveRight(){
		prevX = x;
		x = x + 4;
	}

	public void moveBack(){
		x = prevX;
		y = prevY;
	}
	
	public boolean checkCollision(Box box){

		int pX = x;
		int pY = y;
		int pWidth = width;
		int pHeight = height;
		int tX = box.getX();
		int tY = box.getY();
		int tWidth = box.getWidth();
		int tHeight = box.getHeight();

		if( 	pX+pWidth >= tX && pX <= tX + tWidth  &&
				pY+pHeight >= tY && pY <= tY + tHeight ){
			return true;
		}
		return false;
	}


}





