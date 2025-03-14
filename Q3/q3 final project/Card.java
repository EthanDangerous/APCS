import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Card implements ActionListener {

    private int value;
    private String type;
    private String category;
    private BufferedImage categoryImage;
    private BufferedImage backImage;
    public JButton viewButton;
    private Table table;
    private CardGame game;
    public int x;
    private int y;
    public int buttonWidth;
    public boolean viewingCard = false;

    public int selectY = 0;
    public boolean isSelected = false;

    public Card(int value, String type, BufferedImage image, Table table, CardGame game, BufferedImage backImage) {
        this.value = value;
        this.type = type;
        this.category = category;
        this.table = table;
        this.game = game;
        this.categoryImage = image;
        this.backImage = backImage;
        if(type.equals("3") && image == null){
            System.out.println(value);
        }
        viewButton = new JButton("View");
        viewButton.setBounds(x - 50, y + 160, 100, 30); //x,y,width,height
        viewButton.addActionListener(this);
        viewButton.setVisible(false);
    }

    public JButton getButton() {
        return viewButton;
    }

    public boolean isViewing() {
        return viewingCard;
    }

    public BufferedImage getCategoryImage() {
        return categoryImage;
    }


    /*
     9 exploding kittens
     3 defuses
     2 favors
     4 nopes
     4 attacks
     2 feral cats
     4 skips
     3 see the futures
     2 alter the futures
     2 shuffles
     3 draw from the bottoms
     15 cat cards (3 of each cat card type)

     card category
     card type
    */

    /*
    opportunity to play as many cards as you wish
    turn ends with drawing a card from the top of the deck
    end turn viewButton
     */

    /*
    ability to see the
     */

    public int getValue() {
        return this.value;
    }

    public void drawMe(Graphics g, int x, int y, boolean back, int buttonWidth) {
        y -= selectY;
        this.x = x;
        this.buttonWidth = buttonWidth + 10;
        if(game.currentPlayerCards() >= 10){
            this.buttonWidth -= game.currentPlayerCards()/3;
            this.buttonWidth -= 2;
        }
        if(buttonWidth > 120){
            this.buttonWidth = 120;
        }
        this.y = y;
        viewButton.setBounds(x-60, y + 160, this.buttonWidth, 30); //x,y,width,height
        //draw card outline
//        g.setColor(Color.white);
//        g.fillRect(x,y,120,150);
//        g.setColor(Color.black);
//        g.drawRect(x,y,120,150);
        //draw suit
        if(back){
            g.drawImage(backImage, x - 60, y, 120, 150, null);
        }else{
            g.drawImage(categoryImage, x - 60, y, 120, 150, null);
        }
        //Set Font to use with drawString
        Font font = new Font("Arial", Font.PLAIN, 50);
        g.setFont(font);
//        if( this.category.equals("hearts") ){
//            g.setColor(Color.red);
//        }
//        g.drawString(this.category+"", x+30, y + 100);
    }

    public String toString() {
        return type + " of " + category + ":" + value + " points";
    }

    public void highlight() {
        if (!viewingCard && !game.viewingCard) {
            if (!isSelected) {
                selectY = 30;
                viewButton.setVisible(true);
                isSelected = true;
            } else {
                selectY = 0;
                viewButton.setVisible(false);
                isSelected = false;
            }
        }
        table.repaint();
    }

    public boolean getSelected() {
        return isSelected;
    }

    public void buttonEnabled(boolean val) {
        if (val) {
            viewButton.setEnabled(true);
        } else {
            viewButton.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewButton) {
            //add a card to the playersDeck
//            cardGame.getCard();
            System.out.println(value);
            //remove the top from the deck
            //call repaint to update the paintComponent
            table.closeButton.setBounds(660, 30, 40, 40); //x,y,width,height
            if (!viewingCard) {
                viewingCard = true;
//                table.getCard.setEnabled(false);
            }
            table.requestFocus();
            table.setFocusable(true);
            table.repaint();
        }
    }

}