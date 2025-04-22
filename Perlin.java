import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Perlin {
    private int gridResolution;
    private int gridSize;
    private int size; // gridResolution * gridSize

    private double[][] pixels;
    private Vector[][] vectors;

    public Perlin(int gridSize, int gridResolution) {
        // all of the size stuff gets set here
        this.gridResolution = gridResolution;
        this.gridSize = gridSize;
        this.size = gridSize * gridResolution;

        // 2 2d arrays made, one for every pixel, and one for every vector.
        // grid size refers to the width/height of the total grid, so to make sure there are vectors at the corners we do +1
        this.vectors = new Vector[gridSize + 1][gridSize + 1];
        // each pixel is a double should range from -1 to 1
        this.pixels = new double[size][size];

        // for every grid point, it makes a random angle in radians and sends  the
        for (int i = 0; i <= gridSize; i++) {
            for (int j = 0; j <= gridSize; j++) {
                double angle = Math.random() * 2 * Math.PI; // random angle in radians
                // this means the length of each vector can be no more than 1 pixel in length. fix this in the draw code
//                vectors[i][j] = new Vector((int)(Math.cos(angle) * gridResolution * Math.sqrt(2)/2), (int)(Math.sin(angle) * gridResolution * Math.sqrt(2)/2));
                vectors[i][j] = new Vector((int)(Math.cos(angle) / gridResolution * Math.sqrt(2)), (int)(Math.sin(angle) / gridResolution * Math.sqrt(2)));
            }
        }


        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                int closestVectorX = (int) (x+(0.5*gridResolution))/gridResolution;
                int closestVectorY = (int) (y+(0.5*gridResolution))/gridResolution;
//                int closestVectorX = (int)(Math.random() * ((double)x / gridResolution));
//                int closestVectorY = (int)(Math.random() * ((double)y / gridResolution));
//                int closestVectorX = (int)Math.random((double)x / gridResolution);
//                int closestVectorY = (int)Math.random((double)y / gridResolution);
                Vector closestVector = vectors[closestVectorY][closestVectorX];

                // (x,y)'s displacement from the base of closestVector
                // i add 0.5 to each of them to signify the center of the pixel, instead of the top left (i don't know if the effect of doing this is significant though)
                Vector displacementVector = new Vector(closestVectorX * gridResolution, closestVectorY * gridResolution, x, y);                double dotProduct = closestVector.dotProduct(displacementVector);
                pixels[y][x] = dotProduct;
//                pixels[y][x] = dotProduct / Math.sqrt(2) / gridResolution; // ** the (*) disclaimer is only true if you start doing the interpolation step. without interpolation, your maximum value for the dot product and therefore your pixel value is √2 * gridResolution. this division here make the values in pixels all within the range [-1.0, 1.0] (***: untested and unverified. i only know that the (*) disclaimer is true)
//                if(x == 1 && y % 50 == 0){
//                    System.out.println(pixels[x][y]);
//                }
            }
        }
    }

    public void drawMe(Graphics g){
        for (int i = 0; i <= pixels.length-1; i++) {
            for (int j = 0; j <= pixels[i].length-1; j++) {
                // turns each pixel's color to a float from 0 to 1
                float colorVal = (float) ((pixels[i][j] + 1) / 2);
                if(colorVal > 1){
                    colorVal = 1;
                }else if(colorVal <0){
                    colorVal=0;
                }
                g.setColor(new Color(colorVal, colorVal, colorVal));
                g.drawRect(i, j, 1, 1);
            }
        }
        for (int i = 0; i <= vectors.length-1; i++) {
            for (int j = 0; j <= vectors[i].length-1; j++) {
                g.setColor(Color.RED);
                vectors[i][j].drawMe(g, i*gridResolution, j*gridResolution, size);
            }
        }
    }
}