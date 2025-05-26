import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public abstract class Screen extends JPanel implements ActionListener, MouseListener, KeyListener {

    public int width;
    public int height;
    public static int x = 100;
    public static Graphics g;

    public Screen(int width, int height){
        this.width = width;
        this.height = height;
        this.setLayout(null);
        addMouseListener(this);
        addKeyListener(this);
    }

    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g = g;
        g.setColor(new Color(201, 255, 254));
        g.fillRect(0, 0, width, height);
    }

    public void newScreen(Screen screen){
        Runner.canvas = screen;
        Runner.frame.getContentPane().removeAll();
        Runner.frame.add(screen);
        Runner.frame.revalidate();
        Runner.canvas.setFocusable(true);
        Runner.canvas.requestFocusInWindow();
        x=100;
        repaint();
    }

    public void animate() {
        while(true) {
            //wait for .1 second
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            //increment x
            x++;
            //repaint the graphics drawn
            Runner.canvas.repaint();
        }
    }

    public void actionPerformed(ActionEvent e) {
        requestFocus();
        setFocusable(true);
    }

    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 1 || e.getButton() == 2 || e.getButton() == 3){
//            System.out.println("ACTION");
        }
    }

    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void keyPressed(KeyEvent e) {
//        System.out.println("key code: " + e.getKeyCode());
        repaint();
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public void fill() {
        try {
            URL url = this.getClass().getClassLoader().getResource("point.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    public void draw() {
        try {
            URL url = this.getClass().getClassLoader().getResource("line.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    public Screen get(){
        return this;
    }
}
