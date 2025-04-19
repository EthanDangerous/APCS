import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Square {
    private int squareSize;
    private Pixel[][] gradientGrid;
    int startX;
    int startY;


    public Square(int size, int x, int y, int coordX, int coordY, Vector[][] vectors){
        this.squareSize = size;
        startX = coordX + squareSize*x;
        startY = coordX + squareSize*y;
        gradientGrid = new Pixel[size][size];
        float dotProduct;
        for(int i = 0; i< gradientGrid.length; i++){
            for(int j = 0; j< gradientGrid[i].length; j++){
                Vector tempVec = new Vector(this.startX, this.startY, this.startX+i, this.startY+j);
                gradientGrid[i][j] = new Pixel(this.startX+i, this.startY+j);
                if(i<size/2){
                    if(j<size/2){
                        // top left
                        Vector grad = vectors[x][y];
                        double gradX = Math.cos(grad.direction);
                        double gradY = Math.sin(grad.direction);

                        gradientGrid[i][j].setDotProduct(
                                (tempVec.xDist/size) * gradX + (tempVec.yDist/size) * gradY
                        );
                    }else{
                        // top right
                        Vector grad = vectors[x+1][y];
                        double gradX = Math.cos(grad.direction);
                        double gradY = Math.sin(grad.direction);

                        gradientGrid[i][j].setDotProduct(
                                (tempVec.xDist/size) * gradX + (tempVec.yDist/size) * gradY
                        );
                    }
                }else{
                    if(j<size/2){
                        // bottom left
                        Vector grad = vectors[x][y+1];
                        double gradX = Math.cos(grad.direction);
                        double gradY = Math.sin(grad.direction);

                        gradientGrid[i][j].setDotProduct(
                                (tempVec.xDist/size) * gradX + (tempVec.yDist/size) * gradY
                        );
                    }else{
                        // bottom right
                        Vector grad = vectors[x+1][y+1];
                        double gradX = Math.cos(grad.direction);
                        double gradY = Math.sin(grad.direction);

                        gradientGrid[i][j].setDotProduct(
                                (tempVec.xDist/size) * gradX + (tempVec.yDist/size) * gradY
                        );
                    }
                }
            }
        }

    }

    public void drawMe(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(startX, startY, squareSize, squareSize);
        for(int i = 0; i< gradientGrid.length; i++){
            for(int j = 0; j< gradientGrid[i].length; j++){
                gradientGrid[i][j].drawMe(g);
            }
        }
        g.setColor(Color.CYAN);
        g.drawRect(startX, startY, squareSize, squareSize);
    }
}
