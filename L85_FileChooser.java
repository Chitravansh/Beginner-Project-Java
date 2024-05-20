
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class L85_FileChooser implements ActionListener {

    JFileChooser fileChooser;
    
    public L85_FileChooser(){
        JFrame frame = new JFrame("FileChooser ");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton open = new JButton("Open");
        JButton save = new JButton("Save");
        panel.add(open);
        panel.add(save);
        frame.setVisible(true);

        open.addActionListener(this);
        save.addActionListener(this);

        fileChooser =  new JFileChooser("D:\\");
        //used to set the dire tory path to pa particular folder
       // fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        // configured to choose only directory
        fileChooser.setMultiSelectionEnabled(true);

        fileChooser.setAcceptAllFileFilterUsed(false);

        FileNameExtensionFilter filter1 = new FileNameExtensionFilter("only text files(.txt)", "txt");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("only java files(.java)", "java");
        FileNameExtensionFilter filter3 = new FileNameExtensionFilter("only html files(.html)", "html");
        fileChooser.addChoosableFileFilter(filter3);
        fileChooser.addChoosableFileFilter(filter2);
        fileChooser.addChoosableFileFilter(filter1);
    
    }

        public static void main(String[] aregs){
            new L85_FileChooser();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

          //int selectedOption =  fileChooser.showDialog(null, "Open My File");
          if(e.getActionCommand().equalsIgnoreCase("open")){
            int selectedOption =  fileChooser.showOpenDialog(null);
          if(selectedOption==JFileChooser.APPROVE_OPTION){

            File[] files = fileChooser.getSelectedFiles();
            for(int i=0;i<files.length;i++){
                File file = files[i];
                System.out.println("Selected file is : " +file.getAbsolutePath());
            }

            System.out.println("selected file is : "+fileChooser.getSelectedFile().getAbsolutePath());
          }else{
            System.out.println("No Selection the dialog");
          }
        }else{
            int selectedOption = fileChooser.showSaveDialog(null);
            if(selectedOption==JFileChooser.APPROVE_OPTION){
                System.out.println("selected file is : "+fileChooser.getSelectedFile().getAbsolutePath());
              }else{
                System.out.println("No Selection the dialog");
              }
        }


        }
}
