import javax.swing.*;
import java.awt.event.*;

public class L74_JList extends JFrame {

    String[] items = {"Items1","Items2","Items3","Items4","Items5","Items6","Items7","Items8","Items9","Items10"};
    JLabel label = new  JLabel();

    public L74_JList() {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JList list = new JList(items);
        list.setVisibleRowCount(5);

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(list)); //used to add scrollbar
        panel.add(label);
        add(panel);
        revalidate();

        list.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                  if (e.getClickCount() == 2){
                    int index =list.getSelectedIndex();
                    String item =(String)list.getSelectedValue();

                    label.setText("Selected item="+item+" and Selected index="+index);
                  }
            }
        });
    }

    public static void main(String[] args) {
        new L74_JList();
    }
    
}
