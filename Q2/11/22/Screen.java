import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Screen extends JPanel implements KeyListener {

	private Player p1;
	private Target t1;

	public Screen(){
		
		p1 = new Player(50,300);
		t1 = new Target(150,300);
		
		addKeyListener(this);
		setFocusable(true);
	}

	public Dimension getPreferredSize() {
		//Sets the size of the panel
        return new Dimension(800,600);
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);

		p1.drawMe(g);
		t1.drawMe(g);
		
	} 
	
	public void animate(){
		
		while(true){
			if(t1.getVisible()){
				boolean collisionResult = p1.checkCollision(t1);
				if(collisionResult){
					System.out.println("Collision");
					t1.setVisible(false);
				}
			}
			//wait for .01 second
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			

			
			//repaint the graphics drawn
			repaint();
		}

	}
	
	public void keyPressed(KeyEvent e){
		
		//System.out.println("key: " + e.getKeyCode());
		if( e.getKeyCode() == 38 ){  //up arrow
			p1.moveUp();
		} else if( e.getKeyCode() == 40 ){  
			p1.moveDown();
		} else if( e.getKeyCode() == 37 ){  
			p1.moveLeft();
		} else if( e.getKeyCode() == 39 ){  
			p1.moveRight();
		}
		
		
	}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
	
	
}












