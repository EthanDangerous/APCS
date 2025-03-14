import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Screen extends JPanel implements ActionListener {
	
	private JButton loginButton;
	private JTextField pinTextField;
	private Bank user1;

	public Screen(){

		user1 = new Bank("Maria", 1234);

		pinTextField = new JTextField();
		pinTextField.setBounds(50, 250, 100, 30);
		add(pinTextField);

		setLayout(null);//no layout for buttons/text fields
		loginButton = new JButton("Login");
		loginButton.setBounds(50, 300, 100, 30);// x, y, width, height
		add(loginButton);
		loginButton.addActionListener(this);
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		String name = user1.getName();
		g.drawString(name, 50, 200);
		
	}
	
	public void actionPerformed(ActionEvent e){
		//detect button press
		if(e.getSource() == loginButton){
			//System.out.println("login button");
			String pinText = pinTextField.getText();
			int pin = Integer.parseInt(pinText);
			user1.checkPin(pin);
			if (user1.getAccess() == true){
				loginButton.setVisible(false);
				pinTextField.setVisible(false);
			}
			
			repaint();
		}
	}
	
}














