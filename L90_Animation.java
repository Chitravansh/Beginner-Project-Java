import javax.swing.*;
import java.awt.*;

public class L90_Animation extends JFrame{

    L90_Animation(){

        setSize(800,600);
        setTitle("Graphics Programming");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       Animation panel =new Animation(780,560);
       panel.setBackground(Color.BLACK);
       panel.setLayout(null);
       add(panel);

    }
    public static void main(String[] args){

        new L90_Animation().setVisible(true);

    }

    public class Animation extends JPanel{

        int x;
        int y;
        int fanWidth = 300;
        int fanHeight = 300;
        int centerX;
        int centerY;
        int angle=0;

        Animation(int w, int h){
            this.centerX=w/2;
            this.centerY=h/2;
            this.x = centerX - fanWidth/2;
            this.y = centerY - fanHeight/2;
        }
    
        @Override
    
        public void paint(Graphics g){
            super.paint(g);

            g.setColor(Color.WHITE);
            g.fillArc(x,y,fanWidth,fanHeight,angle,30);
            g.fillArc(x,y,fanWidth,fanHeight,angle + 120,30);
            g.fillArc(x,y,fanWidth,fanHeight,angle + 240,30);
            g.drawRect(centerX-3,centerY,6,2*fanHeight);
            angle = (angle-30)%360;

            //angle = (angle+30)%360;
            try{
                Thread.sleep(50);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

            repaint();
        }
    }
}