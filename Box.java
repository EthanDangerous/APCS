import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Box extends Sprite {
    public int size;
    public int x;
    public int y;
    public int offsetX;
    public int offsetY;
    public int i;
    public int j;
//    public Color boxColor = new Color(230, 255, 255);
    private String ownedBy;
    private Color ownerColor;
    ArrayList<Color> sides = new ArrayList<Color>();
    // for this array list, 1 = up, 2 = right, 3 = down, 4 = left
    private boolean filled = false;
    private boolean filling = false;
    private Screen sc;

    public Box(int size, int i , int j, Screen sc){
        this.size = size;
        this.i = i;
        this.j = j;
        sides.add(null);
        sides.add(null);
        sides.add(null);
        sides.add(null);
        this.sc = sc;
    }

    @Override
    public void drawMe(Graphics g, int x, int y, int offsetX, int offsetY){
        g.setColor(color);
        int xCoord = offsetX + x*size;
        int yCoord = offsetY + y*size;
        g.fillRect(xCoord, yCoord, size, size);
        int lineSize = size/20;
        while(Screen.x <= 125 && filling && !filled){
            color = new Color(ownerColor.getRed(), ownerColor.getGreen(), ownerColor.getBlue(), Screen.x);
            if(Screen.x >= 125){
                filled = true;
            }
            break;
        }
        if(sides.get(0) != null){
            g.setColor(sides.get(0));
            g.fillRect(xCoord, yCoord-lineSize, size, lineSize*2);
        }
        if(sides.get(1) != null){
            g.setColor(sides.get(1));
            g.fillRect(xCoord+size-lineSize, yCoord, lineSize*2, size);
        }
        if(sides.get(2) != null){
            g.setColor(sides.get(2));
            g.fillRect(xCoord, yCoord+size-lineSize, size, lineSize*2);
        }
        if(sides.get(3) != null){
            g.setColor(sides.get(3));
            g.fillRect(xCoord-lineSize, yCoord, lineSize*2, size);
        }
        if(ownerColor != null){
            Font font = new Font("Bold", Font.BOLD, size/2);
            g.setFont(font);
            g.setColor(ownerColor);
            g.drawString(ownedBy, xCoord+(3*size)/16, yCoord+(11*size)/16);
        }
    }

    // the return value is whether or not a box was just filled (but reversed)
    public boolean addLine(int dir, Color c){
        if(sides.get(dir) != null){
            return true;
        }else{
            sides.set(dir, c);
            return checkFull(c, dir);
        }
    }

    public String getOwner(){
        return ownedBy;
    }

    public boolean checkFull(Color c, int dir){
        if(sides.get(0) != null && sides.get(1) != null && sides.get(2) != null && sides.get(3) != null){
            color = new Color(c.getRed(), c.getGreen(), c.getBlue(), 125);
            ownedBy = GameScreen.getTurnInitial();
            ownerColor = c;
            sc.fill();
            //start animation here
            if(Screen.x > 125){
                Screen.x = 0;
            }
            filling = true;
//            System.out.println("Screen anim " + Screen.x);

            return true;
        }
        return false;
    }

    public boolean checkFull(){
        if(sides.get(0) != null && sides.get(1) != null && sides.get(2) != null && sides.get(3) != null){
            return true;
        }
        return false;
    }
}
