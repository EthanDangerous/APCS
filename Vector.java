import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Vector {
    private int squareSize;
    private double scalarLength;
    public int startX;
    public int startY;
    public double endX;
    public double endY;
    public double direction;
    public double xDist;
    public double yDist;

    public Vector(int size, double arrowLength){
        this.scalarLength = arrowLength*size;
        this.squareSize = size;
        direction = (Math.random() * 361) * (Math.PI/180);
    }

    public Vector(int startX, int startY, int endX, int endY){
        this.xDist = endX-startX;
        this.yDist = endY-startY;
    }

    public void drawMe(Graphics g, int x, int y, int coordX, int coordY){
        if(direction>=0){
            startX = coordX + squareSize*x;
            startY = coordX + squareSize*y;
            endX = startX + (Math.cos(direction) * scalarLength);
            endY = startY + (Math.sin(direction) * scalarLength);
            xDist = endX - startX;
            yDist = endY - startY;



            g.setColor(Color.RED);
            g.drawLine(startX, startY, (int) endX, (int) endY);
            // endpoint is (x = cos(radians), y = sin(radians))*arrow length
            // use a random number from 0 -> 360(inclusive) and convert to radians by multiplying by pi/180
        }
    }

//    public double getDotProduct(double x, double y, int corner){
//        return (x*Math.cos(direction))+(y*Math.sin(direction));
//
////        return ((xDist/squareSize)*Math.cos(direction))+((yDist/squareSize)*Math.sin(direction));
//    }
}
