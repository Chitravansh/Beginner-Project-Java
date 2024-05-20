import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
public class L58_PopMenu extends JFrame implements ActionListener {

    JPopupMenu pm;
    JMenuItem m1,m2,m3;


    L58_PopMenu(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        pm = new JPopupMenu();
        m1 = new JMenuItem("Item 1");
        m2 = new JMenuItem("Item 2");
        m3 = new JMenuItem("Item 3");

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);

        pm.add(m1);
        pm.add(m2);
        pm.add(m3);

        add(pm);
        pm.show(this,200,200);

        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON3){

                    int x = e.getX();
                    int y = e.getY();
                   pm.show(L58_PopMenu.this,x,y);

                }
            }

        });

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==m1){
              System.out.println("Item1 is selected");
        } else if(e.getSource()==m2){
              System.out.println("Item2 is selected");
        } else if(e.getSource()==m3){
              System.out.println("Item3 is selected");
        }

    }

    public static void main(String[] args) {

       L58_PopMenu pop = new L58_PopMenu();
        
    }
    
}
