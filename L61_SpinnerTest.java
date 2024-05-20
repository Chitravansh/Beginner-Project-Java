import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener; 

public class L61_SpinnerTest extends JFrame implements ChangeListener{

    String[] arr = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    JSpinner s1,s2,s3;
    SpinnerModel model1,model2,model3;
    JLabel label = new JLabel();

    public L61_SpinnerTest(){

        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);

        String str = String.valueOf(java.time.Year.now());
        int y = Integer.parseInt(str);

        model1 = new SpinnerNumberModel(1,1,31,1 );
        model2 = new SpinnerListModel(arr);
        model3 = new SpinnerNumberModel(y,y-100,y,1);//(value,minimum,maximum,step)

        s1 = new JSpinner(model1);
        s2 = new JSpinner(model2);
        s3 = new JSpinner(model3);

        s1.setBounds(100,20,100,50);
        s2.setBounds(100,100,100,50);
        s3.setBounds(100,200,100,50);

        add(s1);
        add(s2);
        add(s3);

        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);

        label.setBounds(100,300,150,20);
         
        setDOB();
        add(label);

        validate();  
    }
    public static void main(String[] args) {
        new L61_SpinnerTest();
    }

    public void setDOB(){
        int date = (Integer)s1.getValue();
        int year = (Integer)s3.getValue();
        String month = (String)s2.getValue();

        label.setText("DOB is : "+date+"-"+month+"-"+"-"+year);
        validate();
    }

    @Override
    public void stateChanged(ChangeEvent e){
        //reset dob in label
        setDOB();
        
    }
}
