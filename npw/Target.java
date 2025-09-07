
//super sigma target

package npw;
import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class Target {
    private void paintTheImage() {


        SPainter tyler = new SPainter("Target", 400, 400);
        SCircle dot = new SCircle(100);
        tyler.setColor(Color.RED);

        tyler.paint(dot);

        SCircle rdot = new SCircle(66);
        tyler.setColor(Color.WHITE);

        tyler.paint(rdot);

        SCircle edot = new SCircle(33);
        tyler.setColor(Color.RED);

        tyler.paint(edot);

    }


    public Target(){
        paintTheImage();}
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new Target();
            }
        });
    }








}
