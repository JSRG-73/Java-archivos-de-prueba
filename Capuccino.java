import javax.swing.*;
import java.awt.event.*;

public class Capuccino extends JFrame implements ActionListener{

    private JTextField text1 =new JTextField();
    private JTextArea area1=new JTextArea();
    private JScrollPane pain=new JScrollPane(area1);
    private JButton boton=new JButton("SExo.")

    public Capuccino(){

        setLayout(null);
        text1.setBounds(10,10,200,30);
        add(text1);
        
        pain.setBounds(10,50,400,300);
        add(pain);
    }

    public static void main(String[] args){

        Capuccino cap=new Capuccino();
        cap.setBounds(0,0,540,400);
        cap.setVisible(true);
        cap.setResizable(false);
        cap.setLocationRelativeTo(null);
    }
}