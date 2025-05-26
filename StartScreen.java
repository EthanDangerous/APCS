import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class StartScreen extends Screen{
    private JTextField p1Name;
    private JTextField p2Name;
//    private JTextField p1Color;
//    private JTextField p2Color;
    private JSlider boxSize;
    private JSlider gridWidth;
    private JSlider gridHeight;
    private JButton startButton;
    private int scWidth;
    private int scHeight;
    private JSlider color1R;
    private JSlider color1G;
    private JSlider color1B;
    private JSlider color2R;
    private JSlider color2G;
    private JSlider color2B;


    public StartScreen(int scWidth, int scHeight){
        super(scWidth, scHeight);
        this.scWidth = scWidth;
        this.scHeight = scHeight;
//        addMouseListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();

        p1Name = new JTextField();
        p1Name.setFont(new Font("Arial", Font.PLAIN, 20));
        p1Name.setHorizontalAlignment(SwingConstants.CENTER);
        p1Name.setBounds(700, 225, 200, 30);
        p1Name.setText("Player 1 Name");
        this.add(p1Name);

        p2Name = new JTextField();
        p2Name.setFont(new Font("Arial", Font.PLAIN, 20));
        p2Name.setHorizontalAlignment(SwingConstants.CENTER);
        p2Name.setBounds(1000, 225, 200, 30);
        p2Name.setText("Player 2 Name");
        this.add(p2Name);

        boxSize = new JSlider(JSlider.HORIZONTAL, 80, 800, 80); // min, max, initial
        boxSize.setBounds(700, 300, 500, 100);
        boxSize.setMajorTickSpacing(40);
        boxSize.setPaintTicks(true);
        boxSize.setPaintLabels(true);
        boxSize.setBackground(new Color(0, 0, 0, 0));
        this.add(boxSize);

        gridWidth = new JSlider(JSlider.HORIZONTAL, 1, 20, 1); // min, max, initial
        gridWidth.setBounds(700, 400, 500, 100);
        gridWidth.setMajorTickSpacing(1);
        gridWidth.setPaintTicks(true);
        gridWidth.setPaintLabels(true);
        gridWidth.setBackground(new Color(0, 0, 0, 0));
        this.add(gridWidth);

        gridHeight = new JSlider(JSlider.HORIZONTAL, 1, 12, 1); // min, max, initial
        gridHeight.setBounds(700, 500, 500, 100);
        gridHeight.setMajorTickSpacing(1);
        gridHeight.setPaintTicks(true);
        gridHeight.setPaintLabels(true);
        gridHeight.setBackground(new Color(0, 0, 0, 0));
        this.add(gridHeight);

        // max grid width should be no more than 1200 and max height should be no more than 960






        startButton = new JButton();
        startButton.setFont(new Font("Bold", Font.BOLD, 80));
        startButton.setHorizontalAlignment(SwingConstants.CENTER);
        startButton.setBounds(810, 760, 300, 100);
        startButton.setText("START");
        this.add(startButton);
        startButton.setFocusable(false);
        startButton.addActionListener(this);


        // a full set has a width of 55
        int c1RNum = (int) (Math.random()*256);
        color1R = new JSlider(JSlider.VERTICAL, 0, 255, c1RNum); // min, max, initial
        color1R.setBounds(700, 600, 15, 300);
        color1R.setMajorTickSpacing(1);
        color1R.setBackground(new Color(0, 0, 0, 0));
        this.add(color1R);

        int c1GNum = (int) (Math.random()*256);
        color1G = new JSlider(JSlider.VERTICAL, 0, 255, c1GNum); // min, max, initial
        color1G.setBounds(720, 600, 15, 300);
        color1G.setMajorTickSpacing(1);
        color1G.setBackground(new Color(0, 0, 0, 0));
        this.add(color1G);

        int c1BNum = (int) (Math.random()*256);
        color1B = new JSlider(JSlider.VERTICAL, 0, 255, c1BNum); // min, max, initial
        color1B.setBounds(740, 600, 15, 300);
        color1B.setMajorTickSpacing(1);
        color1B.setBackground(new Color(0, 0, 0, 0));
        this.add(color1B);


        int c2RNum = (int) (Math.random()*256);
        color2R = new JSlider(JSlider.VERTICAL, 0, 255, c2RNum); // min, max, initial
        color2R.setBounds(1165, 600, 15, 300);
        color2R.setMajorTickSpacing(1);
        color2R.setBackground(new Color(0, 0, 0, 0));
        this.add(color2R);

        int c2GNum = (int) (Math.random()*256);
        color2G = new JSlider(JSlider.VERTICAL, 0, 255, c2GNum); // min, max, initial
        color2G.setBounds(1185, 600, 15, 300);
        color2G.setMajorTickSpacing(1);
        color2G.setBackground(new Color(0, 0, 0, 0));
        this.add(color2G);

        int c2BNum = (int) (Math.random()*256);
        color2B = new JSlider(JSlider.VERTICAL, 0, 255, c2BNum); // min, max, initial
        color2B.setBounds(1205, 600, 15, 300);
        color2B.setMajorTickSpacing(1);
        color2B.setBackground(new Color(0, 0, 0, 0));
        this.add(color2B);


        this.setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font font = new Font("Bold", Font.BOLD, 50);
        g.setFont(font);

        String initial1 = "";
        String initial2 = "";
        String p1Text = p1Name.getText();
        String p2Text = p2Name.getText();
        if(!p1Text.equals("")){
            if(p1Text.length() >= 2){
                initial1 = p1Text.substring(0, 2);
            }else{
                initial1 = p1Text.substring(0, 1);
            }
        }
        if(!p2Text.equals("")){
            if(p2Text.length() >= 2){
                initial2 = p2Text.substring(0, 2);
            }else{
                initial2 = p2Text.substring(0, 1);
            }
        }

        if(initial1.equals(initial2)){
            if(initial1.length() == 2){
                initial1 = initial1.substring(0, 1) + "1";
                initial2 = initial2.substring(0, 1) + "2";
            }else if (initial1.length() == 1){
                initial1 = initial1 + "1";
                initial2 = initial2 + "2";
            }else{
                initial1 = "P1";
                initial2 = "P2";
            }
        }

        if(initial1.equals("") && !initial2.equals("")){
            if(!initial2.equals("P1") && !initial2.equals("p1")){
                initial1 = "P1";
            } else{
                initial1 = "1";
            }
        }
        if(initial2.equals("") && !initial1.equals("")){
            if(!initial1.equals("P2") && !initial1.equals("p2")){
                initial2 = "P2";
            } else{
                initial2 = "2";
            }
        }

        g.setColor(new Color(201, 255, 254));
        g.fillRect(0, 0, super.width, super.height);

//        //draw blue oval
//        g.setColor(Color.RED);
//        g.fillOval(super.x, 100, 100, 20);

        g.setColor(new Color(color1R.getValue(), color1G.getValue(), color1B.getValue()));
        if(initial1.length() == 1){
            g.drawString(initial1, 711, 940);
        }else{
            g.drawString(initial1, 698, 940);
        }

        g.setColor(new Color(color2R.getValue(), color2G.getValue(), color2B.getValue()));
        if(initial2.length() == 1){
            g.drawString(initial2, 1178, 940);
        }else{
            g.drawString(initial2, 1163, 940);
        }

        //        g.fillRect(600, 900, 55, 55);

        String message = "Press H for instructions";
        g.setColor(new Color(148, 212, 211));
        g.drawString(message, 980-(message.length()*font.getSize()/4), 1020);


        Font font2 = new Font("Bold", Font.BOLD, 25);
        g.setFont(font2);

        g.drawString("BOX SIZE: " + boxSize.getValue(), 700, 320);
        g.drawString("GRID WIDTH: " + gridWidth.getValue(), 700, 420);
        g.drawString("GRID HEIGHT: " + gridHeight.getValue(), 700, 520);

        gridWidth.setMaximum(1200/boxSize.getValue());
        gridHeight.setMaximum(960/boxSize.getValue());

        Font font1 = new Font("Bold", Font.BOLD, 100);
        g.setFont(font1);
        g.setColor(new Color(148, 212, 211));

        g.drawString("DOTS & BOXES", 560, 150);

    }

    /*
    SIZE OF EACH BOX RECCOMENDED ABOVE 80 FOR VISIBILITY
     */


    // redo the actionperformed for the start button to be more consise

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 112) {
            int width = gridWidth.getValue();
            int height = gridHeight.getValue();
            int size = boxSize.getValue();
            Color p1Color = new Color(color1R.getValue(), color1G.getValue(), color1B.getValue());
            Color p2Color = new Color(color2R.getValue(), color2G.getValue(), color2B.getValue());
            super.newScreen(new GameScreen(scWidth, scHeight, width, height, size, "Cheat P1", "Cheat P2", "P1", "P2", p2Color, p1Color, this));
        }
        if(e.getKeyCode() == 72){
//            System.out.println("PRESSED HELP KEY");
            super.newScreen(new InstructionScreen(scWidth, scHeight, this));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
//            System.out.println("GAME START");
//            System.out.println("p1 NAME: " + p1Name.getText());
//            System.out.println("p2 NAME: " + p2Name.getText());
//            System.out.println("BOX SIZE: " + boxSize.getValue());
//            System.out.println("GRID WIDTH: " + gridWidth.getValue());
//            System.out.println("GRID HEIGHT: " + gridHeight.getValue());
//
//
//            System.out.println("Color 1 R: " + color1R.getValue());

            Color p1Color = new Color(color1R.getValue(), color1G.getValue(), color1B.getValue());
            Color p2Color = new Color(color2R.getValue(), color2G.getValue(), color2B.getValue());


            String initial1 = "";
            String initial2 = "";
            String p1Text = p1Name.getText();
            String p2Text = p2Name.getText();
            if(!p1Text.equals("")){
                if(p1Text.length() >= 2){
                    initial1 = p1Text.substring(0, 2);
                }else{
                    initial1 = p1Text.substring(0, 1);
                }
            }
            if(!p2Text.equals("")){
                if(p2Text.length() >= 2){
                    initial2 = p2Text.substring(0, 2);
                }else{
                    initial2 = p2Text.substring(0, 1);
                }
            }

            if(initial1.equals(initial2)){
                if(initial1.length() == 2){
                    initial1 = initial1.substring(0, 1) + "1";
                    initial2 = initial2.substring(0, 1) + "2";
                }else if (initial1.length() == 1){
                    initial1 = initial1 + "1";
                    initial2 = initial2 + "2";
                }else{
                    initial1 = "P1";
                    initial2 = "P2";
                }
            }

            if(initial1.equals("") && !initial2.equals("")){
                if(!initial2.equals("P1") && !initial2.equals("p1")){
                    initial1 = "P1";
                } else{
                    initial1 = "1";
                }
            }
            if(initial2.equals("") && !initial1.equals("")){
                if(!initial1.equals("P2") && !initial1.equals("p2")){
                    initial2 = "P2";
                } else{
                    initial2 = "2";
                }
            }

            String username1 = p1Name.getText();
            String username2 = p2Name.getText();

            if(username1.equals("")){
                username1 = initial1;
            }
            if(username2.equals("")){
                username2 = initial2;
            }

            int width = gridWidth.getValue();
            int height = gridHeight.getValue();
            int size = boxSize.getValue();
            super.newScreen(new GameScreen(scWidth, scHeight, width, height, size, username1, username2, initial1, initial2, p1Color, p2Color, this));
        }
        requestFocus();
        setFocusable(true);
    }
}
