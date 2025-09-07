
package npw;
import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SSquare;

public class RedSquares {
    private void paintTheImage() {


        SPainter tyler = new SPainter("square", 400, 400);
        SSquare dot = new SSquare(100);
        tyler.setColor(Color.BLUE);

        tyler.paint(dot);

    }


    public RedSquares() {
        paintTheImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RedSquares();
            }
        });
    }
}





