import javax.swing.*;

public class L53_SimplleTable {
    public static void main(String[] args) {
        
        String[][] data = {
            {"001","Ram","21"},
            {"002","Shyam","20"},
            {"003","Raju","18"}
        };

        String[]  columnNames = {"Roll No", "Name", "Age"};

        JTable table = new JTable(data,columnNames);

        JFrame frame = new JFrame("Table Demo"); 
        frame.add(new JScrollPane(table));

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
