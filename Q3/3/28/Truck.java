import java.awt.Graphics;
import java.awt.Color;

public class Truck extends BigCar{
    public Truck(int x, int y, Color bodyColor){
        super(x, y, bodyColor);
    }

    @Override
    public void drawFrame(Graphics g){
        super.drawFrame(g);
        g.setColor(Color.BLACK);
        g.drawLine(getX() + 40, getY(), getX() + 40, getY() + 75);
        g.drawLine(getX() + 100, getY(), getX() + 100, getY() + 75);
        g.drawLine(getX() + 160, getY(), getX() + 160, getY() + 75);
    }

    @Override
    public void drawWheels(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(getX()+15, getY()+45, 50, 50);
        g.fillOval(getX()+135, getY()+45, 50, 50);
    }
}
