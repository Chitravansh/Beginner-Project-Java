import javax.swing.*;
import java.awt.*;

public class L87_Graphics extends JFrame {

    public L87_Graphics(){
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        MyPanel panel = new MyPanel();
        panel.setBackground(Color.BLACK);
        add(panel);
    }

 

    public static void main(String[] args) {
        //
        new L87_Graphics();
    }

    public class MyPanel extends JPanel{
        @Override
      public void paint (Graphics g){
          super.paint(g);

          g.setColor(Color.white);
          g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
          g.drawString("Hello World",50,50);

          g.drawLine(100,100,200,150);
          g.drawRect(100,200,100,50);
          g.fillRect(450,200,100,50);
          g.drawOval(300,200,100,100);
          g.drawArc(400,400,100,100,0,90);
          g.fillArc(100,400,100,100,0,90);


          int x[] = {100,200,300};
          int y[] = {400,300,400};
          int n = 3;

          g.drawPolygon(x,y,n);

          int xPoints[] = {100,200,300};
          int yPoints[] = {500,450,500};
          int nPoints = 3;

          g.drawPolyline(xPoints,yPoints,nPoints);

          String url = "D:\\programs\\GUI java\\Image\\uid.jpg";

          Image image = new ImageIcon(url).getImage();
          g.drawImage(image,300,50,200,100,null);

          //g.clearRect(0,0,500,500);

          
      }
  }
    
}

