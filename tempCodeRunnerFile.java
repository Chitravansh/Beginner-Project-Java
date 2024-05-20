import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L83_JViewPort {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Viewport Demo");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("D:\\programs\\GUI java\\Image\\uid.jpg");
        JLabel label = new JLabel(icon);
        JScrollPane scrollPane = new JScrollPane(label);
        
         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);//used to remove horizontal scrollbar
         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);//used to remove vertical scrollbar

        frame.add(scrollPane);
        frame.setVisible(true);



        scrollPane.setViewportBorder(BorderFactory.createLineBorder(Color.RED));
        JViewport viewport = scrollPane.getViewport();
        JButton moveUp = new JButton("Move Up");
        JButton moveDown = new JButton("Move Down");
        JButton moveLeft = new JButton("Move Left");
        JButton moveRight = new JButton("Move Right");

        JPanel panel = new JPanel();
        panel.add(moveUp);
        panel.add(moveDown);
        panel.add(moveLeft);
        panel.add(moveRight);
        frame.add(panel,BorderLayout.NORTH);

        moveUp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x,origin.y+100);
                viewport.setViewPosition(newOrigin);
            }
        });

        moveDown.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x,origin.y-100);
                viewport.setViewPosition(newOrigin);
                
            }
        });

        moveRight.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x-100,origin.y);
                viewport.setViewPosition(newOrigin);
                
            }
        });

        moveLeft.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x+100,origin.y);
                viewport.setViewPosition(newOrigin);
                
            }
        });


    }
    
}
