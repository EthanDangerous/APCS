import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Dot extends Sprite {
    private int size;
    private int dist;
    public int x;
    public int y;

    public Dot(int size, int dist){
        this.size = size;
        this.dist = dist;
    }

    @Override
    public void drawMe(Graphics g, int x, int y, int offsetX, int offsetY){
        g.setColor(new Color(158, 222, 221));
        g.fillOval(offsetX + x*dist - (size/2), offsetY + y*dist - (size/2), size, size);
        this.x = offsetX + x*dist;
        this.y = offsetY + y*dist;
    }
}
