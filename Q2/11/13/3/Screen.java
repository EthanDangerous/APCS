import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;



public class Screen extends JPanel {

    public Color sky = new Color(130, 150, 255);
    public Color ground = new Color(0, 55, 0);
    private int cloudX;
    private int cloudY;
    private Tree[] myTrees;
    private Cloud[] myClouds;
    public Screen(){
        myTrees = new Tree[100];
        myClouds = new Cloud[20];
        for (int i = 0; i < myClouds.length; i ++) {
            cloudX = (int) (Math.random() * 771);
            cloudY = (int) (Math.random() * 140);
            myClouds[i] = new Cloud(cloudX,cloudY);
        }
        for(int i = 0; i<myTrees.length; i++){
            int x = (int) (Math.random() * 771);
            int y = (int) (Math.random() * 316 + 255);
            myTrees[i] = new Tree(x, y);
        }
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(800,600);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(sky);
        g.fillRect(0, 0, 800, 600);

        g.setColor(ground);
        g.fillRect(0, 300, 800, 300);
        for (int i = 0; i < myClouds.length; i ++) {
            myClouds[i].drawMe(g);
        }
        for(int i = 0; i < myTrees.length; i++){
            myTrees[i].drawMe(g);
        }

    }

    public void animate() {
        while (true) {
            for (Cloud each : myClouds) {
                each.x++;
                if (each.x > 820) {
                    each.x = -50;
                }
            }
            //slow down
            try {
                Thread.sleep(10); //milliseconds
            } catch ( InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            //refresh the screen
            repaint();
        }
    }
}