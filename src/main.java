import java.awt.*;
import javax.swing.JFrame;



public class main extends Canvas {


    public static void main(String[]args){
        JFrame frame=new JFrame("My Drawing");
        Canvas canvas=new main();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);



    }
    public void paint(Graphics g){
        //super.paint(g);
        g.fillOval(200,100,200,200);
    }
}
