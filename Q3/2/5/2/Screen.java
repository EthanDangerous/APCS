import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;



public class Screen extends JPanel {

	ArrayTest at = new ArrayTest();
	ArrayList<Card> card = new ArrayList<Card>();

	public Screen(){
		card.add(new Card(2));
		card.add(new Card(3));
		card.add(new Card(4));
		card.add(new Card(5));
		card.add(new Card(6));
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int x = 20;
		int y = 20;
		for(int i = 0; i<card.size(); i++){
			card.get(i).drawMe(g, x, y);
			x+=100;
		}
	}
}
