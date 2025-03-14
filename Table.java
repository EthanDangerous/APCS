import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Table extends JPanel implements ActionListener, MouseListener, KeyListener {

//	public JButton getCard;
    public JButton playHand;
    public JButton playerSwitch;
//    public JButton endTurn;
    public JButton rulesButton;
    public JButton closeButton;
    public JButton startTurn;
    public JButton newGame;
    private CardGame cardGame;
    private Graphics g;
    public boolean viewingRules = false;
    public boolean skip = false;
    public boolean drawFromTheBottom = false;
    public boolean seeTheFuture = false;
    public int attacks = 0;
    public int currentScreen = 0;

    public Table() {
        cardGame = new CardGame(this);
        //setup buttons
        setLayout(null);

//        getCard = new JButton("Draw Card");
//        getCard.setBounds(400, 250, 100, 30); //x,y,width,height
//        getCard.addActionListener(this);
//        add(getCard);

        playHand = new JButton("Play Hand");
        playHand.setBounds(400, 280, 100, 30); //x,y,width,height
        playHand.addActionListener(this);
        add(playHand);

        playerSwitch = new JButton("End Turn & Draw");
        playerSwitch.setBounds(400, 250, 200, 30); //x,y,width,height
        playerSwitch.addActionListener(this);
        add(playerSwitch);

        rulesButton = new JButton("Rules");
        rulesButton.setBounds(500, 280, 100, 30); //x,y,width,height
        rulesButton.addActionListener(this);
        add(rulesButton);

        newGame = new JButton("New Game");
        newGame.setBounds(500, 280, 200, 50); //x,y,width,height
        newGame.addActionListener(this);
        add(newGame);

        startTurn = new JButton("Start Turn");
        startTurn.setBounds(450, 310, 100, 30); //x,y,width,height
        startTurn.addActionListener(this);
        add(startTurn);
        startTurn.setVisible(false);

        closeButton = new JButton("X");
        closeButton.setBounds(660, 30, 40, 40); //x,y,width,height
        closeButton.addActionListener(this);
        add(closeButton);
        closeButton.setVisible(false);

        addMouseListener(this);
        setFocusable(true);
        addKeyListener(this);
    }

    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(1000, 600);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        cardGame.drawGame(g);
        cardGame.addCardButton(this);
        this.g = g;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playHand) {
            if(cardGame.currentPlayer == 1){
                boolean actionDone = false;
                for(int i = 0; i<cardGame.playersCard.size()-1; i++){
                    for(int j = i+1; j<cardGame.playersCard.size()-1; j++){
                        if(actionDone){
                            break;
                        }
                        if(cardGame.playersCard.get(i).getValue() != 7 && cardGame.playersCard.get(i).getSelected() && cardGame.playersCard.get(j).getSelected() && cardGame.playersCard.get(i).getValue() == cardGame.playersCard.get(j).getValue()){
                            cardGame.playersCard.get(i).highlight();
                            cardGame.playersCard.get(j).highlight();
                            cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                            cardGame.getDiscard().add(cardGame.playersCard.remove(j-1));
                            System.out.println("IT WORKS!");
                            int steal = (int) (Math.random() * cardGame.playersCard2.size() -1);
                            cardGame.playersCard.add(cardGame.playersCard2.remove(steal));
                            cardGame.playersCard.get(cardGame.playersCard.size()-1).highlight();
                            cardGame.sort(1);
                            actionDone = true;
                        }
                        if(!actionDone && cardGame.playersCard.get(i).getSelected() && cardGame.playersCard.get(j).getSelected()){
                            if(cardGame.playersCard.get(i).getValue() == 7 && cardGame.playersCard.get(j).getValue() == 7){
                                cardGame.playersCard.get(i).highlight();
                                cardGame.playersCard.get(j).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                cardGame.getDiscard().add(cardGame.playersCard.remove(j-1));
                                System.out.println("IT WORKS!");
                                int steal = (int) (Math.random() * cardGame.playersCard2.size() -1);
                                cardGame.playersCard.add(cardGame.playersCard2.remove(steal));
                                cardGame.playersCard.get(cardGame.playersCard.size()-1).highlight();
                                cardGame.sort(1);
                                actionDone = true;
                            }
                            if(cardGame.playersCard.get(i).getValue() == 7 && cardGame.playersCard.get(j).getValue() < 7){
                                cardGame.playersCard.get(i).highlight();
                                cardGame.playersCard.get(j).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                cardGame.getDiscard().add(cardGame.playersCard.remove(j-1));
                                System.out.println("IT WORKS!");
                                int steal = (int) (Math.random() * cardGame.playersCard2.size() -1);
                                cardGame.playersCard.add(cardGame.playersCard2.remove(steal));
                                cardGame.playersCard.get(cardGame.playersCard.size()-1).highlight();
                                cardGame.sort(1);
                                actionDone = true;
                            }
                            if(cardGame.playersCard.get(j).getValue() == 7 && cardGame.playersCard.get(i).getValue() < 7){
                                cardGame.playersCard.get(i).highlight();
                                cardGame.playersCard.get(j).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                cardGame.getDiscard().add(cardGame.playersCard.remove(j-1));
                                System.out.println("IT WORKS!");
                                int steal = (int) (Math.random() * cardGame.playersCard2.size() -1);
                                cardGame.playersCard.add(cardGame.playersCard2.remove(steal));
                                cardGame.playersCard.get(cardGame.playersCard.size()-1).highlight();
                                cardGame.sort(1);
                                actionDone = true;
                            }
                        }
                    }
                    if(actionDone){
                        break;
                    }
                }
                //currently there is a bug where if the pair you want to play is the last 2 cards of your hand, nothing will happen. it will go through this loop above and do nothing.
                // in addition,
                if(!actionDone){
                    for(int i = 0; i< cardGame.playersCard.size(); i++){
                        if(cardGame.playersCard.get(i).getSelected()){
                            if(cardGame.playersCard.get(i).getValue() == 8){
                                //attack
                                cardGame.playersCard.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                skip = true;
                                if(attacks == 0){
                                    switchPlayer();
                                    attacks++;
                                }else{
                                    switchAttackStack();
                                }
                                break;
                            }
                            if(cardGame.playersCard.get(i).getValue() == 9){
                                //favor, for now just steal a random card
                                int steal = (int) (Math.random() * cardGame.playersCard2.size() -1);
                                cardGame.playersCard.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                cardGame.playersCard.add(cardGame.playersCard2.remove(steal));
                                cardGame.playersCard.get(cardGame.playersCard.size()-1).highlight();
                                cardGame.sort(1);
                                break;
                            }
                            if(cardGame.playersCard.get(i).getValue() == 10){
                                //skip
                                skip = true;
                                cardGame.playersCard.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                switchPlayer();
                                break;
                            }
                            if(cardGame.playersCard.get(i).getValue() == 11){
                                cardGame.shuffle();
                                cardGame.playersCard.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                break;
                            }
                            if(cardGame.playersCard.get(i).getValue() == 12){
                                //nope cards cant do anything for now.
                            }
                            if(cardGame.playersCard.get(i).getValue() == 13){
                                //see the future
                                cardGame.playersCard.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                seeTheFuture = true;
                                cardGame.viewingCard = true;
                                repaint();
                                break;
                            }
                            if(cardGame.playersCard.get(i).getValue() == 14){
                                //for now have it do a see the future
                                cardGame.playersCard.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                seeTheFuture = true;
                                cardGame.viewingCard = true;
                                repaint();
                                break;
                            }
                            if(cardGame.playersCard.get(i).getValue() == 15){
                                //draw from the bottom
                                drawFromTheBottom = true;
                                cardGame.playersCard.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                break;
                            }
                        }
                    }
                }
            }else if(cardGame.currentPlayer == 2){
                boolean actionDone = false;
                for(int i = 0; i<cardGame.playersCard2.size(); i++){
                    for(int j = i+1; j<cardGame.playersCard2.size()-1; j++){
                        if(actionDone){
                            break;
                        }
                        if(cardGame.playersCard2.get(i).getValue() != 7 && cardGame.playersCard2.get(i).getSelected() && cardGame.playersCard2.get(j).getSelected() && cardGame.playersCard2.get(i).getValue() == cardGame.playersCard2.get(j).getValue()){
                            cardGame.playersCard2.get(i).highlight();
                            cardGame.playersCard2.get(j).highlight();
                            cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                            cardGame.getDiscard().add(cardGame.playersCard2.remove(j-1));
                            System.out.println("IT WORKS!");
                            int steal = (int) (Math.random() * cardGame.playersCard.size() -1);
                            cardGame.playersCard2.add(cardGame.playersCard.remove(steal));
                            cardGame.playersCard2.get(cardGame.playersCard2.size()-1).highlight();
                            cardGame.sort(2);
                            actionDone = true;
                        }
                        if(!actionDone && cardGame.playersCard2.get(i).getSelected() && cardGame.playersCard2.get(j).getSelected()){
                            if(cardGame.playersCard.get(i).getValue() == 7 && cardGame.playersCard.get(j).getValue() == 7){
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.playersCard2.get(j).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(j-1));
                                System.out.println("IT WORKS!");
                                int steal = (int) (Math.random() * cardGame.playersCard.size() -1);
                                cardGame.playersCard2.add(cardGame.playersCard.remove(steal));
                                cardGame.playersCard2.get(cardGame.playersCard2.size()-1).highlight();
                                cardGame.sort(2);
                                actionDone = true;
                            }
                            if(cardGame.playersCard2.get(i).getValue() == 7 && cardGame.playersCard2.get(j).getValue() < 7){
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.playersCard2.get(j).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(j-1));
                                System.out.println("IT WORKS!");
                                int steal = (int) (Math.random() * cardGame.playersCard.size() -1);
                                cardGame.playersCard2.add(cardGame.playersCard.remove(steal));
                                cardGame.playersCard2.get(cardGame.playersCard2.size()-1).highlight();
                                cardGame.sort(2);
                                actionDone = true;
                            }
                            if(cardGame.playersCard2.get(j).getValue() == 7 && cardGame.playersCard2.get(i).getValue() < 7){
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.playersCard2.get(j).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(j-1));
                                System.out.println("IT WORKS!");
                                int steal = (int) (Math.random() * cardGame.playersCard.size() -1);
                                cardGame.playersCard2.add(cardGame.playersCard.remove(steal));
                                cardGame.playersCard2.get(cardGame.playersCard2.size()-1).highlight();
                                cardGame.sort(2);
                                actionDone = true;
                            }
                        }
                    }
                    if(actionDone){
                        break;
                    }
                }
                //currently there is a bug where if the pair you want to play is the last 2 cards of your hand, nothing will happen. it will go through this loop above and do nothing.
                // in addition,
                if(!actionDone){
                    for(int i = 0; i< cardGame.playersCard2.size(); i++){
                        if(cardGame.playersCard2.get(i).getSelected()){
                            if(cardGame.playersCard2.get(i).getValue() == 8){
                                //attack
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                skip = true;
                                if(attacks == 0){
                                    switchPlayer();
                                    attacks++;
                                }else{
                                    switchAttackStack();
                                }
                                break;
                            }
                            if(cardGame.playersCard2.get(i).getValue() == 9){
                                //favor, for now just steal a random card
                                int steal = (int) (Math.random() * cardGame.playersCard.size() -1);
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                cardGame.playersCard2.add(cardGame.playersCard.remove(steal));
                                cardGame.playersCard2.get(cardGame.playersCard2.size()-1).highlight();
                                cardGame.sort(2);
                                break;
                            }
                            if(cardGame.playersCard2.get(i).getValue() == 10){
                                //skip
                                skip = true;
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                switchPlayer();
                                break;
                            }
                            if(cardGame.playersCard2.get(i).getValue() == 11){
                                cardGame.shuffle();
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                break;
                            }
                            if(cardGame.playersCard2.get(i).getValue() == 12){
                                //nope cards cant do anything for now.
                            }
                            if(cardGame.playersCard2.get(i).getValue() == 13){
                                //see the future
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                seeTheFuture = true;
                                cardGame.viewingCard = true;
                                repaint();
                                break;
                            }
                            if(cardGame.playersCard2.get(i).getValue() == 14){
                                //for now have it do a see the future
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                seeTheFuture = true;
                                cardGame.viewingCard = true;
                                repaint();
                                break;
                            }
                            if(cardGame.playersCard2.get(i).getValue() == 15){
                                //draw from the bottom
                                drawFromTheBottom = true;
                                cardGame.playersCard2.get(i).highlight();
                                cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                break;
                            }
                        }
                    }
                }
            }
            try {
                URL url = this.getClass().getClassLoader().getResource("play.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(url));
                clip.start();
            } catch (Exception exc) {
                exc.printStackTrace(System.out);
            }
            repaint();
        }
//        if (e.getSource() == getCard) {
//            //add a card to the playersDeck
//            if (!cardGame.viewingCard) {
//                cardGame.getCard();
//            }
//            if(cardGame.getDeck().size() == 0){
//                getCard.setEnabled(false);
//            }
//            if(cardGame.currentPlayer == 1){
//                cardGame.sort(1);
//            }else if(cardGame.currentPlayer == 2){
//                cardGame.sort(2);
//            }
//            //remove the top from the deck
//            //call repaint to update the paintComponent
////			System.out.println(cardGame.getGap());
//        }
        if (e.getSource() == startTurn) {
            startTurn.setVisible(false);
//            getCard.setEnabled(true);
            playerSwitch.setEnabled(true);
            playHand.setEnabled(true);
            rulesButton.setEnabled(true);
            cardGame.midSwitch = false;
            repaint();
        }
        if (e.getSource() == newGame) {
            if(currentScreen == 0){
                switchScreen();
            }else if(currentScreen == 2){
                cardGame = new CardGame(this);
                startTurn.setVisible(false);
                playerSwitch.setEnabled(true);
                playHand.setEnabled(true);
                rulesButton.setEnabled(true);
                currentScreen = 1;
            }
            if(cardGame.currentPlayer == 1){
                for (int j = 0; j < cardGame.playersCard.size(); j++) {
                    if(cardGame.playersCard.get(j).getSelected()){
                        cardGame.playersCard.get(j).highlight();
                    }
                    cardGame.playersCard.get(j).buttonEnabled(false);
                    cardGame.playersCard.get(j).viewButton.setVisible(false);
                    playerSwitch.setVisible(false);
                    playHand.setVisible(false);
                    rulesButton.setVisible(false);
                }
            }else if(cardGame.currentPlayer == 2){
                for (int j = 0; j < cardGame.playersCard2.size(); j++) {
                    if(cardGame.playersCard2.get(j).getSelected()){
                        cardGame.playersCard2.get(j).highlight();
                    }
                    cardGame.playersCard2.get(j).buttonEnabled(false);
                    cardGame.playersCard2.get(j).viewButton.setVisible(false);
                    playerSwitch.setVisible(false);
                    playHand.setVisible(false);
                    rulesButton.setVisible(false);
                }
            }
            repaint();
        }
        if (e.getSource() == rulesButton) {
            closeButton.setBounds(960, 0, 40, 40); //x,y,width,height
            closeButton.setVisible(true);
            if (!viewingRules) {
                viewingRules = true;
            }
        }
        if (e.getSource() == playerSwitch) {
            switchPlayer();
        }
        if (e.getSource() == closeButton) {
            seeTheFuture = false;
            viewingRules = false;
            cardGame.viewingCard = false;
            for (int j = 0; j < cardGame.playersCard.size(); j++) {
                cardGame.playersCard.get(j).viewingCard = false;
                if(cardGame.playersCard.get(j).getSelected()){
                    cardGame.playersCard.get(j).viewButton.setVisible(true);
                    cardGame.playersCard.get(j).buttonEnabled(true);
                }
            }
            for (int j = 0; j < cardGame.playersCard2.size(); j++) {
                cardGame.playersCard2.get(j).viewingCard = false;
                if(cardGame.playersCard2.get(j).getSelected()){
                    cardGame.playersCard2.get(j).viewButton.setVisible(true);
                    cardGame.playersCard2.get(j).buttonEnabled(true);
                }
            }
//            getCard.setVisible(true);
            playerSwitch.setVisible(true);
            playHand.setVisible(true);
            rulesButton.setVisible(true);
            closeButton.setVisible(false);
            if(cardGame.getDeck().size()>0){
//                getCard.setEnabled(true);
            }
        }
        requestFocus();
        setFocusable(true);
        repaint();
    }


    public void mousePressed(MouseEvent e) {
        //Print location of x and y
        System.out.println("X: " + e.getX() + ", Y: " + e.getY());
        cardGame.selectCard(e.getX(), e.getY());
        repaint();
    }

    public void switchAttackStack(){
        attacks += 2;
        //add a card to the playersDeck
        startTurn.setVisible(true);
//            getCard.setEnabled(false);
        playerSwitch.setEnabled(false);
        playHand.setEnabled(false);
        rulesButton.setEnabled(false);
        cardGame.midSwitch = true;

        if(skip){
            skip = false;
        }else{
            if(cardGame.deck.size() > 0){
                if(drawFromTheBottom){
                    cardGame.getCard(drawFromTheBottom);
                    if(cardGame.deck.size() > 0){
                        if(cardGame.deck.get(cardGame.deck.size()-1).getValue() == 99){
                            try {
                                URL url = this.getClass().getClassLoader().getResource("explosion.wav");
                                Clip clip = AudioSystem.getClip();
                                clip.open(AudioSystem.getAudioInputStream(url));
                                clip.start();
                            } catch (Exception exc) {
                                exc.printStackTrace(System.out);
                            }
                        }
                    }
                }else{
                    cardGame.getCard();
                    if(cardGame.deck.size() > 0){
                        if(cardGame.deck.get(0).getValue() == 99){
                            try {
                                URL url = this.getClass().getClassLoader().getResource("explosion.wav");
                                Clip clip = AudioSystem.getClip();
                                clip.open(AudioSystem.getAudioInputStream(url));
                                clip.start();
                            } catch (Exception exc) {
                                exc.printStackTrace(System.out);
                            }
                        }
                    }
                }
            }
        }
        if(cardGame.currentPlayer == 1){
            cardGame.currentPlayer = 2;
            for(int i = 0; i<cardGame.playersCard.size(); i++){
                if(cardGame.playersCard.get(i).isSelected){
                    cardGame.playersCard.get(i).highlight();
                }
            }
            cardGame.shuffle(1);
            cardGame.sort(2);
        }else if(cardGame.currentPlayer == 2){
            cardGame.currentPlayer = 1;
            for(int i = 0; i<cardGame.playersCard2.size(); i++){
                if(cardGame.playersCard2.get(i).isSelected){
                    cardGame.playersCard2.get(i).highlight();
                }
            }
            cardGame.shuffle(2);
            cardGame.sort(1);
        }
        //remove the top from the deck
        //call repaint to update the paintComponent
//			System.out.println(cardGame.getGap());
    }

    public void switchPlayer(){
        if(attacks == 0){
            //add a card to the playersDeck
            startTurn.setVisible(true);
//            getCard.setEnabled(false);
            playerSwitch.setEnabled(false);
            playHand.setEnabled(false);
            rulesButton.setEnabled(false);
            cardGame.midSwitch = true;

            if(skip){
                skip = false;
            }else{
                if(cardGame.deck.size() > 0){
                    if(drawFromTheBottom){
                        cardGame.getCard(drawFromTheBottom);
                        cardGame.sort(cardGame.currentPlayer);
                    }else{
                        cardGame.getCard();
                        cardGame.sort(cardGame.currentPlayer);
                    }
                    if(cardGame.currentPlayer == 1){
                        if(cardGame.playersCard.get(cardGame.playersCard.size()-1).getValue() == 99) {
                            try {
                                URL url = this.getClass().getClassLoader().getResource("explosion.wav");
                                Clip clip = AudioSystem.getClip();
                                clip.open(AudioSystem.getAudioInputStream(url));
                                clip.start();
                            } catch (Exception exc) {
                                exc.printStackTrace(System.out);
                            }
                            for (int i = 0; i < cardGame.playersCard.size(); i++) {
                                if (cardGame.playersCard.get(i).getValue() == 1) {
                                    cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                    int rand = (int) (Math.random() * cardGame.deck.size());
                                    cardGame.deck.add(rand, cardGame.playersCard.remove(cardGame.playersCard.size() - 1));
                                    break;
                                }
                            }
                        }
                        cardGame.sort(cardGame.currentPlayer);
                        if(cardGame.playersCard.get(cardGame.playersCard.size()-1).getValue() == 99){
                            //end game
                            System.out.println("Death 1");
                            switchScreen();
                        }
                    }else if(cardGame.currentPlayer == 2){
                        if(cardGame.playersCard2.get(cardGame.playersCard2.size()-1).getValue() == 99) {
                            try {
                                URL url = this.getClass().getClassLoader().getResource("explosion.wav");
                                Clip clip = AudioSystem.getClip();
                                clip.open(AudioSystem.getAudioInputStream(url));
                                clip.start();
                            } catch (Exception exc) {
                                exc.printStackTrace(System.out);
                            }
                            for (int i = 0; i < cardGame.playersCard2.size(); i++) {
                                if (cardGame.playersCard2.get(i).getValue() == 1) {
                                    cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                    int rand = (int) (Math.random() * cardGame.deck.size());
                                    cardGame.deck.add(rand, cardGame.playersCard2.remove(cardGame.playersCard2.size() - 1));
                                    break;
                                }
                            }
                        }
                        cardGame.sort(cardGame.currentPlayer);
                        if(cardGame.playersCard2.get(cardGame.playersCard2.size()-1).getValue() == 99){
                            //end game
                            System.out.println("Death 2");
                            switchScreen();
                        }
                    }
                }
            }
            if(cardGame.currentPlayer == 1){
                cardGame.currentPlayer = 2;
                for(int i = 0; i<cardGame.playersCard.size(); i++){
                    if(cardGame.playersCard.get(i).isSelected){
                        cardGame.playersCard.get(i).highlight();
                    }
                }
                cardGame.shuffle(1);
                cardGame.sort(2);
            }else if(cardGame.currentPlayer == 2){
                cardGame.currentPlayer = 1;
                for(int i = 0; i<cardGame.playersCard2.size(); i++){
                    if(cardGame.playersCard2.get(i).isSelected){
                        cardGame.playersCard2.get(i).highlight();
                    }
                }
                cardGame.shuffle(2);
                cardGame.sort(1);
            }
            //remove the top from the deck
            //call repaint to update the paintComponent
//			System.out.println(cardGame.getGap());
        }else{
            if(cardGame.deck.size() > 0){
                if(drawFromTheBottom){
                    cardGame.getCard(drawFromTheBottom);
                    cardGame.sort(cardGame.currentPlayer);
                    if(cardGame.currentPlayer == 1){
                        if(cardGame.playersCard.get(cardGame.playersCard.size()-1).getValue() == 99) {
                            try {
                                URL url = this.getClass().getClassLoader().getResource("explosion.wav");
                                Clip clip = AudioSystem.getClip();
                                clip.open(AudioSystem.getAudioInputStream(url));
                                clip.start();
                            } catch (Exception exc) {
                                exc.printStackTrace(System.out);
                            }
                            for (int i = 0; i < cardGame.playersCard.size(); i++) {
                                if (cardGame.playersCard.get(i).getValue() == 1) {
                                    cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                    int rand = (int) (Math.random() * cardGame.deck.size());
                                    cardGame.deck.add(rand, cardGame.playersCard.remove(cardGame.playersCard.size() - 1));
                                    break;
                                }
                            }
                        }
                        cardGame.sort(cardGame.currentPlayer);
                        if(cardGame.playersCard.get(cardGame.playersCard.size()-1).getValue() == 99){
                            //end game
                            System.out.println("Death 1");
                            switchScreen();
                        }
                    }else if(cardGame.currentPlayer == 2){
                        if(cardGame.playersCard2.get(cardGame.playersCard2.size()-1).getValue() == 99) {
                            try {
                                URL url = this.getClass().getClassLoader().getResource("explosion.wav");
                                Clip clip = AudioSystem.getClip();
                                clip.open(AudioSystem.getAudioInputStream(url));
                                clip.start();
                            } catch (Exception exc) {
                                exc.printStackTrace(System.out);
                            }
                            for (int i = 0; i < cardGame.playersCard2.size(); i++) {
                                if (cardGame.playersCard2.get(i).getValue() == 1) {
                                    cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                    int rand = (int) (Math.random() * cardGame.deck.size());
                                    cardGame.deck.add(rand, cardGame.playersCard2.remove(cardGame.playersCard2.size() - 1));
                                    break;
                                }
                            }
                        }
                        cardGame.sort(cardGame.currentPlayer);
                        if(cardGame.playersCard2.get(cardGame.playersCard2.size()-1).getValue() == 99){
                            //end game
                            System.out.println("Death 2");
                            switchScreen();
                        }
                    }
                }else{
                    if(skip){
                        skip = false;
                    }else{
                        cardGame.getCard();
                        cardGame.sort(cardGame.currentPlayer);
                        if(cardGame.currentPlayer == 1){
                            if(cardGame.playersCard.get(cardGame.playersCard.size()-1).getValue() == 99) {
                                try {
                                    URL url = this.getClass().getClassLoader().getResource("explosion.wav");
                                    Clip clip = AudioSystem.getClip();
                                    clip.open(AudioSystem.getAudioInputStream(url));
                                    clip.start();
                                } catch (Exception exc) {
                                    exc.printStackTrace(System.out);
                                }
                                for (int i = 0; i < cardGame.playersCard.size(); i++) {
                                    if (cardGame.playersCard.get(i).getValue() == 1) {
                                        cardGame.getDiscard().add(cardGame.playersCard.remove(i));
                                        int rand = (int) (Math.random() * cardGame.deck.size());
                                        cardGame.deck.add(rand, cardGame.playersCard.remove(cardGame.playersCard.size() - 1));
                                        break;
                                    }
                                }
                            }
                            cardGame.sort(cardGame.currentPlayer);
                            if(cardGame.playersCard.get(cardGame.playersCard.size()-1).getValue() == 99){
                                //end game
                                System.out.println("Death 1");
                                switchScreen();
                            }
                        }else if(cardGame.currentPlayer == 2){
                            if(cardGame.playersCard2.get(cardGame.playersCard2.size()-1).getValue() == 99) {
                                try {
                                    URL url = this.getClass().getClassLoader().getResource("explosion.wav");
                                    Clip clip = AudioSystem.getClip();
                                    clip.open(AudioSystem.getAudioInputStream(url));
                                    clip.start();
                                } catch (Exception exc) {
                                    exc.printStackTrace(System.out);
                                }
                                for (int i = 0; i < cardGame.playersCard2.size(); i++) {
                                    if (cardGame.playersCard2.get(i).getValue() == 1) {
                                        cardGame.getDiscard().add(cardGame.playersCard2.remove(i));
                                        int rand = (int) (Math.random() * cardGame.deck.size());
                                        cardGame.deck.add(rand, cardGame.playersCard2.remove(cardGame.playersCard2.size() - 1));
                                        break;
                                    }
                                }
                            }
                            cardGame.sort(cardGame.currentPlayer);
                            if(cardGame.playersCard2.get(cardGame.playersCard2.size()-1).getValue() == 99){
                                //end game
                                System.out.println("Death 2");
                                switchScreen();
                            }
                        }
                    }
                }
            }
            attacks--;
        }
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }



    public void keyPressed(KeyEvent e) {
        //To test this, make sure you click on the graphical window.
        //Do not click on the console window.
        //You can see the number for each key by looking at the output below.
//        System.out.println("key code: " + e.getKeyCode());

        if(viewingRules){
            closeButton.setVisible(true);
            if (e.getKeyCode() == 38 && cardGame.rulesY != 0) {
                cardGame.rulesY += 25;
            }
            if (e.getKeyCode() == 40 && cardGame.rulesY != -900) {
                cardGame.rulesY -= 25;
            }
            if (e.getKeyCode() == 39 || e.getKeyCode() == 37) {
//                getCard.setVisible(false);
                playerSwitch.setVisible(false);
                playHand.setVisible(false);
                rulesButton.setVisible(false);
                for (int j = 0; j < cardGame.playersCard.size(); j++) {
                    cardGame.playersCard.get(j).buttonEnabled(false);
                    cardGame.playersCard.get(j).viewButton.setVisible(false);
                }
                for (int j = 0; j < cardGame.playersCard2.size(); j++) {
                    cardGame.playersCard2.get(j).buttonEnabled(false);
                    cardGame.playersCard2.get(j).viewButton.setVisible(false);
                }
                if(cardGame.rulePage == 1){
                    cardGame.rulesY = 0;
                    cardGame.rulePage = 2;
                }else if(cardGame.rulePage == 2){
                    cardGame.rulesY = 0;
                    cardGame.rulePage = 1;
                }
            }
        }else{
            if (e.getKeyCode() == 79) {
                switchScreen();
            }
        }
        repaint();
    }

    public void switchScreen(){
        if(currentScreen == 2){
            currentScreen = 0;
        }else{
            currentScreen++;
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
