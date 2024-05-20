import javax.swing.*;

public class L51_MyTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbed Pane");
        frame.setLayout(null);
        
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 250, 200);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
        panel1.add(new JLabel("This is my first page"));
        panel2.add(new JLabel("This is my second page"));
        panel3.add(new JLabel("This is my third page"));
        
        tp.add("First",panel1);
        tp.add("second",panel2);
        tp.add("third",panel3);
        
        
        
        frame.add(tp);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}