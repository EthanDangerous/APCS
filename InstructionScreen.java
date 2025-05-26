import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class InstructionScreen extends Screen{
    private StartScreen screen;

    public InstructionScreen(int scWidth, int scHeight, StartScreen screen) {
        super(scWidth, scHeight);
        this.screen = screen;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(201, 255, 254));
        g.fillRect(0, 0, width, height);

        Font font1 = new Font("Bold", Font.BOLD, 75);
        g.setFont(font1);
        g.setColor(new Color(148, 212, 211));

        g.drawString("HOW TO PLAY DOTS & BOXES", 50, 100);
        g.drawString("Press ESC to go back to game creation", 50, 900);

        Font font = new Font("Bold", Font.BOLD, 50);
        g.setFont(font);
        g.drawString("After players choose their color, name,", 50, 200);
        g.drawString("and game specifications, the game starts.", 50, 300);
        g.drawString("On a players turn, they click to place a line between 2 dots.", 50, 400);
        g.drawString("If the line you place completes a box, you keep it and get another turn.", 50, 500);
        g.drawString("This keeps going until the entire grid is filled, and then the game ends.", 50, 600);
        g.drawString("At the end of the game, the player with the most boxes wins!", 50, 700);
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("PRESSED KEY");
        if (e.getKeyCode() == 27) {
            super.newScreen(screen);
        }
    }
}
