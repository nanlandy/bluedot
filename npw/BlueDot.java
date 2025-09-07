
/*
*program to paint blue dot in the context of nonrepresentational
* painting world, npw
 */


package npw;
import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

public class BlueDot {
   private void paintTheImage() {


       SPainter tyler = new SPainter("BlueDot", 400, 400);
       SCircle dot = new SCircle(100);
       tyler.setColor(Color.BLUE);

       tyler.paint(dot);

   }


    public BlueDot(){
               paintTheImage();}
           public static void main(String[] args){
               SwingUtilities.invokeLater(new Runnable(){
                   public void run() {
                       new BlueDot();
                   }
               });
           }








}


