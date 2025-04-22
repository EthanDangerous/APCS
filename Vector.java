import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Vector {
    public int x;
    public int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector(int x, int y, int x2, int y2) {
        this.x = x2-x;
        this.y = y2-y;
    }

//    public void drawMe(Graphics g, int baseX, int baseY /* and whatever else you deem necessary */ ) {
//        // draw a line going from (baseX, baseY) to (baseX + x, baseY + y)
//        g.setColor(Color.RED);
//        g.drawLine(baseX, baseY, baseX + x, baseY + y);
//    }

    public void drawMe(Graphics g, int baseX, int baseY, double scale /* and whatever else you deem necessary */) {
        // draw a line going from (baseX, baseY) to (baseX + x * scale, baseY + y * scale)
        g.setColor(Color.RED);
        g.drawLine(baseX, baseY, baseX + (int)(x * scale), baseY + (int)(y * scale));
    }

    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y;
    }
}