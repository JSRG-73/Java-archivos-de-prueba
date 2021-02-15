import javax.swing.*;
import javax.swing.event.*;

public class Radio extends JFrame implements ChangeListener{
    
    private JRadioButton button1,button2,button3;
    private ButtonGroup bg;

    public Radio(){

        setLayout(null);

        bg = new ButtonGroup();

        button1 = new JRadioButton("640*480");
        button1.setBounds(10,20,100,30);
        button1.addChangeListener(this);
        add(button1);
        bg.add(button1);

        button2 = new JRadioButton("800*600");
        button2.setBounds(10,70,100,30);
        button2.addChangeListener(this);
        add(button2);
        bg.add(button2);

        button3 = new JRadioButton("1024*768");
        button3.setBounds(10,120,100,30);
        button3.addChangeListener(this);
        add(button3);
        bg.add(button3);
    }

    public void stateChanged(ChangeEvent event){

        if(button1.isSelected()){
            setSize(640,480);
        }
        if(button2.isSelected()){
            setSize(800,600);
        }
        if(button3.isSelected()){
            setSize(1024,768);
        }
    }

    public static void main(String args[]){

        Radio form1 = new Radio();

        form1.setBounds(0,0,350,23n0);
        form1.setLocationRelativeTo(null);
        form1.setResizable(false);
        form1.setVisible(true);
    }
}
