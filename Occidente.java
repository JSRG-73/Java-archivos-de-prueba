import javax.swing.*;

public class Occidente extends JFrame{
    
    private JTextField text1;
    private JTextArea area1;

    public Occidente(){

        setLayout(null);
        text1=new JTextField();
        text1.setBounds(10,10,200,30);
        add(text1);

        area1=new JTextArea();
        area1.setBounds(10,50,400,30);
        add(area1);
    } 

    public static void main(String args[]){

        Occidente form1=new Occidente();
        form1.setBounds(0,0,540,400);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setLocationRelativeTo(null);
    }

}