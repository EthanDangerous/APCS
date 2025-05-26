import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class EndScreen extends Screen{
    private String player1;
    private String player2;
    private int score1;
    private int score2;
    private int result;
    private int width;
    private int height;
    private StartScreen startScreen;

    public EndScreen(String player1, String player2, int score1, int score2, int w, int h, int result, StartScreen startScreen){
        super(w, h);
        // result -> 0 = tie, 1 = p1 win, 2 = p2 win
        this.player1 = player1;
        this.player2 = player2;
        this.score1 = score1;
        this.score2 = score2;
        this.result = result;
        this.width = w;
        this.height = h;
        this.startScreen = startScreen;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(201, 255, 254));
        g.fillRect(0, 0, width, height);

        Font font1 = new Font("Bold", Font.BOLD, 75);
        g.setFont(font1);
        g.setColor(new Color(148, 212, 211));

        switch(result){
            case 0:
                g.drawString("THE GAME IS A TIE!", 50, 100);
                g.drawString("Both players got " + score1 + " points", 50, 200);
                break;
            case 1:
                g.drawString("THE WINNER IS " + player1 + "!", 50, 100);
                g.drawString("" + player1 + ": " + score1 + " points", 50, 200);
                g.drawString("" + player2 + ": " + score2 + " points", 50, 300);
                break;
            case 2:
                g.drawString("THE WINNER IS " + player2 + "!", 50, 100);
                g.drawString("" + player1 + ": " + score1 + " points", 50, 200);
                g.drawString("" + player2 + ": " + score2 + " points", 50, 300);
                break;
            default:
                g.drawString("Cheat key has no winners...", 50, 100);
                break;
        }
        g.drawString("Press ESC to go back to game creation", 50, 500);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 112) {
//            System.out.println("CHEAT KEY");
            super.newScreen(startScreen);
        }
        if (e.getKeyCode() == 27) {
            super.newScreen(startScreen);
        }
    }
}
