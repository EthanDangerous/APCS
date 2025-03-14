import java.awt.Color;
import java.awt.Graphics;


public class Player{
    private int x;
    private int y;
    private Color blue = new Color(0, 0, 255);


    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g){
        g.setColor(blue);
        g.fillOval(x, y, 30, 30);
    }

    public void moveUp(){
        y--;
    }
}
