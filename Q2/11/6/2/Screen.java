import javax.swing.JPanel;
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
    private JTextField t1;
    private int numTree = 10;

	private Color green;
	private Color yellow;
	private Color brown;
	private Color sky;
	private Color ground;
	private Color cloud;
	private Color black;

	public Screen(){
		this.setLayout(null);

        //Button
        b1 = new JButton("Submit");
        b1.setBounds(100, 100, 200, 30); //sets the location and size
        b1.addActionListener(this); //add the listener
        this.add(b1); //add to JPanel

        //TextField
        t1 = new JTextField(20);
        t1.setBounds(100, 50, 80, 30);
        this.add(t1);

        this.setFocusable(true);


		green = new Color(0, 155, 0);
		yellow = new Color(255, 255, 0);
		brown = new Color(150, 75, 0);
		sky = new Color(100, 100, 200);
		ground = new Color(0, 100, 0);
		cloud = new Color(200, 200, 215);
		black = new Color(0, 0, 0);
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		drawSky(g);
		drawGround(g);

		for(int i = 0; i<20; i++){
			int x = (int) (Math.random() * 781);
			int y = (int) (Math.random() * 309 + 272);
			drawFlower(g, x, y);
		}
		for(int i = 0; i<numTree; i++){
			int x = (int) (Math.random() * 751);
			int y = (int) (Math.random() * 281 + 270);
			drawTree(g, x, y);
		}
		for(int i = 0; i<5; i++){
			int x = (int) (Math.random() * 721);
			int y = (int) (Math.random() * 161);
			drawCloud(g, x, y);
		}
		for(int i = 0; i<3; i++){
			int x = (int) (Math.random() * 781);
			int y = (int) (Math.random() * 281);
			drawBird(g, x, y);
		}


        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(black);
        g.drawString("How many trees do you want?", 10, 30);
	}

	public void drawCloud(Graphics g, int x, int y){
		g.setColor(cloud);
		g.fillOval(x, y, 80, 40);
	}
	public void drawBird(Graphics g, int x, int y){
		g.setColor(black);
		int xpoints[] = {x, x+10, x+20, x+10};
    	int ypoints[] = {y, y+6, y, y+4};
    	int npoints = 4;
    	g.fillPolygon(xpoints, ypoints, npoints);
	}
	public void drawSky(Graphics g){
		g.setColor(sky);
		g.fillRect(0, 0, 800, 600);
	}
	public void drawGround(Graphics g){
		g.setColor(ground);
		g.fillRect(0, 300, 800, 300);
	}
	public void drawTree(Graphics g, int x, int y){
		g.setColor(brown);
		g.fillRect(x+15, y+25, 20, 50);
		g.setColor(green);
		g.fillOval(x, y, 50, 50);
	}
	public void drawFlower(Graphics g, int x, int y){
		g.setColor(green);
		g.fillRect(x+8, y+10, 4, 18);
		g.setColor(yellow);
		g.fillOval(x, y, 20, 20);
	}
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("Button has been clicked");

            numTree = Integer.parseInt(t1.getText());
            repaint();
        }
    }
}
