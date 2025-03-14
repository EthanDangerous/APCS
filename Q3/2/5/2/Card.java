import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Card {
    private int value;
    public Card(int num){
        this.value = num;
    }
    public int getValue(){
        return value;
    }
    public String toString(){
        return "value: " + value;
    }
    public void drawMe(Graphics g, int x, int y){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 100, 150);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 100, 150);
//        Font font = new Font("plain", PLAIN, 30);
//        g.setFont(font);
        g.drawString(toString(), x+30, y+75);
    }
}
