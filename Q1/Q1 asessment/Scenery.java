import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

//(1) What is imported to get Graphics to work?
public class Scenery extends JPanel {

    private int timeChoice;
    private int weatherChoice;
    private Color day = new Color(150, 190, 215);
    private Color night = new Color(32, 27, 47);
    private Color sun = new Color(240, 240, 0);
    private Color sunRays = new Color(191,213,133);
    private Color cloud = new Color(140, 160, 168);
    private Color rain = new Color(41, 84, 171);
    private Color base = new Color(175, 124, 105);
    private Color body = new Color(69, 177, 163);
    private Color flame = new Color(244, 206, 128);
    private Color water = new Color(70, 100, 200);
    private Color shadow = new Color(0, 0, 0);
    private Color sunShadow = new Color(64, 64, 0);
    private Color boat = new Color(255,251,252);
    private Color bird1 = new Color(207, 207, 207);
    private Color bird2 = new Color(186, 186, 186);
    private Color bird3 = new Color(145, 145, 145);
    private Color bird4 = new Color(94, 94, 94);

    public Scenery(int timeChoice, int weatherChoice){
        //sets weatherChoice(here) to the weatherChoice in the runner
        this.timeChoice = timeChoice;
        this.weatherChoice = weatherChoice;
    }
    @Override
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(800, 600);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (timeChoice == 1){
            g.setColor(day);
            g.fillRect(0, 0, 800, 600);
        } else {
            g.setColor(night);
            g.fillRect(0, 0, 800, 600);
        }

        //light beams go here, in front of sky but behind sun
        

        if (weatherChoice == 1){
            g.setColor(sunRays);
            int[] xPoints = {0, 0, 80, 95, 500}; // X coordinates of the triangle vertices
            int[] yPoints = {0, 600, 600, 200, 0}; // Y coordinates of the triangle vertices
            int numPoints = 5;
            g.fillPolygon(xPoints, yPoints, numPoints);
            g.setColor(sun);
            g.fillOval(0, 215, 75, 75);
            drawSilhouette(g);
            drawSunShadow(g);
            
        } else if (weatherChoice == 2){
            drawSilhouette(g);
            g.setColor(cloud);
            g.fillOval(-150, -20, 200, 100);
            g.fillOval(-50, -20, 200, 100);
            g.fillOval(50, -20, 200, 100);
            g.fillOval(150, -20, 200, 100);
            g.fillOval(250, -20, 200, 100);
            g.fillOval(350, -20, 200, 100);
            g.fillOval(450, -20, 200, 100);
            g.fillOval(550, -20, 200, 100);
            g.fillOval(650, -20, 200, 100);
            g.fillOval(750, -20, 200, 100);
        } else {
            { //rain
            drawSilhouette(g);
            g.setColor(rain);
            g.fillRect(25, 0, 1, 800);
            g.fillRect(50, 0, 1, 800);
            g.fillRect(75, 0, 1, 800);
            g.fillRect(100, 0, 1, 800);
            g.fillRect(125, 0, 1, 800);
            g.fillRect(150, 0, 1, 800);
            g.fillRect(175, 0, 1, 800);
            g.fillRect(200, 0, 1, 800);
            g.fillRect(225, 0, 1, 800);
            g.fillRect(250, 0, 1, 800);
            g.fillRect(275, 0, 1, 800);
            g.fillRect(300, 0, 1, 800);
            g.fillRect(325, 0, 1, 800);
            g.fillRect(350, 0, 1, 800);
            g.fillRect(375, 0, 1, 800);
            g.fillRect(400, 0, 1, 800);
            g.fillRect(425, 0, 1, 800);
            g.fillRect(450, 0, 1, 800);
            g.fillRect(475, 0, 1, 800);
            g.fillRect(500, 0, 1, 800);
            g.fillRect(525, 0, 1, 800);
            g.fillRect(550, 0, 1, 800);
            g.fillRect(575, 0, 1, 800);
            g.fillRect(600, 0, 1, 800);
            g.fillRect(625, 0, 1, 800);
            g.fillRect(650, 0, 1, 800);
            g.fillRect(675, 0, 1, 800);
            g.fillRect(700, 0, 1, 800);
            g.fillRect(725, 0, 1, 800);
            g.fillRect(750, 0, 1, 800);
            g.fillRect(775, 0, 1, 800);
            g.fillRect(800, 0, 1, 800);
            }
            { //clouds
            g.setColor(cloud);
            g.fillOval(-150, -20, 200, 100);
            g.fillOval(-50, -20, 200, 100);
            g.fillOval(50, -20, 200, 100);
            g.fillOval(150, -20, 200, 100);
            g.fillOval(250, -20, 200, 100);
            g.fillOval(350, -20, 200, 100);
            g.fillOval(450, -20, 200, 100);
            g.fillOval(550, -20, 200, 100);
            g.fillOval(650, -20, 200, 100);
            g.fillOval(750, -20, 200, 100);
            }
        }

        //add main objects here
        // liberty, skyline, birds x4(different colors), boat /////////////////////////////////////////////////<visibility
        //drawSilhouette(g);
        g.setColor(water);
        g.fillRect(0, 325, 800, 425);
        g.setColor(base);
        g.fillRect(0, 320, 800, 5);
        drawLiberty(g);
        drawBird1(g);
        drawBird2(g);
        drawBird3(g);
        drawBird4(g);
        drawBoat(g);

    }
    /*
        MAKE SEPERATE METHODS FOR EACH BIRD (ex public void bird1...)
    */
    public void drawBird1(Graphics g){
        g.setColor(bird1);
        int[] xPoints = {600, 620, 640, 620}; // X coordinates of the triangle vertices
        int[] yPoints = {60, 80, 60, 70}; // Y coordinates of the triangle vertices
        int numPoints = 4;
        g.fillPolygon(xPoints, yPoints, numPoints);
    }
    public void drawBird2(Graphics g){
        g.setColor(bird2);
        int[] xPoints2 = {640, 660, 680, 660}; // X coordinates of the triangle vertices
        int[] yPoints2 = {90, 110, 90, 100}; // Y coordinates of the triangle vertices
        int numPoints2 = 4;
        g.fillPolygon(xPoints2, yPoints2, numPoints2);
    }
    public void drawBird3(Graphics g){
        g.setColor(bird3);
        int[] xPoints3 = {675, 695, 715, 695}; // X coordinates of the triangle vertices
        int[] yPoints3 = {45, 65, 45, 55}; // Y coordinates of the triangle vertices
        int numPoints3 = 4;
        g.fillPolygon(xPoints3, yPoints3, numPoints3);
    }
    public void drawBird4(Graphics g){
        g.setColor(bird4);
        int[] xPoints4 = {700, 720, 740, 720}; // X coordinates of the triangle vertices
        int[] yPoints4 = {60, 80, 60, 70}; // Y coordinates of the triangle vertices
        int numPoints4 = 4;
        g.fillPolygon(xPoints4, yPoints4, numPoints4);
    }
    public void drawBoat(Graphics g){
        g.setColor(boat);
        int[] xPoints = {540, 560, 640, 650}; // X coordinates of the triangle vertices
        int[] yPoints = {430, 465, 465, 430}; // Y coordinates of the triangle vertices
        int numPoints = 4;
        g.fillPolygon(xPoints, yPoints, numPoints);
    }
    public void drawSilhouette(Graphics g){
        g.setColor(shadow);
        g.fillRect(0, 250, 80, 600);
        g.fillRect(80, 200, 100, 600);
        g.fillRect(180, 220, 200, 600);
        g.fillRect(380, 75, 80, 600);
        g.fillRect(460, 175, 180, 600);
        g.fillRect(640, 120, 90, 600);
        g.fillRect(730, 160, 200, 600);
    }
    public void drawSunShadow(Graphics g){
        g.setColor(sunShadow);
        g.fillRect(0, 250, 95, 15);
        g.fillRect(80, 200, 15, 50);
    }
    public void drawLiberty(Graphics g){
        int[] xPoints = {210, 230, 250, 230}; // X coordinates of the triangle vertices
        int[] yPoints = {150, 200, 150, 125}; // Y coordinates of the triangle vertices
        int numPoints = 4;
        g.setColor(flame);
        g.fillPolygon(xPoints, yPoints, numPoints);
        g.setColor(body);
        g.fillRect(275, 250, 100, 200);
        g.fillOval(275, 150, 100, 100);
        g.fillRect(225, 275, 50, 30);
        g.fillRect(215, 200, 30, 105);
        g.fillRect(205, 180, 50, 20);
        g.setColor(base);
        g.fillRect(225, 425, 200, 50);
    }
}