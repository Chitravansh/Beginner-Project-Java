import javax.swing.*;

public class L77_JRootPane extends JFrame{

    public L77_JRootPane(){

          JRootPane rootPane = this.getRootPane();

          JButton button = new JButton("press me");

          JMenuBar menubar = new JMenuBar();
          JMenu file = new JMenu("File");
          file.add("New File");
          file.add("Open File");
          file.add("Save File");
          file.add("Close File");
          menubar.add(file);

          rootPane.getContentPane().add(button);
          rootPane.setJMenuBar(menubar);
    }
    public static void main(String[] args) {
        L77_JRootPane frame = new L77_JRootPane();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
