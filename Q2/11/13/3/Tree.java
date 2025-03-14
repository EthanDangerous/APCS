import java.awt.*;

public class Tree{
    private Color green = new Color(0, 155, 0);
    private Color brown = new Color(125, 50, 20);
    private int x;
    private int y;
    public Tree(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void drawMe(Graphics g){
        g.setColor(brown);
        g.fillRect(x+10, y+15, 10, 30);
        g.setColor(green);
        g.fillOval(x, y, 30, 30);
    }
}