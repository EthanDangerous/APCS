import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Screen extends JPanel implements ActionListener{
	private JButton b1;

	private SlotMachine sm;

	public Screen(){
		sm = new SlotMachine();

		sm.reset();
		sm.playGambling();

		this.setLayout(null);

        //Button
        b1 = new JButton("SPIN");
		
		//these change the color of the button. foreground is the color of the text, backround is the color of the button itself.
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.GRAY);

		b1.setFont(new Font("Bold", Font.BOLD, 100));
        b1.setBounds(25, 300, 275, 125); //sets the location and size
        b1.addActionListener(this); //add the listener
        this.add(b1); //add to JPanel
	}

	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		sm.drawMe(g);
		sm.showResult(g);
	}
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("Button has been clicked");
			sm.play();
            repaint();
        }
    }
}