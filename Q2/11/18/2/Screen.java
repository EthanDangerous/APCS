import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.*;

public class Screen extends JPanel implements KeyListener{

	private Player player;

	public Screen(){
		player = new Player(100, 100);
		addKeyListener(this);
		setFocusable(true);
	}

	public Dimension getPreferredSize() {
		//Sets the size of the panel
        return new Dimension(800,600);
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);

		player.drawMe(g);
	}

	public void keyPressed(KeyEvent e){
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == 38){
			player.moveUp();
		}
		repaint();
	}
	public void keyReleased(KeyEvent e){

	}
	public void keyTyped(KeyEvent e){

	}

}
