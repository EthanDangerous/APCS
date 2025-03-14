import java.awt.Graphics;
//import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Table extends JPanel implements ActionListener {
	
	private Blackjack game;

	private JButton hitButton;
	private JButton standButton;
	private JButton resetButton;
	private JButton againButton;
	private boolean lossSound = true;


	private boolean canStand = true;

	private int points = 20;

	public Table() {
		setLayout(null);

		game = new Blackjack();

		hitButton = new JButton("Hit");
    	hitButton.setBounds(50, 500, 100, 30); //x, y, width, height
        add( hitButton ); //add it to the JPanel
        hitButton.addActionListener( this );

		standButton = new JButton("Score");
		standButton.setBounds(150, 500, 100, 30); //x, y, width, height
		add( standButton ); //add it to the JPanel
		standButton.addActionListener( this );

		resetButton = new JButton("New Hand");
		resetButton.setBounds(250, 500, 100, 30); //x, y, width, height
		add( resetButton ); //add it to the JPanel
		resetButton.addActionListener( this );

		againButton = new JButton("Total Reset");
		againButton.setBounds(350, 500, 100, 30); //x, y, width, height
		add( againButton ); //add it to the JPanel
		againButton.addActionListener( this );
	}
	
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(1000,600);
	}

	public void paintComponent(Graphics g){	
		super.paintComponent(g);

		game.drawGame(g, points, canStand);
//		if(points == 0 && !canStand){
//			if(lossSound){
//				try {
//                    URL url = this.getClass().getClassLoader().getResource("loss.wav");
//                    Clip clip = AudioSystem.getClip();
//                    clip.open(AudioSystem.getAudioInputStream(url));
//                    clip.start();
//                } catch (Exception exc) {
//                    exc.printStackTrace(System.out);
//                }
//                lossSound = false;
//            }
//		}
		g.setColor(Color.BLACK);
		Font font = new Font("Arial", Font.PLAIN, 20);
		Font fontBig = new Font("Arial", Font.PLAIN, 75);

		g.setFont(fontBig);
		g.drawString("SCORE: " + points, 10, 75);
	}
	


	public void actionPerformed(ActionEvent e){
        //When a button gets pressed, this method gets called
        if( e.getSource() == hitButton && canStand){
 			game.hit();
        }
		if( e.getSource() == standButton && canStand){
			if(game.getTotalVal() == 21){
				points += 5;
			}
			if(game.getTotalVal() == 20){
				points += 3;
			}
			if(game.getTotalVal() == 19 || game.getTotalVal() == 18){
				points += 2;
			}
			if(game.getTotalVal() == 17 || game.getTotalVal() == 16){
				points += 1;
			}
			if(game.getTotalVal() >= 16 && game.getTotalVal() <= 21){
				canStand = false;
				try {
					URL url = this.getClass().getClassLoader().getResource("score.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(url));
					clip.start();
				} catch (Exception exc) {
					exc.printStackTrace(System.out);
				}
			}
			if(game.getTotalVal() > 21){
				canStand = false;
			}
		}
		if( e.getSource() == resetButton ){
			if(canStand){
				if(game.getTotalVal() == 21){
					points += 5;
				}
				if(game.getTotalVal() == 20){
					points += 3;
				}
				if(game.getTotalVal() == 19 || game.getTotalVal() == 18){
					points += 2;
				}
				if(game.getTotalVal() == 17 || game.getTotalVal() == 16){
					points += 1;
				}
				if(game.getTotalVal() >= 16 && game.getTotalVal() <= 21){
					canStand = false;
					try {
						URL url = this.getClass().getClassLoader().getResource("score.wav");
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(url));
						clip.start();
					} catch (Exception exc) {
						exc.printStackTrace(System.out);
					}
				}
				if(game.getTotalVal() > 21){
					canStand = false;
				}
			}
			if(points != 0){
				game = new Blackjack();
				if(points >0){
					points--;
				}
				canStand = true;
			}
		}
		if( e.getSource() == againButton ){
			points = 20;
			game = new Blackjack();
		}

		//refresh the screen
    	repaint();

    }
}
