import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JPanel implements ActionListener {

	private Contact[] myContacts;
	private int currentContact = 5;

	private JTextField searchField;
	private JTextField fNameField;
	private JTextField lNameField;
	private JTextField emailField;

	private JButton userNameButton;
	private JButton firstNameButton;
	private JButton lastNameButton;
	private JButton domainButton;
	private JButton domainExtButton;
	private JButton addPersonButton;

	private JButton cyanButton;
	private JButton magentaButton;
	private JButton yellowButton;
	private JButton blackButton;
	private JButton whiteButton;
	private JButton resetButton;

	private String searchType = "";
	private String searchText;
	private String fNameText;
	private String lNameText;
	private String emailText;

	private int redVal = 255;
	private int greenVal = 255;
	private int blueVal = 255;
	private Color color = new Color(redVal, greenVal, blueVal);

	public Screen(){
		myContacts = new Contact[10];
		myContacts[0] = new Contact("John", "Smith", "john.smith@gmail.com");
		myContacts[1] = new Contact("Jane", "Doe", "janed@gmail.com");
		myContacts[2] = new Contact("George", "Washington", "gwashington@usa.net");
		myContacts[3] = new Contact("Thomas", "Jefferson", "thomas.jefferson@gmail.com");
		myContacts[4] = new Contact("Abraham", "Lincoln", "alincoln@yahoo.com");
		myContacts[5] = new Contact("fName5", "lName5", "email@5.empty");
		myContacts[6] = new Contact("fName6", "lName6", "email@6.empty");
		myContacts[7] = new Contact("fName7", "lName7", "email@7.empty");
		myContacts[8] = new Contact("fName8", "lName8", "email@8.empty");
		myContacts[9] = new Contact("fName9", "lName9", "email@9.empty");
		this.setLayout(null);
		this.setFocusable(true);

		fNameField = new JTextField(30);
		fNameField.setBounds(600, 150, 100, 30);
		this.add(fNameField);

		lNameField = new JTextField(30);
		lNameField.setBounds(600, 200, 100, 30);
		this.add(lNameField);

		emailField = new JTextField(30);
		emailField.setBounds(600, 250, 100, 30);
		this.add(emailField);




		searchField = new JTextField(30);
		searchField.setBounds(400, 350, 100, 30);
		this.add(searchField);

		addPersonButton = new JButton("add contact");
		addPersonButton.setBounds(500, 175, 100, 30);
		this.add(addPersonButton);
		addPersonButton.addActionListener(this);



		userNameButton = new JButton("Username");
		userNameButton.setBounds(100, 400, 100, 30);
		this.add(userNameButton);
		userNameButton.addActionListener(this);

		firstNameButton = new JButton("First Name");
		firstNameButton.setBounds(200, 400, 100, 30);
		this.add(firstNameButton);
		firstNameButton.addActionListener(this);

		lastNameButton = new JButton("Last Name");
		lastNameButton.setBounds(300, 400, 100, 30);
		this.add(lastNameButton);
		lastNameButton.addActionListener(this);

		domainButton = new JButton("Domain");
		domainButton.setBounds(400, 400, 100, 30);
		this.add(domainButton);
		domainButton.addActionListener(this);

		domainExtButton = new JButton("Domain Extension");
		domainExtButton.setBounds(500, 400, 100, 30);
		this.add(domainExtButton);
		domainExtButton.addActionListener(this);

		cyanButton = new JButton("Cyan");
		cyanButton.setBounds(100, 500, 100, 50);
		this.add(cyanButton);
		cyanButton.addActionListener(this);

		magentaButton = new JButton("Magenta");
		magentaButton.setBounds(200, 500, 100, 50);
		this.add(magentaButton);
		magentaButton.addActionListener(this);

		yellowButton = new JButton("Yellow");
		yellowButton.setBounds(300, 500, 100, 50);
		this.add(yellowButton);
		yellowButton.addActionListener(this);

		blackButton = new JButton("Black");
		blackButton.setBounds(400, 500, 100, 50);
		this.add(blackButton);
		blackButton.addActionListener(this);

		whiteButton = new JButton("White");
		whiteButton.setBounds(500, 500, 100, 50);
		this.add(whiteButton);
		whiteButton.addActionListener(this);

		resetButton = new JButton("Reset");
		resetButton.setBounds(600, 500, 100, 50);
		this.add(resetButton);
		resetButton.addActionListener(this);
	}

	public void drawMe(Graphics g){
		Color color = new Color(redVal, greenVal, blueVal);
		g.setColor(color);
		g.fillRect(0, 0, 800, 600);
		int x = 10;
		int y = 20;
		g.setColor(color.BLACK);
		for(int i = 0; i<myContacts.length; i++){
			g.drawString(myContacts[i].toString(), x, y);
			y+=30;
		}
		g.drawString("first name", 725, 175);
		g.drawString("last name", 725, 225);
		g.drawString("email", 725, 275);
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		drawMe(g);

		int x = 400;
		int y = 20;
		for(int i = 0; i<myContacts.length; i++){
			if(searchType.equals("username")){
				if(myContacts[i].getUserName().equals(searchText)){
					g.drawString(myContacts[i].toString(), x, y);
					y+= 30;
				}
			}
			if(searchType.equals("first name")){
				if(myContacts[i].getFirstName().equals(searchText)){
					g.drawString(myContacts[i].toString(), x, y);
					y+= 30;
				}
			}
			if(searchType.equals("last name")){
				if(myContacts[i].getLastName().equals(searchText)){
					g.drawString(myContacts[i].toString(), x, y);
					y+= 30;
				}
			}
			if(searchType.equals("domain")){
				if(myContacts[i].getDomain().equals(searchText)){
					g.drawString(myContacts[i].toString(), x, y);
					y+= 30;
				}
			}
			if(searchType.equals("domain ext")){
				if(myContacts[i].getDomainExt().equals(searchText)){
					g.drawString(myContacts[i].toString(), x, y);
					y+= 30;
				}
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addPersonButton){
			fNameText = fNameField.getText();
			lNameText = lNameField.getText();
			emailText = emailField.getText();
			System.out.println(fNameText);
			System.out.println(lNameText);
			System.out.println(emailText);
            if (currentContact <= 9) {
                myContacts[currentContact] = new Contact(fNameText, lNameText, emailText);
                currentContact++;
            }
			repaint();
        }
		if(e.getSource() == userNameButton){
			searchText = searchField.getText();
			System.out.println(searchText);
			searchType = "username";
			repaint();
		}
		if(e.getSource() == firstNameButton){
			searchText = searchField.getText();
			System.out.println(searchText);
			searchType = "first name";
			repaint();
		}
		if(e.getSource() == lastNameButton){
			searchText = searchField.getText();
			System.out.println(searchText);
			searchType = "last name";
			repaint();
		}
		if(e.getSource() == domainButton){
			searchText = searchField.getText();
			System.out.println(searchText);
			searchType = "domain";
			repaint();
		}
		if(e.getSource() == domainExtButton){
			searchText = searchField.getText();
			System.out.println(searchText);
			searchType = "domain ext";
			repaint();
		}
		if(e.getSource() == cyanButton){
			if(redVal>=15){
				redVal -= 15;
			}else if(redVal>0 && redVal <15){
				redVal = 0;
			}
			System.out.println(redVal + ", " + greenVal + ", " + blueVal);
			repaint();
		}
		if(e.getSource() == magentaButton){
			if(greenVal>=15){
				greenVal -= 15;
			}else if(greenVal>0 && greenVal <15){
				greenVal = 0;
			}
			System.out.println(redVal + ", " + greenVal + ", " + blueVal);
			repaint();
		}
		if(e.getSource() == yellowButton){
			if(blueVal>=15){
				blueVal -= 15;
			}else if(blueVal>0 && blueVal <15){
				blueVal = 0;
			}
			System.out.println(redVal + ", " + greenVal + ", " + blueVal);
			repaint();
		}
		if(e.getSource() == blackButton){
			if(redVal>=15){
				redVal -= 15;
			}else if(redVal>0 && redVal <15){
				redVal = 0;
			}
			if(greenVal>=15){
				greenVal -= 15;
			}else if(greenVal>0 && greenVal <15){
				greenVal = 0;
			}
			if(blueVal>=15){
				blueVal -= 15;
			}else if(blueVal>0 && blueVal <15){
				blueVal = 0;
			}
			System.out.println(redVal + ", " + greenVal + ", " + blueVal);
			repaint();
		}
		if(e.getSource() == whiteButton){
			if(redVal<=240){
				redVal += 15;
			}else if(redVal<255 && redVal>240){
				redVal = 255;
			}
			if(greenVal<=240){
				greenVal += 15;
			}else if(greenVal<255 && greenVal>240){
				greenVal = 255;
			}
			if(blueVal<=240){
				blueVal += 15;
			}else if(blueVal<255 && blueVal>240){
				blueVal = 255;
			}
			System.out.println(redVal + ", " + greenVal + ", " + blueVal);
			repaint();
		}
		if(e.getSource() == resetButton){
			redVal = 255;
			greenVal = 255;
			blueVal = 255;
			System.out.println(redVal + ", " + greenVal + ", " + blueVal);
			repaint();
		}
	}

}
