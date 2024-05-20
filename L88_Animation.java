import javax.swing.*;
import java.awt.*;

public class L88_Animation extends JFrame {
    L88_Animation(){
        setSize(800,600);
        setTitle("Graphics Programming");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Animation panel = new Animation(780,560);
        panel.setBackground(Color.BLACK);
        add(panel);
    }

    public class Animation extends JPanel{

        int x = 0;
        int y = 100;
        int width = 100;
        int height = 50;
        int stepsize = 10;
        int max_x,max_y;

        Animation(int w,int h){

            this.max_x = w;
            this.max_y = h;

        }

        @Override
        public void paint(Graphics g){
            super.paint(g);

            g.setColor(Color.WHITE);
            g.fillRect(x,y,100,50);

            if(x+width>max_x || x<0)
                stepsize = -stepsize;

            x = x  + stepsize;

            try{
            Thread.sleep(40);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            repaint();
        }
    }
    
    public static void main(String[] args) {
        new L88_Animation();
    }
        
}

