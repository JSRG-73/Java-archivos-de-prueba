import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Rgb extends JFrame implements ActionListener{
    
    private JLabel label1,label2,label3;
    private JComboBox combo1,combo2,combo3;
    private JButton boton;

    public Rgb(){

        setLayout(null);

        label1=  new JLabel("Rojo:");
	label1.setBounds(10,10,100,10);
        add(label1);

        combo1 = new JComboBox();
        combo1.setBounds(120,10,50,30);
        for (int i=0;i<256;i++){
            combo1.addItem(String.valueOf(i));
        }
        add(combo1);


        label2=  new JLabel("Verude:");
	label2.setBounds(10,50,100,10);
        add(label2);

        combo2 = new JComboBox();
        combo2.setBounds(120,50,50,30);
        for (int i=0;i<256;i++){
            combo2.addItem(String.valueOf(i));
        }
        add(combo2);


        label3=  new JLabel("Azula:");
	label3.setBounds(10,90,100,10);
        add(label3);

        combo3 = new JComboBox();
        combo3.setBounds(120,90,50,30);
        for (int i=0;i<256;i++){
            combo3.addItem(String.valueOf(i));
        }
        add(combo3);

        boton = new JButton("Fijar color");
        boton.setBounds(10,130,100,30);
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==boton){

            String cad1= combo1.getSelectedItem().toString();
            String cad2= combo2.getSelectedItem().toString();
            String cad3= combo3.getSelectedItem().toString();

            int red=Integer.parseInt(cad1);
            int green=Integer.parseInt(cad2);
            int blue=Integer.parseInt(cad3);

            Color color = new Color(red,green,blue);
            boton.setBackground(color);
        }
    }

    public static void main(String args[]){

        Rgb sad = new Rgb();
        
        sad.setBounds(0,0,190,220);
        sad.setVisible(true);
        sad.setResizable(false);
        sad.setLocationRelativeTo(null);
    }
}
