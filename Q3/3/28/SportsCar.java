import java.awt.Graphics;
import java.awt.Color;

public class SportsCar extends MediumCar{
    public SportsCar(int x, int y, Color bodyColor){
        super(x, y, bodyColor);
    }

    @Override
    public void drawFrame(Graphics g){
        super.drawFrame(g);
        g.setColor(Color.BLACK);
        g.drawLine(getX() + 75, getY(), getX() + 75, getY() + 50);
    }

    @Override
    public void drawWheels(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(getX()+15, getY()+30, 30, 30);
        g.fillOval(getX()+100, getY()+30, 30, 30);
    }
}
