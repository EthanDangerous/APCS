import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class GameScreen extends Screen {
    public static int width;
    public static int height;
    public static String player1;
    public static String player2;
    public static String initial1;
    public static String initial2;
    public static String turn;
    private int p1Points = 0;
    private int p2Points = 0;
    private Color color1;
    private Color color2;
    public static int scWidth;
    public static int scHeight;
    private int size;
    private StartScreen startScreen;

    public static Dot[][] dots;
    public static Box[][] boxes;

    public GameScreen(int scWidth, int scHeight, int width, int height, int size, String player1, String player2, String initial1, String initial2, Color color1, Color color2, StartScreen startScreen) {
        super(scWidth, scHeight);
        this.width = width;
        this.height = height;
        this.scWidth = scWidth;
        this.scHeight = scHeight;
        this.turn = player1;
        this.player1 = player1;
        this.player2 = player2;
        this.size = size;
        this.color1 = color1;
        this.color2 = color2;
        this.initial1 = initial1;
        this.initial2 = initial2;
        this.startScreen = startScreen;

//        System.out.println("player 1 initial: " + initial1);
//        System.out.println("player 2 initial: " + initial2);
//        System.out.println("current player: " + turn);

        // start making all of the boxes
        boxes = new Box[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.boxes[i][j] = new Box(size, i, j, super.get());
            }
        }
        dots = new Dot[width + 1][height + 1];
        for (int i = 0; i < width + 1; i++) {
            for (int j = 0; j < height + 1; j++) {
                this.dots[i][j] = new Dot(size / 6, size);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(201, 255, 254));
        g.fillRect(0, 0, super.width, super.height);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                boxes[i][j].drawMe(g, i, j, (scWidth / 2) - ((width * boxes[0][0].size) / 2), (scHeight / 2) - ((height * boxes[0][0].size) / 2));
            }
        }

        drawMousePos(g);

        for (int i = 0; i < width + 1; i++) {
            for (int j = 0; j < height + 1; j++) {
                dots[i][j].drawMe(g, i, j, (scWidth / 2) - ((width * boxes[0][0].size) / 2), (scHeight / 2) - ((height * boxes[0][0].size) / 2));
            }
        }

        Font font = new Font("Arial", Font.PLAIN, 50);
        Font boldFont = new Font("Bold", Font.BOLD, 50);
        if (turn.equals(player1)) {
            g.setFont(boldFont);
            g.setColor(color1);
            g.drawString(player1 + ": " + p1Points, 30, 50);
            g.setFont(font);
            g.setColor(color2);
            g.drawString(player2 + ": " + p2Points, 30, 100);
        } else {
            g.setFont(font);
            g.setColor(color1);
            g.drawString(player1 + ": " + p1Points, 30, 50);
            g.setFont(boldFont);
            g.setColor(color2);
            g.drawString(player2 + ": " + p2Points, 30, 100);
        }
    }

    // CHECK FOR GLOBAL COORDS AND NOT RELATIVE TO FIRST POSITION?

    public void drawMousePos(Graphics g) {
        try {
            int mouseX = Runner.frame.getMousePosition().x - 6;
            int mouseY = Runner.frame.getMousePosition().y - 30;

            double calcX = mouseX - scWidth / 2;
            double calcY = mouseY - scHeight / 2;

            calcX += width * boxes[0][0].size / 2;
            calcY += height * boxes[0][0].size / 2;

            calcX /= (double) boxes[0][0].size;
            calcY /= (double) boxes[0][0].size;

            int roundCalcX = (int) (calcX + 0.5);
            int roundCalcY = (int) (calcY + 0.5);

            double relativeX = calcX - roundCalcX + 0.5;
            double relativeY = calcY - roundCalcY + 0.5;

            //THIS IS THE CALCULATIONS FOR THE 2 DOTS TO CONNECT
            int compX = dots[0][0].x;
            int compY = dots[0][0].y;
            int compXF = dots[width][height].x;
            int compYF = dots[width][height].y;
            //checks to make sure you are on the grid before calculating
            if ((mouseX > compX && mouseY > compY) && (mouseX < compXF && mouseY < compYF)) {
                if (relativeX < 0.5 && relativeY < 0.5) {
                    if (relativeX > relativeY) {
                        //up
                        drawHighlight(g, roundCalcX, roundCalcY, 0);
                    } else {
                        //left
                        drawHighlight(g, roundCalcX, roundCalcY, 3);
                    }
                } else if (relativeX < 0.5 && relativeY > 0.5) {
                    if (relativeX > 1 - relativeY) {
                        //down
                        drawHighlight(g, roundCalcX, roundCalcY, 2);
                    } else {
                        //left
                        drawHighlight(g, roundCalcX, roundCalcY, 3);
                    }
                } else if (relativeX > 0.5 && relativeY < 0.5) {
                    if (relativeX > 1 - relativeY) {
                        //right
                        drawHighlight(g, roundCalcX, roundCalcY, 1);
                    } else {
                        //up
                        drawHighlight(g, roundCalcX, roundCalcY, 0);
                    }
                } else {
                    if (relativeX > relativeY) {
                        //right
                        drawHighlight(g, roundCalcX, roundCalcY, 1);
                    } else {
                        //down
                        drawHighlight(g, roundCalcX, roundCalcY, 2);
                    }
                }
            }
        } catch (NullPointerException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void drawHighlight(Graphics g, int row, int col, int dir) {
        // dir goes 0-1-2-3 and corresponds with u-r-d-l
        if (turn.equals(player1)) {
            g.setColor(new Color(color1.getRed(), color1.getGreen(), color1.getBlue(), 155));
        } else {
            g.setColor(new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), 155));
        }
        //size/8 should be the width
        int x = dots[row][col].x;
        int y = dots[row][col].y;
        switch (dir) {
            case 0:
                g.fillRect(x - size / 20, y - size, size / 10, size);
                break;
            case 1:
                g.fillRect(x, y - size / 20, size, size / 10);
                break;
            case 2:
                g.fillRect(x - size / 20, y, size / 10, size);
                break;
            case 3:
                g.fillRect(x - size, y - size / 20, size, size / 10);
                break;
            default:
                break;
        }
    }

    public void clickAction() {
        try {
            int mouseX = Runner.frame.getMousePosition().x - 6;
            int mouseY = Runner.frame.getMousePosition().y - 30;

            double calcX = mouseX - scWidth / 2;
            double calcY = mouseY - scHeight / 2;

            calcX += width * boxes[0][0].size / 2;
            calcY += height * boxes[0][0].size / 2;

            calcX /= (double) boxes[0][0].size;
            calcY /= (double) boxes[0][0].size;

            int roundCalcX = (int) (calcX + 0.5);
            int roundCalcY = (int) (calcY + 0.5);

            double relativeX = calcX - roundCalcX + 0.5;
            double relativeY = calcY - roundCalcY + 0.5;

            //THIS IS THE CALCULATIONS FOR THE 2 DOTS TO CONNECT
            int compX = dots[0][0].x;
            int compY = dots[0][0].y;
            int compXF = dots[width][height].x;
            int compYF = dots[width][height].y;
            //checks to make sure you are on the grid before calculating
            ArrayList<Boolean> success = new ArrayList<Boolean>();
            success.add(false);
            if ((mouseX > compX && mouseY > compY) && (mouseX < compXF && mouseY < compYF)) {
                if (relativeX < 0.5 && relativeY < 0.5) {
                    if (relativeX > relativeY) {
                        //up
                        if (roundCalcY > 0) {
                            if (roundCalcX > 0) {
                                success.add(boxes[roundCalcX - 1][roundCalcY - 1].addLine(1, getCurrentColor()));
                            }
                            if (roundCalcX < boxes.length) {
                                success.add(boxes[roundCalcX][roundCalcY - 1].addLine(3, getCurrentColor()));
                            }
                        }
                    } else {
                        //left
                        if (roundCalcX > 0) {
                            if (roundCalcY > 0) {
                                success.add(boxes[roundCalcX - 1][roundCalcY - 1].addLine(2, getCurrentColor()));
                            }
                            if (roundCalcY < boxes[0].length) {
                                success.add(boxes[roundCalcX - 1][roundCalcY].addLine(0, getCurrentColor()));
                            }
                        }
                    }
                } else if (relativeX < 0.5 && relativeY > 0.5) {
                    if (relativeX > 1 - relativeY) {
                        //down
                        if (roundCalcX > 0) {
                            success.add(boxes[roundCalcX - 1][roundCalcY].addLine(1, getCurrentColor()));
                        }
                        if (roundCalcX < boxes.length) {
                            success.add(boxes[roundCalcX][roundCalcY].addLine(3, getCurrentColor()));
                        }
                    } else {
                        //left
                        if (roundCalcX > 0) {
                            if (roundCalcY > 0) {
                                success.add(boxes[roundCalcX - 1][roundCalcY - 1].addLine(2, getCurrentColor()));
                            }
                            success.add(boxes[roundCalcX - 1][roundCalcY].addLine(0, getCurrentColor()));
                        }
                    }
                } else if (relativeX > 0.5 && relativeY < 0.5) {
                    if (relativeX > 1 - relativeY) {
                        //right
                        if (roundCalcY > 0) {
                            success.add(boxes[roundCalcX][roundCalcY - 1].addLine(2, getCurrentColor()));
                        }
                        if (roundCalcY < boxes[0].length) {
                            success.add(boxes[roundCalcX][roundCalcY].addLine(0, getCurrentColor()));
                        }
                    } else {
                        //up
                        if (roundCalcY > 0) {
                            if (roundCalcX > 0) {
                                success.add(boxes[roundCalcX - 1][roundCalcY - 1].addLine(1, getCurrentColor()));
                            }
                            success.add(boxes[roundCalcX][roundCalcY - 1].addLine(3, getCurrentColor()));
                        }
                    }
                } else {
                    if (relativeX > relativeY) {
                        //right
                        if (roundCalcY > 0) {
                            success.add(boxes[roundCalcX][roundCalcY - 1].addLine(2, getCurrentColor()));
                        }
                        success.add(boxes[roundCalcX][roundCalcY].addLine(0, getCurrentColor()));
                    } else {
                        //down
                        if (roundCalcX > 0) {
                            success.add(boxes[roundCalcX - 1][roundCalcY].addLine(1, getCurrentColor()));
                        }
                        success.add(boxes[roundCalcX][roundCalcY].addLine(3, getCurrentColor()));
                    }
                }
            }
            boolean isTrue = false;
            for (boolean bool : success) {
                if (bool) {
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue) {
                if(switchPlayer()){
                    super.draw();
                }
            }
            checkGameEnd();
        } catch (NullPointerException e) {
            Thread.currentThread().interrupt();
        }
    }

    public Color getCurrentColor() {
        if (turn.equals(player1)) {
            return color1;
        } else {
            return color2;
        }
    }

    public static String getTurnInitial() {
        if (turn.equals(player1)) {
            return initial1;
        } else {
            return initial2;
        }
    }

    public void checkGameEnd() {
        int filled = 0;
        int points1 = 0;
        int points2 = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (boxes[i][j].checkFull()) {
                    if (boxes[i][j].getOwner().equals(initial1)) {
                        points1++;
                    } else {
                        points2++;
                    }
                }
            }
        }
        p1Points = points1;
        p2Points = points2;
        if (p1Points + p2Points == width * height) {
            int result = 0;
//            System.out.println("GAME END");
            if (p1Points == p2Points) {
//                System.out.println("TIE GAME!");
            } else if (p1Points > p2Points) {
//                System.out.println("P1 WIN!");
                result = 1;
            } else {
//                System.out.println("P2 WIN!");
                result = 2;
            }
//            System.out.println("P1 points: " + p1Points);
//            System.out.println("P2 points: " + p2Points);
            super.newScreen(new EndScreen(player1, player2, p1Points, p2Points, scWidth, scHeight, result, startScreen));
        }
    }

    public static boolean switchPlayer() {
        try {
            // make sure it only flips if you are in the grid
            int mouseX = Runner.frame.getMousePosition().x - 6;
            int mouseY = Runner.frame.getMousePosition().y - 30;

            double calcX = mouseX - scWidth / 2;
            double calcY = mouseY - scHeight / 2;

            calcX += width * boxes[0][0].size / 2;
            calcY += height * boxes[0][0].size / 2;

            calcX /= (double) boxes[0][0].size;
            calcY /= (double) boxes[0][0].size;

            int roundCalcX = (int) (calcX + 0.5);
            int roundCalcY = (int) (calcY + 0.5);

            double relativeX = calcX - roundCalcX + 0.5;
            double relativeY = calcY - roundCalcY + 0.5;

            //THIS IS THE CALCULATIONS FOR THE 2 DOTS TO CONNECT
            int compX = dots[0][0].x;
            int compY = dots[0][0].y;
            int compXF = dots[width][height].x;
            int compYF = dots[width][height].y;

            if ((mouseX > compX && mouseY > compY) && (mouseX < compXF && mouseY < compYF)) {
                if (turn.equals(player1)) {
                    turn = player2;
//                    System.out.println("next player: " + turn);
                } else {
                    turn = player1;
//                    System.out.println("next player: " + turn);
                }
                return true;
            }
        } catch (NullPointerException e) {
            Thread.currentThread().interrupt();
        }
        return false;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 112) {
//            System.out.println("CHEAT KEY");
            super.newScreen(new EndScreen(player1, player2, p1Points, p2Points, scWidth, scHeight, 4, startScreen));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == 1 || e.getButton() == 2 || e.getButton() == 3) {
            clickAction();
        }
        repaint();
    }
}