import java.awt.*;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SlotMachine{
    private Color black = new Color(0, 0, 0);
    private Color white = new Color(255, 255, 255);
    private Color green = new Color(0, 255, 0);
    private Color yellow = new Color(255, 255, 0);
    private Color red = new Color(255, 0, 0);
    private Color gold = new Color(255, 215, 0);

    public int points = 100;
    public int bet = 1;

    private int num1;
    private int num2;
    private int num3;

    int[] numRand = new int[3];


    public void drawMe(Graphics g){
        g.setColor(black);
        g.fillRect(450, 75, 300, 300);

        int[] xPoints = {325, 625, 750, 450};
        int[] yPoints = {200, 500, 375, 75};
        int nPoints = 4;
        g.fillPolygon(xPoints, yPoints, nPoints);

        g.setColor(white);
        g.fillRect(455, 80, 290, 290);

        int[] xPoints1 = {330, 620, 745, 455};
        int[] yPoints1 = {205, 495, 370, 80};
        int nPoints1 = 4;
        g.fillPolygon(xPoints1, yPoints1, nPoints1);

        g.setColor(black);
        g.fillRect(325, 200, 300, 300);

        int[] xPoints2 = {620, 625, 750, 745};
        int[] yPoints2 = {200, 205, 80, 75};
        int nPoints2 = 4;
        g.fillPolygon(xPoints2, yPoints2, nPoints2);

        g.setColor(white);
        g.fillRect(330, 205, 290, 290);

        g.setColor(black);
        Font font = new Font("Arial", Font.PLAIN, 100);
        g.setFont(font);
        g.drawString("Points:", 25, 125);
        g.drawString(points+"", 25, 250);
    }

    public void play(){
        points = points - bet;
        for(int i=0; i<numRand.length; i++){
            numRand[i] = (int) (Math.random() * 9 + 1);
//            numRand[i] = (int) (Math.random() + 7);
            //numRand[i] = (int) (Math.random() + 5);
        }
        num1 = numRand[0];
        num2 = numRand[1];
        num3 = numRand[2];
        if(num1 == 7 && num2 == 7 && num3 == 7){
            points = points + (bet * 100);
            playJackpot();
            //display win text and sound
        }else if(num1 == num2 && num2 == num3){
            points = points + (5 * bet);
            playWin();
            //display win text and sound
        }else if(num1 == num2 || num1 == num3 || num2 == num3){
            points = points + (2 * bet);
            playWin();
            //display win text and sound
        }else{
            playLose();
            //play loser sound
        }
    }
    public void showResult(Graphics g){
        Font font = new Font("Bold", Font.BOLD, 100); 
        if(num1 == 7 && num2 == 7 && num3 == 7){
            g.setColor(gold);
        }else if(num1 == num2 && num2 == num3){
            g.setColor(green);
        }else if(num1 == num2 || num1 == num3 || num2 == num3){
            g.setColor(yellow);
        }else{
            g.setColor(red);
        }
        g.setFont(font);
        g.drawString(num1 + " " + num2 + " " + num3, 360, 350);
    }

    public void reset(){
        points = 100;
        bet = 1;
        num1 = 0;
        num2 = 0;
        num3 = 0;
    }
    public void playGambling() {

        try {
            URL url = this.getClass().getClassLoader().getResource("lets_go_gambling.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
    public void playLose() {

        try {
            URL url = this.getClass().getClassLoader().getResource("lose.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
    public void playWin() {

        try {
            URL url = this.getClass().getClassLoader().getResource("win.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
    public void playJackpot() {

        try {
            URL url = this.getClass().getClassLoader().getResource("jackpot.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
}