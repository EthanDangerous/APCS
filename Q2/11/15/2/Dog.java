import java.awt.Graphics;
import java.awt.Color;

public class Dog{
    private int x;
    private int y;
    private int direction = 1; //1 is to the right 2 is to left 3 up 4 down

    private Color brown = new Color(125, 52, 42);

    public Dog(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g){
        g.setColor(brown);
        g.fillOval(x, y, 30, 20);
    }

    public void move(){
        int rand = (int) (Math.random() *100+1);
        if(rand==1){
            direction = (int)(Math.random() *4+1);
        }
        if(direction == 1 && x<800){
            x++;
        }else if(direction == 2 && x>0){
            x--;
        }else if(direction == 3 && y>0){
            y--;
        }else if(y<600){
            y++;
        }
    }
}