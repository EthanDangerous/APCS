import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class CardGame {
    public ArrayList<Card> deck;
    public ArrayList<Card> discard;
    public ArrayList<Card> playersCard;
    public ArrayList<Card> playersCard2;
    public boolean viewingCard = false;
    public BufferedImage viewedCard;
    private BufferedImage rule1;
    private BufferedImage rule2;
    private Table table;
    public int currentPlayer = 1;
    public int rulesY = 0;
    public int rulePage = 1;
    private BufferedImage backImage;
    public boolean midSwitch = false;
    public boolean canDraw = false;


    public BufferedImage attack1;
    public BufferedImage attack2;
    public BufferedImage attack3;
    public BufferedImage attack4;
    public BufferedImage skip1;
    public BufferedImage skip2;
    public BufferedImage skip3;
    public BufferedImage skip4;
    public BufferedImage explodingkitten1;
    public BufferedImage explodingkitten2;
    public BufferedImage explodingkitten3;
    public BufferedImage explodingkitten4;
    public BufferedImage defuse1;
    public BufferedImage defuse2;
    public BufferedImage defuse3;
    public BufferedImage defuse4;
    public BufferedImage defuse5;
    public BufferedImage defuse6;
    public BufferedImage seethefuture1;
    public BufferedImage seethefuture2;
    public BufferedImage seethefuture3;
    public BufferedImage seethefuture4;
    public BufferedImage seethefuture5;
    public BufferedImage alterthefuture1;
    public BufferedImage alterthefuture2;
    public BufferedImage shuffle1;
    public BufferedImage shuffle2;
    public BufferedImage drawbottom1;
    public BufferedImage favor1;
    public BufferedImage favor2;
    public BufferedImage nope1;
    public BufferedImage nope2;
    public BufferedImage nope3;
    public BufferedImage nope4;
    public BufferedImage cat1;
    public BufferedImage cat2;
    public BufferedImage cat3;
    public BufferedImage cat4;
    public BufferedImage cat5;
    public BufferedImage cat6;
    public BufferedImage arrowKeys;
    public BufferedImage cover;

    public CardGame(Table table) {
        deck = new ArrayList<Card>();
        discard = new ArrayList<Card>();
        playersCard = new ArrayList<Card>();
        playersCard2 = new ArrayList<Card>();

        try {
            rule1 = ImageIO.read(new File("rules1.png"));
            rule2 = ImageIO.read(new File("rules2.png"));
            backImage = ImageIO.read(new File("cardback.png"));
            attack1 = ImageIO.read(new File("attack1.png"));
            attack2 = ImageIO.read(new File("attack2.png"));
            attack3 = ImageIO.read(new File("attack3.png"));
            attack4 = ImageIO.read(new File("attack4.png"));
            explodingkitten1 = ImageIO.read(new File("explodingkitten1.png"));
            explodingkitten2 = ImageIO.read(new File("explodingkitten2.png"));
            explodingkitten3 = ImageIO.read(new File("explodingkitten3.png"));
            explodingkitten4 = ImageIO.read(new File("explodingkitten4.png"));
            skip1 = ImageIO.read(new File("skip1.png"));
            skip2 = ImageIO.read(new File("skip2.png"));
            skip3 = ImageIO.read(new File("skip3.png"));
            skip4 = ImageIO.read(new File("skip4.png"));
            defuse1 = ImageIO.read(new File("defuse1.png"));
            defuse2 = ImageIO.read(new File("defuse2.png"));
            defuse3 = ImageIO.read(new File("defuse3.png"));
            defuse4 = ImageIO.read(new File("defuse4.png"));
            defuse5 = ImageIO.read(new File("defuse5.png"));
            defuse6 = ImageIO.read(new File("defuse6.png"));
            seethefuture1 = ImageIO.read(new File("seethefuture1.png"));
            seethefuture2 = ImageIO.read(new File("seethefuture2.png"));
            seethefuture3 = ImageIO.read(new File("seethefuture3.png"));
            seethefuture4 = ImageIO.read(new File("seethefuture4.png"));
            seethefuture5 = ImageIO.read(new File("seethefuture5.png"));
            alterthefuture1 = ImageIO.read(new File("alterthefuture1.png"));
            alterthefuture2 = ImageIO.read(new File("alterthefuture2.png"));
            shuffle1 = ImageIO.read(new File("shuffle1.png"));
            shuffle2 = ImageIO.read(new File("shuffle2.png"));
            drawbottom1 = ImageIO.read(new File("drawbottom1.jpg"));
            favor1 = ImageIO.read(new File("favor1.png"));
            favor2 = ImageIO.read(new File("favor2.png"));
            nope1 = ImageIO.read(new File("nope1.png"));
            nope2 = ImageIO.read(new File("nope2.png"));
            nope3 = ImageIO.read(new File("nope3.png"));
            nope4 = ImageIO.read(new File("nope4.png"));
            cat1 = ImageIO.read(new File("cat1.png"));
            cat2 = ImageIO.read(new File("cat2.png"));
            cat3 = ImageIO.read(new File("cat3.png"));
            cat4 = ImageIO.read(new File("cat4.png"));
            cat5 = ImageIO.read(new File("cat5.png"));
            cat6 = ImageIO.read(new File("cat6.png"));
            arrowKeys = ImageIO.read(new File("arrow keys.png"));
            cover = ImageIO.read(new File("start_cover.png"));
        } catch (IOException e) {}

        deck.add(new Card(8, "2", attack1, table, this, backImage));
        deck.add(new Card(8, "3", attack2, table, this, backImage));
        deck.add(new Card(8, "4", attack3, table, this, backImage));
        deck.add(new Card(8, "5", attack4, table, this, backImage));
        deck.add(new Card(10, "2", skip1, table, this, backImage));
        deck.add(new Card(10, "3", skip2, table, this, backImage));
        deck.add(new Card(10, "4", skip3, table, this, backImage));
        deck.add(new Card(10, "5", skip4, table, this, backImage));
        deck.add(new Card(99, "2", explodingkitten1, table, this, backImage));
        deck.add(new Card(1, "j", defuse1, table, this, backImage));
        playersCard.add(new Card(1, "j", defuse2, table, this, backImage));
        playersCard2.add(new Card(1, "j", defuse3, table, this, backImage));
        deck.add(new Card(13, "2", seethefuture1, table, this, backImage));
        deck.add(new Card(13, "3", seethefuture2, table, this, backImage));
        deck.add(new Card(13, "4", seethefuture3, table, this, backImage));
        deck.add(new Card(14, "2", alterthefuture1, table, this, backImage));
        deck.add(new Card(14, "3", alterthefuture2, table, this, backImage));
        deck.add(new Card(11, "2", shuffle1, table, this, backImage));
        deck.add(new Card(11, "3", shuffle2, table, this, backImage));
        deck.add(new Card(15, "3", drawbottom1, table, this, backImage));
        deck.add(new Card(15, "3", drawbottom1, table, this, backImage));
        deck.add(new Card(15, "3", drawbottom1, table, this, backImage));
        deck.add(new Card(9, "3", favor1, table, this, backImage));
        deck.add(new Card(9, "3", favor2, table, this, backImage));
        deck.add(new Card(12, "2", nope1, table, this, backImage));
        deck.add(new Card(12, "3", nope2, table, this, backImage));
        deck.add(new Card(12, "4", nope3, table, this, backImage));
        deck.add(new Card(12, "5", nope4, table, this, backImage));
        deck.add(new Card(2, "cat1", cat1, table, this, backImage));
        deck.add(new Card(2, "cat1", cat1, table, this, backImage));
        deck.add(new Card(2, "cat1", cat1, table, this, backImage));
        deck.add(new Card(3, "cat2", cat2, table, this, backImage));
        deck.add(new Card(3, "cat2", cat2, table, this, backImage));
        deck.add(new Card(3, "cat2", cat2, table, this, backImage));
        deck.add(new Card(4, "cat3", cat3, table, this, backImage));
        deck.add(new Card(4, "cat3", cat3, table, this, backImage));
        deck.add(new Card(4, "cat3", cat3, table, this, backImage));
        deck.add(new Card(5, "cat4", cat4, table, this, backImage));
        deck.add(new Card(5, "cat4", cat4, table, this, backImage));
        deck.add(new Card(5, "cat4", cat4, table, this, backImage));
        deck.add(new Card(6, "cat5", cat5, table, this, backImage));
        deck.add(new Card(6, "cat5", cat5, table, this, backImage));
        deck.add(new Card(6, "cat5", cat5, table, this, backImage));
        deck.add(new Card(7, "cat6", cat6, table, this, backImage));
        deck.add(new Card(7, "cat6", cat6, table, this, backImage));

        //shuffle
        shuffle();

        //add 2 cards to the player from deck
        for (int i = 0; i < 7; i++) {
            BufferedImage card1 = deck.get(0).getCategoryImage();
            BufferedImage card2 = deck.get(1).getCategoryImage();
            while(card1 == explodingkitten1 || card1 == explodingkitten2 || card1 == explodingkitten3 || card1 == explodingkitten4){
                shuffle();
                card1 = deck.get(0).getCategoryImage();
            }
            while(card2 == explodingkitten1 || card2 == explodingkitten2 || card2 == explodingkitten3 || card2 == explodingkitten4){
                shuffle();
                card2 = deck.get(1).getCategoryImage();
            }
            playersCard.add(deck.remove(0));
            playersCard2.add(deck.remove(0));
            shuffle();
        }

        sort(1);

        this.table = table;
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public ArrayList<Card> getDiscard(){
        return discard;
    }

    public void drawGame(Graphics g) {

        g.setColor(Color.gray);
        g.fillRect(0, 0, 1000, 600);
        Font font = new Font("Arial", Font.PLAIN, 25);
        //1920/1080 max screen size

        if(table.viewingRules){
            if(rulePage == 1){
                g.drawImage(rule1, 0, rulesY, 1000, 1500, null); //10x15
            }else if(rulePage == 2){
                g.drawImage(rule2, 0, rulesY, 1000, 1500, null);
            }
//            table.getCard.setVisible(false);
            table.playerSwitch.setVisible(false);
            table.playHand.setVisible(false);
            table.rulesButton.setVisible(false);
            for (int j = 0; j < playersCard.size(); j++) {
                playersCard.get(j).buttonEnabled(false);
                playersCard.get(j).viewButton.setVisible(false);
            }
            for (int j = 0; j < playersCard2.size(); j++) {
                playersCard2.get(j).buttonEnabled(false);
                playersCard2.get(j).viewButton.setVisible(false);
            }
            g.setColor(Color.BLACK);
            g.fillRect(934, 559, 47, 32);
            g.drawImage(arrowKeys, 935, 560, 45, 30, null);
        }else{
            int gap = 0;
            //draw player's card
            if(currentPlayer == 1){
                gap = (int) ((120*playersCard.size()-780)/(playersCard.size()+1));
                if(playersCard.size() <= 10 && playersCard.size() > 0){
                    gap -= 4/playersCard.size();
                }else if(playersCard.size() == 0){
                    gap = 120;
                }
                gap = 120 - gap;
            }else if(currentPlayer == 2){
                gap = (int) ((120*playersCard2.size()-780)/(playersCard2.size()+1));
                if(playersCard.size() <= 10 && playersCard2.size() > 0){
                    gap -= 4/playersCard2.size();
                }else if(playersCard2.size() == 0){
                    gap = 120;
                }
                gap = 120 - gap;
            }
            int x = 0;
            int x2 = 0;
            if(playersCard.size() >=2){
                x = 780 / (playersCard.size() - 1);
            }else{
                x = 500;
            }
            if(playersCard2.size() >=2){
                x2 = 780 / (playersCard2.size() - 1);
            }else{
                x2 = 500;
            }
            int y = 400;
            if(currentPlayer == 1 && midSwitch){
                if(x == 500 && x2 == 500){
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, x, y, true, gap);
                    }
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, x2, y-350, true, gap);
                    }
                }else if(x == 500){
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, x, y, true, gap);
                    }
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, (i * x2) + 110, y-350, true, gap);
                    }
                }else if(x2 == 500){
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, (i * x) + 110, y, true, gap);
                    }
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, x2, y-350, true, gap);
                    }
                }else{
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, (i * x) + 110, y, true, gap);
                    }
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, (i * x2) + 110, y-350, true, gap);
                    }
                }
            }else if(currentPlayer == 2 && midSwitch){
                if(x == 500 && x2 == 500){
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, x2, y, true, gap);
                    }
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, x, y-350, true, gap);
                    }
                }else if(x == 500){
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, (i * x2) + 110, y, true, gap);
                    }
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, x, y-350, true, gap);
                    }
                }else if(x2 == 500){
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, x2, y, true, gap);
                    }
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, (i * x) + 110, y-350, true, gap);
                    }
                }else{
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, (i * x2) + 110, y, true, gap);
                    }
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, (i * x) + 110, y-350, true, gap);
                    }
                }
            }else if(currentPlayer == 1){
                if(x == 500 && x2 == 500){
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, x, y, false, gap);
                    }
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, x2, y-350, true, gap);
                    }
                }else if(x == 500){
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, x, y, false, gap);
                    }
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, (i * x2) + 110, y-350, true, gap);
                    }
                }else if(x2 == 500){
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, (i * x) + 110, y, false, gap);
                    }
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, x2, y-350, true, gap);
                    }
                }else{
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, (i * x) + 110, y, false, gap);
                    }
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, (i * x2) + 110, y-350, true, gap);
                    }
                }
            }else if(currentPlayer == 2){
                if(x == 500 && x2 == 500){
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, x2, y, false, gap);
                    }
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, x, y-350, true, gap);
                    }
                }else if(x == 500){
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, (i * x2) + 110, y, false, gap);
                    }
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, x, y-350, true, gap);
                    }
                }else if(x2 == 500){
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, x2, y, false, gap);
                    }
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, (i * x) + 110, y-350, true, gap);
                    }
                }else{
                    for (int i = 0; i < playersCard2.size(); i++) {
                        playersCard2.get(i).drawMe(g, (i * x2) + 110, y, false, gap);
                    }
                    for (int i = 0; i < playersCard.size(); i++) {
                        playersCard.get(i).drawMe(g, (i * x) + 110, y-350, true, gap);
                    }
                }
            }

            g.setColor(Color.BLACK);
            if(deck.size()>5){
                int deckX = 700;
                for(int i = 0; i<5; i++){
                    g.fillRect(deckX + 120, 215, 1, 150);
                    g.drawImage(backImage, deckX, 215, 120, 150, null);
                    deckX -= 10;
                }
            }else{
                int deckX = 700;
                for(int i = 0; i<deck.size(); i++){
                    g.fillRect(deckX + 120, 215, 1, 150);
                    g.drawImage(backImage, deckX, 215, 120, 150, null);
                    deckX -= 10;
                }
            }

            if(discard.size()>5){
                int discardX = 200;
                for(int i = discard.size()-5; i<discard.size(); i++){
                    g.fillRect(discardX + 120, 215, 1, 150);
                    g.drawImage(discard.get(i).getCategoryImage(), discardX, 215, 120, 150, null);
                    discardX -= 40;
                }
                g.setFont(font);
                g.drawString("+" + (discard.size()-5), 330, 365);
            }else{
                int discardX = 200;
                for(int i = 0; i<discard.size(); i++){
                    g.fillRect(discardX + 120, 215, 1, 150);
                    g.drawImage(discard.get(i).getCategoryImage(), discardX, 215, 120, 150, null);
                    discardX -= 40;
                }
            }

            if(currentPlayer == 1){
                for (int i = 0; i < playersCard.size(); i++) {
                    if (playersCard.get(i).isViewing()) {
                        viewingCard = true;
                        g.drawImage(playersCard.get(i).getCategoryImage(), 260, 0, 480, 600, null);
                        table.closeButton.setVisible(true);
//                        table.getCard.setVisible(false);
                        table.playerSwitch.setVisible(false);
                        table.playHand.setVisible(false);
                        table.rulesButton.setVisible(false);
                        for (int j = 0; j < playersCard.size(); j++) {
                            playersCard.get(j).buttonEnabled(false);
                            playersCard.get(j).viewButton.setVisible(false);
//                        table.endTurn.setVisible(false);
                        }
                    } else if (!playersCard.get(i).isViewing() && !viewingCard) {
//                viewingCard = false;
                        for (int j = 0; j < playersCard.size(); j++) {
                            playersCard.get(j).buttonEnabled(true);
//                    playersCard.get(j).viewButton.setVisible(false);
                        }
                    }
                }
            }else if (currentPlayer == 2){
                for (int i = 0; i < playersCard2.size(); i++) {
                    if (playersCard2.get(i).isViewing()) {
                        viewingCard = true;
                        g.drawImage(playersCard2.get(i).getCategoryImage(), 260, 0, 480, 600, null);
                        table.closeButton.setVisible(true);
                        for (int j = 0; j < playersCard2.size(); j++) {
                            playersCard2.get(j).buttonEnabled(false);
                            playersCard2.get(j).viewButton.setVisible(false);
//                            table.getCard.setVisible(false);
                            table.playerSwitch.setVisible(false);
                            table.playHand.setVisible(false);
                            table.rulesButton.setVisible(false);
//                        table.endTurn.setVisible(false);
                        }
                    } else if (!playersCard2.get(i).isViewing() && !viewingCard) {
//                viewingCard = false;
                        for (int j = 0; j < playersCard2.size(); j++) {
                            playersCard2.get(j).buttonEnabled(true);
//                    playersCard.get(j).viewButton.setVisible(false);
                        }
                    }
                }
            }
        }
        if(viewingCard && table.seeTheFuture){
            g.drawImage(deck.get(0).getCategoryImage(), 0, 92, 333, 416, null);
            g.drawImage(deck.get(1).getCategoryImage(), 333, 92, 333, 416, null);
            g.drawImage(deck.get(2).getCategoryImage(), 666, 92, 333, 416, null);
            if(currentPlayer == 1){
                for (int j = 0; j < playersCard.size(); j++) {
                    playersCard.get(j).buttonEnabled(false);
                    playersCard.get(j).viewButton.setVisible(false);
//                            table.getCard.setVisible(false);
                    table.playerSwitch.setVisible(false);
                    table.playHand.setVisible(false);
                    table.rulesButton.setVisible(false);
//                        table.endTurn.setVisible(false);
                }
            }else if(currentPlayer == 2){
                for (int j = 0; j < playersCard2.size(); j++) {
                    playersCard2.get(j).buttonEnabled(false);
                    playersCard2.get(j).viewButton.setVisible(false);
//                            table.getCard.setVisible(false);
                    table.playerSwitch.setVisible(false);
                    table.playHand.setVisible(false);
                    table.rulesButton.setVisible(false);
//                        table.endTurn.setVisible(false);
                }
            }
            table.closeButton.setBounds(960, 0, 40, 40); //x,y,width,height
            table.closeButton.setVisible(true);
        }

        if(deck.size() <= 3){
            while(discard.size() > 5){
                deck.add(discard.remove(discard.size()-1));
            }
        }

        g.setFont(font);
        if(table.currentScreen == 0){
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1000, 600);
            g.drawImage(cover, 65, 0, 870, 600, null);
            if(currentPlayer == 1){
                for (int j = 0; j < playersCard.size(); j++) {
                    if(playersCard.get(j).getSelected()){
                        playersCard.get(j).highlight();
                    }
                    playersCard.get(j).buttonEnabled(false);
                    playersCard.get(j).viewButton.setVisible(false);
                    table.playerSwitch.setVisible(false);
                    table.playHand.setVisible(false);
                    table.rulesButton.setVisible(false);
                }
            }else if(currentPlayer == 2){
                for (int j = 0; j < playersCard2.size(); j++) {
                    if(playersCard2.get(j).getSelected()){
                        playersCard2.get(j).highlight();
                    }
                    playersCard2.get(j).buttonEnabled(false);
                    playersCard2.get(j).viewButton.setVisible(false);
                    table.playerSwitch.setVisible(false);
                    table.playHand.setVisible(false);
                    table.rulesButton.setVisible(false);
                }
            }
            table.newGame.setVisible(true);
            table.newGame.setBounds(400, 300, 200, 50);
        }else if(table.currentScreen == 2){
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1000, 600);
            g.setColor(Color.BLACK);
            g.drawString("Player " + currentPlayer + " Wins!!!", 410, 250);
            if(currentPlayer == 1){
                for (int j = 0; j < playersCard.size(); j++) {
                    if(playersCard.get(j).getSelected()){
                        playersCard.get(j).highlight();
                    }
                    playersCard.get(j).buttonEnabled(false);
                    playersCard.get(j).viewButton.setVisible(false);
                    table.playerSwitch.setVisible(false);
                    table.playHand.setVisible(false);
                    table.rulesButton.setVisible(false);
                }
            }else if(currentPlayer == 2){
                for (int j = 0; j < playersCard2.size(); j++) {
                    if(playersCard2.get(j).getSelected()){
                        playersCard2.get(j).highlight();
                    }
                    playersCard2.get(j).buttonEnabled(false);
                    playersCard2.get(j).viewButton.setVisible(false);
                    table.playerSwitch.setVisible(false);
                    table.playHand.setVisible(false);
                    table.rulesButton.setVisible(false);
                }
            }
            table.startTurn.setVisible(false);
            table.newGame.setVisible(true);
            table.newGame.setBounds(400, 300, 200, 50);
        }else if(table.currentScreen == 1){
            if(!viewingCard && !table.viewingRules){
                table.playerSwitch.setVisible(true);
                table.playHand.setVisible(true);
                table.rulesButton.setVisible(true);
            }
            if(currentPlayer == 1 && !viewingCard && !table.viewingRules){
                g.setColor(Color.BLACK);
                g.drawString("Player 1", 10, 25);
                g.drawString("" + deck.size(), 825, 365);
            }else if(currentPlayer == 2 && !viewingCard && !table.viewingRules){
                g.setColor(Color.BLACK);
                g.drawString("Player 2", 10, 25);
                g.drawString("" + deck.size(), 825, 365);
            }
            table.newGame.setVisible(false);
        }
        if(!viewingCard && !table.viewingRules && table.currentScreen == 1){
            g.setColor(Color.BLACK);
            g.drawString("Turns remaining: " + (table.attacks + 1), 10, 25);
        }
    }

    public void addCardButton(Table table) {
        if(currentPlayer == 1){
            for (int i = 0; i < playersCard.size(); i++) {
                table.add(playersCard.get(i).getButton());
            }
        }else if(currentPlayer == 2){
            for (int i = 0; i < playersCard2.size(); i++) {
                table.add(playersCard2.get(i).getButton());
            }
        }

    }

    public void getCard() {
        if(deck.size()>0){
            if(currentPlayer == 1){
                playersCard.add(deck.remove(0));
            }else if(currentPlayer == 2){
                playersCard2.add(deck.remove(0));
            }
        }else{
//            table.getCard.setEnabled(false);
        }
    }

    public void getCard(boolean bottom) {
        if(deck.size()>0 && table.drawFromTheBottom){
            if(currentPlayer == 1){
                playersCard.add(deck.remove(deck.size()-1));
            }else if(currentPlayer == 2){
                playersCard2.add(deck.remove(deck.size()-1));
            }
            table.drawFromTheBottom = false;
        }else{
            table.drawFromTheBottom = false;
//            table.getCard.setEnabled(false);
        }
    }

    public int currentPlayerCards(){
        if(currentPlayer == 1){
            return playersCard.size();
        }else if(currentPlayer == 2){
            return playersCard2.size();
        }
        return -1;
    }

    public void shuffle() {
        //write code to shuffle your deck
        for (int i = 0; i < deck.size(); i++) {
            Card save = deck.get(i);
            int rand = (int) (Math.random() * deck.size());
            deck.set(i, deck.get(rand));
            deck.set(rand, save);
        }
    }

    public void shuffle(int currentPlayer) {
        if(currentPlayer == 1){
            for (int i = 0; i < playersCard.size(); i++) {
                Card save = playersCard.get(i);
                int rand = (int) (Math.random() * playersCard.size());
                playersCard.set(i, playersCard.get(rand));
                playersCard.set(rand, save);
            }
        }else if (currentPlayer == 2){
            for (int i = 0; i < playersCard2.size(); i++) {
                Card save = playersCard2.get(i);
                int rand = (int) (Math.random() * playersCard2.size());
                playersCard2.set(i, playersCard2.get(rand));
                playersCard2.set(rand, save);
            }
        }
    }

    public void sort(int currentPlayer){
        if(currentPlayer == 1){
            for (int i=0; i < playersCard.size()-1; i++){
                int minIndex = i;

                for (int j=i+1; j < playersCard.size(); j++){
                    if (playersCard.get(j).getValue() < playersCard.get(minIndex).getValue()){
                        minIndex = j;
                    }
                }

                if( minIndex != i){
                    Card temp = playersCard.get(i);
                    playersCard.set(i, playersCard.get(minIndex));
                    playersCard.set(minIndex, temp);
                }
            }
        }else if (currentPlayer == 2){
            for (int i=0; i < playersCard2.size()-1; i++){
                int minIndex = i;

                for (int j=i+1; j < playersCard2.size(); j++){
                    if (playersCard2.get(j).getValue() < playersCard2.get(minIndex).getValue()){
                        minIndex = j;
                    }
                }

                if( minIndex != i){
                    Card temp = playersCard2.get(i);
                    playersCard2.set(i, playersCard2.get(minIndex));
                    playersCard2.set(minIndex, temp);
                }
            }
        }
    }

    public void selectCard(int xInput, int yInput) {
        //check loc
//        int x = 20;
        int xTot = 500;
        int xTot2 = 500;
        if(playersCard.size() >=2){
            xTot = 780 / (playersCard.size() - 1);
        }else{
            xTot = 500;
        }
        if(playersCard2.size() >=2){
            xTot2 = 780 / (playersCard2.size() - 1);
        }else{
            xTot2 = 500;
        }
        int y = 400;
        if(currentPlayer == 1 && !midSwitch){
            for (int i = 0; i < playersCard.size(); i++) {
                if(playersCard.get(i).getSelected()){
                    y = 370;
                }else{
                    y = 400;
                }
                int gap = 120 - playersCard.get(0).buttonWidth;
//            System.out.println(gap);
                int x = (i * xTot + 50);
                if (xTot == 500) {
                    x = 440;
                }
                if(i == playersCard.size()-1){
                    if (xInput >= x && xInput <= x + 120 && yInput >= y && yInput <= y + 150) {
//                        System.out.println(playersCard.get(i).toString());
                        playersCard.get(i).highlight();
                    }
                }else{
                    if (xInput >= x && xInput <= x + 120 - gap && yInput >= y && yInput <= y + 150) {
//                        System.out.println(playersCard.get(i).toString());
                        playersCard.get(i).highlight();
                    }
                }

            }
        }else if(currentPlayer == 2 && !midSwitch){
            for (int i = 0; i < playersCard2.size(); i++) {
                if(playersCard2.get(i).getSelected()){
                    y = 370;
                }else{
                    y = 400;
                }
                int gap = 120 - playersCard2.get(0).buttonWidth;
//            System.out.println(gap);
                int x = (i * xTot2 + 50);
                if (xTot2 == 500) {
                    x = 440;
                }
                if(i == playersCard2.size()-1){
                    if (xInput >= x && xInput <= x + 120 && yInput >= y && yInput <= y + 150) {
//                        System.out.println(playersCard2.get(i).toString());
                        playersCard2.get(i).highlight();
                    }
                }else{
                    if (xInput >= x && xInput <= x + 120 - gap && yInput >= y && yInput <= y + 150) {
//                        System.out.println(playersCard2.get(i).toString());
                        playersCard2.get(i).highlight();
                    }
                }
            }
        }
    }
}

/*
add keybinds for actions

shuffle hidden cards
sort visible cards
 */