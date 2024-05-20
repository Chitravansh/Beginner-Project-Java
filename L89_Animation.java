import java.awt.*;

import javax.swing.*;

public class L89_Animation extends JFrame{

    L89_Animation(){
        setSize(800,600);
        setTitle("Graphics Programming");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Animation panel = new Animation(780,560);
        panel.setBackground(Color.BLACK);
        add(panel);
    }


public static void main(String[] args) {
    new L89_Animation().setVisible(true);

   }

   public class Animation extends JPanel{

    int x = 0;
    int y = 0;
    int ballHeight = 50;
    int ballWidth = 50;
    int max_x,max_y;
    int speedX = 10;
    int speedY = 10;
    
      Animation(int w, int h){
        this.max_x = w - ballWidth;
        this.max_y = h - ballHeight;
      }


   public void paint(Graphics g){
    super.paint(g);

    g.setColor(Color.red);
    g.fillOval(x,y,50,50);

    if(x>max_x || x<0)
        speedX = -speedX;
    if(y>max_y || y<0)
        speedY = -speedY;

    x = x+speedX;
    y = y+speedY;

    try{
    Thread.sleep(50);
    }catch(Exception ex) {}

    repaint();
    }
  }
}
