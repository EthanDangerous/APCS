import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

/**
 * Abstract class representing a Sprite object.
 */
public abstract class Sprite {
    // Public color variable with RGB values (230, 255, 255) - light cyan
    public Color color = new Color(230, 255, 255);

    /**
     * Abstract method to draw the sprite.
     *
     * @param g The Graphics object to draw on
     * @param x The x coordinate for drawing
     * @param y The y coordinate for drawing
     * @param offsetX The x offset
     * @param offsetY The y offset
     */
    public abstract void drawMe(Graphics g, int x, int y, int offsetX, int offsetY);
}