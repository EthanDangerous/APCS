import javax.swing.JFrame;

public class Runner {

    public static void main(String[] args) {
        //Create the frame.
        JFrame frame = new JFrame("Perlin");
        //What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create panel and add it to the frame
        Screen canvas = new Screen();
        frame.add(canvas);
        //Fit the preferred size its subcomponents.
        frame.pack();
        //Show it.
        frame.setVisible(true);
    }
}