import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Card {
    private String name;
    private int value;
    private String suit;
    private BufferedImage cardImage;
    private BufferedImage card;
    private int x;
    private int y;
    private int width = 32;
    private int height = 48;

    public Card(String name, int value, String suit, int x, int y){
        this.name = name;
        this.value = value;
        this.suit = suit;
        this.x = x;
        this.y = y;

        try{
            cardImage = ImageIO.read(new File("CS_Cards.png"));
        }catch (IOException e){
            System.out.println("could not handle card image.");
        }

        card = cardImage.getSubimage(x,y,width,height);
    }

    public void drawMe(Graphics g, int x, int y){
//        g.setColor(Color.WHITE);
//        g.fillRect(x, y, 120, 160);
//        g.setColor(Color.BLACK);
//        g.drawRect(x, y, 120, 160);
//
//        Font font = new Font("Arial", Font.PLAIN, 50);
//        g.setFont(font);
//        g.drawString(name, x+30, y+100);

        g.drawImage(card, x+2, y, 120, 180, null);
    }

    public int getValue(){
        return value;
    }
}


/*
1/8.333333333


 */






