import java.awt.event.*;
import javax.swing.*;

public class Paska extends JFrame implements ActionListener{

    private JButton boton;
    private JTextField texto;
    private JTextArea area;
    private JScrollPane scroll;
    
    String aux="";

    public Paska(){

        setLayout(null);

        texto = new JTextField();
        texto.setBounds(10,10,200,30);
		
        add(texto);

        boton = new JButton("Agregar");
        boton.setBounds(250,10,100,30);
        add(boton);
        boton.addActionListener(this);

        area = new JTextArea();
		area.setEditable(false);
        scroll = new JScrollPane(area);
        scroll.setBounds(10,50,400,300);
        add(scroll);
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource()==boton){

            aux=aux+texto.getText()+"\n";
            area.setText(aux);
            texto.setText("");
        }
    }

    public static void main(String args[]){

        Paska formulario1 = new Paska();
        formulario1.setBounds(0,0,540,400);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
        formulario1.setVisible(true);

    }
}
