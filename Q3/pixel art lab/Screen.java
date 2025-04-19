import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Screen extends JPanel implements MouseListener, ActionListener{

	public int pixelSize = 20;

	private Square[][] canvas;
	public int canvasX = 200;
	public int canvasY = 200;
	public int canvasWidth = 16;
	public int canvasHeight = 16;

	private Square[][] colorPicker;
	public int pickerX = 0;
	public int pickerY = 0;
	public int pickerWidth = 4;
	public int pickerHeight = 9;

	public Color primaryColor = new Color(255, 255, 255);
	public Color secondaryColor = new Color(255, 255, 255);

	private JButton clearButton;

	public Screen(){
		this.setLayout(null);

		clearButton = new JButton("Clear");
		clearButton.setFont(new Font("Arial", Font.BOLD, 20));
		clearButton.setBounds(15, 355, 100, 30);
		clearButton.addActionListener(this);
		this.add(clearButton);

		this.setFocusable(true);

		addMouseListener(this);
		canvas = new Square[canvasWidth][canvasHeight];
		for(int i = 0; i<canvas.length; i++){
			for(int j = 0; j<canvas[i].length; j++){
				canvas[i][j] = new Square(pixelSize, false, new Color(255, 255, 255));
			}
		}
		colorPicker = new Square[pickerHeight][pickerWidth];
		colorPicker[0][0] = new Square(pixelSize, true, new Color(255, 255, 255)); //white
		colorPicker[0][1] = new Square(pixelSize, true, new Color(255, 0, 0)); //red
		colorPicker[0][2] = new Square(pixelSize, true, new Color(0, 255, 0)); //green
		colorPicker[0][3] = new Square(pixelSize, true, new Color(0, 0, 255)); //blue
		colorPicker[1][0] = new Square(pixelSize, true, new Color(0, 0, 0)); //black
		colorPicker[1][1] = new Square(pixelSize, true, new Color(255, 0, 255)); //magenta
		colorPicker[1][2] = new Square(pixelSize, true, new Color(255, 255, 0)); //yellow
		colorPicker[1][3] = new Square(pixelSize, true, new Color(0, 255, 255)); //cyan
		colorPicker[2][0] = new Square(pixelSize, true, new Color(34, 32, 52)); //black
		colorPicker[2][1] = new Square(pixelSize, true, new Color(69, 40, 60)); //magenta
		colorPicker[2][2] = new Square(pixelSize, true, new Color(102, 57, 49)); //yellow
		colorPicker[2][3] = new Square(pixelSize, true, new Color(143, 86, 59)); //cyan
		colorPicker[3][0] = new Square(pixelSize, true, new Color(223, 113, 38)); //black
		colorPicker[3][1] = new Square(pixelSize, true, new Color(217, 160, 102)); //magenta
		colorPicker[3][2] = new Square(pixelSize, true, new Color(238, 195, 154)); //yellow
		colorPicker[3][3] = new Square(pixelSize, true, new Color(251, 242, 54)); //cyan
		colorPicker[4][0] = new Square(pixelSize, true, new Color(153, 229, 80)); //black
		colorPicker[4][1] = new Square(pixelSize, true, new Color(106, 190, 48)); //magenta
		colorPicker[4][2] = new Square(pixelSize, true, new Color(55, 148, 110)); //yellow
		colorPicker[4][3] = new Square(pixelSize, true, new Color(75, 105, 47)); //cyan
		colorPicker[5][0] = new Square(pixelSize, true, new Color(82, 75, 36)); //black
		colorPicker[5][1] = new Square(pixelSize, true, new Color(50, 60, 57)); //magenta
		colorPicker[5][2] = new Square(pixelSize, true, new Color(63, 63, 116)); //yellow
		colorPicker[5][3] = new Square(pixelSize, true, new Color(48, 96, 130)); //cyan
		colorPicker[6][0] = new Square(pixelSize, true, new Color(91, 110, 225)); //black
		colorPicker[6][1] = new Square(pixelSize, true, new Color(99, 155, 255)); //magenta
		colorPicker[6][2] = new Square(pixelSize, true, new Color(95, 205, 228)); //yellow
		colorPicker[6][3] = new Square(pixelSize, true, new Color(203, 219, 252)); //cyan
		colorPicker[7][0] = new Square(pixelSize, true, new Color(155, 173, 183)); //black
		colorPicker[7][1] = new Square(pixelSize, true, new Color(132, 126, 135)); //magenta
		colorPicker[7][2] = new Square(pixelSize, true, new Color(105, 106, 106)); //yellow
		colorPicker[7][3] = new Square(pixelSize, true, new Color(89, 88, 82)); //cyan
		colorPicker[8][0] = new Square(pixelSize, true, new Color(118, 66, 138)); //black
		colorPicker[8][1] = new Square(pixelSize, true, new Color(172, 50, 50)); //magenta
		colorPicker[8][2] = new Square(pixelSize, true, new Color(217, 87, 99)); //yellow
		colorPicker[8][3] = new Square(pixelSize, true, new Color(215, 123, 186)); //cyan

	}
	
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		int x = canvasX;
		int y = canvasY;
		for(int i = 0; i<canvas.length; i++){
			for(int j = 0; j<canvas[i].length; j++){
				canvas[i][j].drawMe(g, x, y);
				x+=pixelSize;
			}
			x=canvasX;
			y+=pixelSize;
		}
		int x2 = pickerX;
		int y2 = pickerY;
		for(int i = 0; i<colorPicker.length; i++){
			for(int j = 0; j<colorPicker[i].length; j++){
				colorPicker[i][j].drawMe(g, x2, y2);
				x2+=pixelSize;
			}
			x2=pickerX;
			y2+=pixelSize;
		}
	}

	public void mousePressed(MouseEvent e) {
		//Print location of x and y
		System.out.println("X: " + e.getX() + ", Y: " + e.getY());
		System.out.println("pickerX: " + pickerX + ", pickerY: " + pickerY);
		System.out.println("pickerWidth: " + pickerWidth + ", pickerHeight: " + pickerHeight);

		String currentWindow = "";
		int row = -1;
		int column = -1;

		if(e.getX() >= pickerX && e.getX() <= pickerX+(pickerWidth*pixelSize) && e.getY() >= pickerY && e.getY() <= pickerY+(pickerHeight*pixelSize)){
			System.out.println("one");
			row = (e.getY()-pickerY) / pixelSize;
			column = (e.getX()-pickerX) / pixelSize;
			currentWindow = "picker";
		} else if(e.getX() >= canvasX && e.getX() <= canvasX+(canvasWidth*pixelSize) && e.getY() >= canvasY && e.getY() <= canvasY+(canvasHeight*pixelSize)){
			System.out.println("two");
			row = (e.getY()-canvasY) / pixelSize;
			column = (e.getX()-canvasX) / pixelSize;
			currentWindow = "canvas";
		}

		if(row != -1 && column != -1 && !currentWindow.equals("")){
			if(currentWindow.equals("picker")){
				if(e.getButton() == MouseEvent.BUTTON1){
					primaryColor = colorPicker[row][column].getColor();
				}
				if(e.getButton() == MouseEvent.BUTTON3){
					secondaryColor = colorPicker[row][column].getColor();
				}
			}else if(currentWindow.equals("canvas")){
				if(e.getButton() == MouseEvent.BUTTON1){
					canvas[row][column].setColor(primaryColor);
				}
				if(e.getButton() == MouseEvent.BUTTON3){
					canvas[row][column].setColor(secondaryColor);
				}
			}
		}
		System.out.println("" + row + ", " + column);
		repaint();
	}


	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mouseClicked(MouseEvent e) {}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			Color blank = new Color(255, 255, 255);
			for(int i = 0; i<canvas.length; i++){
				for(int j = 0; j<canvas[i].length; j++){
					canvas[i][j].setColor(blank);
				}
			}
			System.out.println("Cleared Canvas");
			repaint();
		}
	}
}
