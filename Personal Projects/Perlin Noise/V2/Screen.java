import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

class Screen extends JPanel {

    private int x = 100;
    private Perlin perlin = new Perlin(20, 40);

    public Dimension getPreferredSize() {
//        return new Dimension(1920, 1080);
        return new Dimension(800, 800);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.setColor(Color.BLACK);

        perlin.drawMe(g);
    }
}