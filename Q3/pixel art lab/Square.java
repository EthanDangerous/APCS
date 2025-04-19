import java.awt.Graphics;
import java.awt.Color;

public class Square{
    private int red;
    private int green;
    private int blue;
    private Color color;
    private int size;
    private boolean picker;

    public Square(int pixelSize, boolean picker, Color color){
        red = 255;
        green = 255;
        blue = 255;
        size = pixelSize;
        this.picker = picker;
        this.color = color;
    }

    public void drawMe(Graphics g, int x, int y){
        g.setColor(color);
        g.fillRect(x, y, size, size);
        g.setColor(new Color(200, 200, 200));
        g.drawRect(x, y, size, size);
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public void setSize(int size){
        this.size = size;
    }
}