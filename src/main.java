import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;



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
        Random rand=new Random();
        int x=200;
        int speed=1;
        int width=10;
        int height=10;
        boolean fallen=true;
        while (true){
            if (fallen){
                while (x>100) {
                    x--;

                    g.fillOval(rand.nextInt(400), rand.nextInt(400), width, height);
                    try {
                        Thread.sleep(speed);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                fallen=false;
            }else {

                while (x < 200) {
                    x++;
                    g.fillOval(rand.nextInt(400), rand.nextInt(400), width, height);
                    try {
                        Thread.sleep(speed);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                fallen=true;
            }

        }

    }
}
