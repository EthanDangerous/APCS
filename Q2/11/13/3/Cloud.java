import java.awt.*;

public class Cloud{
    private Color dark = new Color(169, 153, 194);
    private Color middle = new Color(156, 129, 184);
    private Color light = new Color(195, 152, 217);
    public int x;
    public int y;
    public Cloud(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void drawMe(Graphics g){
        g.setColor(light);
        g.fillOval(x, y, 50, 30);
        g.setColor(middle);
        g.fillOval(x-15, y+20, 40, 20);
        g.setColor(dark);
        g.fillOval(x+10, y+15, 40, 20);
    }
}