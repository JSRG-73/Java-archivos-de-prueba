import javax.swing.*;
import java.awt.event.*;

public class Parsel extends JFrame implements ActionListener{

    private JButton boton;
    private JTextField field1, field2;   
    private JLabel label1,label2,label3;

    public Parsel(){

        setLayout(null);

        label1 = new JLabel("Valor 1: ");
        label1.setBounds(50,5,100,30);
        add(label1);

        label2 = new JLabel("Valor 2: ");
        label2.setBounds(50,35,100,30);
        add(label2);

        label3 = new JLabel("Resultado: ");
        label3.setBounds(120,80,100,30);
        add(label3);

        field1 = new JTextField();
        field1.setBounds(120,10,150,20);
        add(field1);

        field2 = new JTextField();
        field2.setBounds(120,40,150,20);
        add(field2);

        boton = new JButton("Sumar");
        boton.setBounds(10,80,100,30);
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento){

        if (evento.getSource()==boton){

            int var1,var2,res;
            var1=Integer.parseInt(field1.getText());
            var2=Integer.parseInt(field2.getText());
            res=var1+var2;
            label3.setText("Resultado: "+res);
        }
    }
    public static void main(String args[]){

        Parsel formulario1 = new Parsel();
        formulario1.setBounds(0,0,500,400);
        formulario1.setLocationRelativeTo(null);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
    }
}
