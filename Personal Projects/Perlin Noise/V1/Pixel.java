import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Pixel {
    public double dotProduct;
    private float colorIndex;
    private int x;
    private int y;

    public Pixel(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setDotProduct(double n){
        this.dotProduct = n;
        if(n < -1){
            n = -1;
        }
        if(n > 1){
            n = 1;
        }
        this.colorIndex = (float) ((n+1)/2);
    }

    public void drawMe(Graphics g){
        if(colorIndex>=0){
            g.setColor(new Color(colorIndex, colorIndex, colorIndex));
        }else{
            g.setColor(Color.WHITE);
        }
        g.drawRect(x, y, 1, 1);
    }
}
