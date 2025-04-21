import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Perlin {
    private int gridFactor;
    private int gridSize;
    private Square[][] grid;
    private Vector[][] vectors;
    private int size;
    private boolean isDrawn = false;

    public Perlin(int factor, int size, double arrowLength){
        this.gridFactor = factor;
        this.size = size;
        gridSize = (int) Math.pow(2, gridFactor);
        grid = new Square[gridSize][gridSize];
        vectors = new Vector[gridSize+1][gridSize+1];
        for(int i = 0; i< vectors.length; i++){
            for(int j = 0; j< vectors[i].length; j++){
                vectors[i][j] = new Vector(size, arrowLength);
            }
        }
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[i].length; j++){
                grid[i][j] = new Square(size, j, i, 50, 50, vectors);
            }
        }
    }

    public void dotProduct(){
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[i].length; j++){
                double dotProduct = 255 * (vectors[i][j].xDist/size) * (vectors[i+1][j].xDist/size) * (vectors[i][j+1].xDist/size) * (vectors[i+1][j+1].xDist/size) + (vectors[i][j].xDist/size) * (vectors[i+1][j].xDist/size) * (vectors[i][j+1].xDist/size) * (vectors[i+1][j+1].xDist/size);
            }
        }
    }

    public void drawMe(Graphics g){
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[i].length; j++){
                grid[i][j].drawMe(g);
            }
        }
        for(int i = 0; i< vectors.length; i++){
            for(int j = 0; j< vectors[i].length; j++){
                vectors[i][j].drawMe(g, j, i, 50, 50);
            }
        }
        if(!isDrawn){
//            System.out.println("dotProd = " + vectors[1][1].getDotProduct(0.5, 0.5, 1) + "");
        }
        isDrawn = true;
//        grid[0][0];
    }
}
