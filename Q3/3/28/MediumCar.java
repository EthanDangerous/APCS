import java.awt.Graphics;
import java.awt.Color;

public class MediumCar extends Automobile{

    public MediumCar(int x, int y, Color bodyColor){
        super(x, y, bodyColor);
    }

    @Override
    public void drawFrame(Graphics g){
        g.setColor(getBodyColor());
        g.fillRect(getX(), getY(), 150, 50);
    }

    @Override
    public void drawWheels(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(getX()+15, getY()+30, 30, 30);
        g.fillOval(getX()+100, getY()+30, 30, 30);
    }
}

