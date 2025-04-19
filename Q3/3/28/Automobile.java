import java.awt.Graphics;
import java.awt.Color;

public abstract class Automobile{
    private int x;
    private int y;
    private Color bodyColor;

    public Automobile(int x, int y, Color bodyColor){
        this.x = x;
        this.y = y;
        this.bodyColor = bodyColor;
    }

    public void drawMe(Graphics g){
        drawFrame(g);
        drawWheels(g);
    }

    public abstract void drawFrame(Graphics g);
    public abstract void drawWheels(Graphics g);

	public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Color getBodyColor(){
        return bodyColor;
    }
}



