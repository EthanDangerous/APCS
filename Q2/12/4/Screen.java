import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Screen extends JPanel implements KeyListener {

	private Player p1;
	private Box[] wall;
	private boolean shoot = false;

	public Screen(){
		
		p1 = new Player(20,300);
		wall = new Box[5];

		int y = 200;
		for(int i=0; i<wall.length; i++){
			wall[i] = new Box(500, y);
			y += 60;
		}
		
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
		for(int i=0; i<wall.length; i++){
			wall[i].drawMe(g);
		}
		
	} 
	
	public void animate(){
		
		while(true){
			
		if(shoot){
			p1.moveRight();
			if(p1.getX()>800){
				p1.setX(20);
				shoot = false;
			}
		}

		for(int i = 0; i<wall.length; i++){
			if(wall[i].getVisible()){
				boolean result = p1.checkCollisionTarget(wall[i]);
				if(result){
					wall[i].setVisible(false);
					System.out.println("HIT");
				}
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
		if(!shoot){
			if( e.getKeyCode() == 38 ){  //up arrow
				p1.moveUp();
			} else if( e.getKeyCode() == 40 ){
				p1.moveDown();
			} else if( e.getKeyCode() == 37 ){
				//p1.moveLeft();
			} else if( e.getKeyCode() == 39 ){
				//p1.moveRight();
			} else if( e.getKeyCode() == 32 ){
				//p1.moveRight();
				shoot = true;
			}
		}


	}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
	
	
}












