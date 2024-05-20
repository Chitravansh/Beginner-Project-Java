import javax.swing.*;

public class L52_SplitPane extends JFrame {

    public L52_SplitPane(){
        setTitle("JSplitPane Example");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JButton btn1 = new JButton("Left");
        JButton btn2 = new JButton("Right");

        JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        //if VERTICAL_SPLIT is used  then the components will be placed vertically one above another

        splitpane.setTopComponent(btn1);
        splitpane.setBottomComponent(btn2);

        
        splitpane.setDividerSize(10);
        splitpane.setDividerLocation(100);
        splitpane.setOneTouchExpandable(true);
        add(splitpane);

        validate();       
    }

    public static void main(String[] args) {
        new L52_SplitPane();
    }
    

}
