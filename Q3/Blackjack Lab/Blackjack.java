import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Blackjack  {

    private Card[] deck;
    private int playerCards;

    private boolean bustSound = true;
    private boolean blackjackSound = true;
    private boolean lossSound = true;

    public Blackjack() {

        playerCards = 2;
        deck = new Card[52];

        deck[0] = new Card("2", 2, "hearts", 0, 96);
        deck[1] = new Card("3", 3, "hearts", 0, 144);
        deck[2] = new Card("4", 4, "hearts", 0, 192);
        deck[3] = new Card("5", 5, "hearts", 0, 240);
        deck[4] = new Card("6", 6, "hearts", 0, 288);
        deck[5] = new Card("7", 7, "hearts", 128, 0);
        deck[6] = new Card("8", 8, "hearts", 128, 48);
        deck[7] = new Card("9", 9, "hearts", 128, 96);
        deck[8] = new Card("10", 10, "hearts", 128, 144);
        deck[9] = new Card("Jack", 10, "hearts", 128, 192);
        deck[10] = new Card("Queen", 10, "hearts", 128, 240);
        deck[11] = new Card("King", 10, "hearts", 128, 288);
        deck[12] = new Card("Ace", 11, "hearts", 0, 48);

        deck[13] = new Card("2", 2, "diamonds", 32, 96);
        deck[14] = new Card("3", 3, "diamonds", 32, 144);
        deck[15] = new Card("4", 4, "diamonds", 32, 192);
        deck[16] = new Card("5", 5, "diamonds", 32, 240);
        deck[17] = new Card("6", 6, "diamonds", 32, 288);
        deck[18] = new Card("7", 7, "diamonds", 160, 0);
        deck[19] = new Card("8", 8, "diamonds", 160, 48);
        deck[20] = new Card("9", 9, "diamonds", 160, 96);
        deck[21] = new Card("10", 10, "diamonds", 160, 144);
        deck[22] = new Card("Jack", 10, "diamonds", 160, 192);
        deck[23] = new Card("Queen", 10, "diamonds", 160, 240);
        deck[24] = new Card("King", 10, "diamonds", 160, 288);
        deck[25] = new Card("Ace", 11, "diamonds", 32, 48);

        deck[26] = new Card("2", 2, "clubs", 64, 96);
        deck[27] = new Card("3", 3, "clubs", 64, 144);
        deck[28] = new Card("4", 4, "clubs", 64, 192);
        deck[29] = new Card("5", 5, "clubs", 64, 240);
        deck[30] = new Card("6", 6, "clubs", 64, 288);
        deck[31] = new Card("7", 7, "clubs", 192, 0);
        deck[32] = new Card("8", 8, "clubs", 192, 48);
        deck[33] = new Card("9", 9, "clubs", 192, 96);
        deck[34] = new Card("10", 10, "clubs", 192, 144);
        deck[35] = new Card("Jack", 10, "clubs", 192, 192);
        deck[36] = new Card("Queen", 10, "clubs", 192, 240);
        deck[37] = new Card("King", 10, "clubs", 192, 288);
        deck[38] = new Card("Ace", 11, "clubs", 64, 48);

        deck[39] = new Card("2", 2, "spades", 96, 96);
        deck[40] = new Card("3", 3, "spades", 96, 144);
        deck[41] = new Card("4", 4, "spades", 96, 192);
        deck[42] = new Card("5", 5, "spades", 96, 240);
        deck[43] = new Card("6", 6, "spades", 96, 288);
        deck[44] = new Card("7", 7, "spades", 224, 0);
        deck[45] = new Card("8", 8, "spades", 224, 48);
        deck[46] = new Card("9", 9, "spades", 224, 96);
        deck[47] = new Card("10", 10, "spades", 224, 144);
        deck[48] = new Card("Jack", 10, "spades", 224, 192);
        deck[49] = new Card("Queen", 10, "spades", 224, 240);
        deck[50] = new Card("King", 10, "spades", 224, 288);
        deck[51] = new Card("Ace", 11, "spades", 96, 48);

        try {
            URL url = this.getClass().getClassLoader().getResource("opengame-reset.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }

        shuffle();
    }
       
    public void drawGame(Graphics g, int p, boolean canStand){
        int x = 20;
        int y = 200;
        int width = 1000;
        for(int i = 0; i<playerCards; i++){
            if(playerCards == 2){
                x = 360;
                if(i == 1){
                    x=520;
                }
                deck[i].drawMe(g, x, y);
            }
            if(playerCards == 3){
                x = 280;
                if(i == 1){
                    x=440;
                }else if(i == 2){
                    x=600;
                }
                deck[i].drawMe(g, x, y);
            }
            if(playerCards == 4){
                x=200;
                if(i == 1){
                    x = 360;
                }
                if(i == 2){
                    x=520;
                }
                if(i == 3){
                    x=680;
                }
                deck[i].drawMe(g, x, y);
            }
            if(playerCards == 5){
                x = 140;
                if(i == 1){
                    x=280;
                }else if(i == 2){
                    x=440;
                }else if(i == 3){
                    x=600;
                }else if(i == 4){
                    x=740;
                }
                deck[i].drawMe(g, x, y);
            }
            if (playerCards > 5) {
                deck[i].drawMe(g, x, y);
                x += 140;
            }
        }
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.PLAIN, 20);
        Font fontBold = new Font("Arial", Font.BOLD, 20);
        Font fontBig = new Font("Arial", Font.PLAIN, 75);
        g.setFont(fontBold);
        g.drawString("Total value: " + getTotalVal(), 825, 25);
        g.setFont(font);
        g.drawString("21      -> 5 points", 825, 50);
        g.drawString("20      -> 3 points", 825, 75);
        g.drawString("19/18 -> 2 points", 825, 100);
        g.drawString("17/16 -> 1 point", 825, 125);
        g.drawString("New hand -> -1 point", 787, 150);
        if(getTotalVal() == 21){
            g.setFont(fontBig);
            g.drawString("BLACKJACK!", 10, 150);
            if(blackjackSound){
                try {
                    URL url = this.getClass().getClassLoader().getResource("blackjack.wav");
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(url));
                    clip.start();
                } catch (Exception exc) {
                    exc.printStackTrace(System.out);
                }
                blackjackSound = false;
            }
        }
        if(getTotalVal()>21){
            g.setFont(fontBig);
            if(bustSound){
                if(p == 0){
                    try {
                        URL url = this.getClass().getClassLoader().getResource("loss.wav");
                        Clip clip = AudioSystem.getClip();
                        clip.open(AudioSystem.getAudioInputStream(url));
                        clip.start();
                    } catch (Exception exc) {
                        exc.printStackTrace(System.out);
                    }
                }else{
                    try {
                        URL url = this.getClass().getClassLoader().getResource("bust.wav");
                        Clip clip = AudioSystem.getClip();
                        clip.open(AudioSystem.getAudioInputStream(url));
                        clip.start();
                    } catch (Exception exc) {
                        exc.printStackTrace(System.out);
                    }
                }
                bustSound = false;
            }
            if (p == 0) {
                g.drawString("YOU LOSE!", 10, 150);
            }else{
                g.drawString("BUST!", 10, 150);
            }
        }
    }

    public void hit(){
        if(getTotalVal()<21){
            playerCards++;
            try {
                URL url = this.getClass().getClassLoader().getResource("hit.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(url));
                clip.start();
            } catch (Exception exc) {
                exc.printStackTrace(System.out);
            }
        }
    }

    public int getTotalVal(){
        int total = 0;
        for(int i = 0; i<playerCards; i++){
            total = total + deck[i].getValue();
        }
        return total;
    }

    public void shuffle(){
        for(int i = 0; i<deck.length; i++){
            int randPos = (int) (Math.random() * deck.length);
            Card saveCard = deck[i];
            deck[i] = deck[randPos];
            deck[randPos] = saveCard;
        }
    }
}