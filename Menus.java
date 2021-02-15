import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Menus extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1;
    private JMenuItem item1,item2,item3,item4;
    
    public Menus(){

        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);

        item1 = new JMenuItem("Red");
        item1.addActionListener(this);
        menu1.add(item1);

        item2 = new JMenuItem("Green");
        item2.addActionListener(this);
        menu1.add(item2);

        item3 = new JMenuItem("Blue");
        item3.addActionListener(this);
        menu1.add(item3);

	item4 = new JMenuItem("Yellow");
        item4.addActionListener(this);
        menu1.add(item4);
    }

    public void actionPerformed(ActionEvent e){

        Container fondo = this.getContentPane();

        if(e.getSource()==item1){
            fondo.setBackground(new Color(255,0,0));
        }
        if(e.getSource()==item2){
            fondo.setBackground(new Color(0,255,0));
        }
        if(e.getSource()==item3){
            fondo.setBackground(new Color(0,0,255));
        }
	if(e.getSource()==item4){
            fondo.setBackground(new Color(255,255,0));
        }
    }

    public static void main(String args[]){

        Menus form = new Menus();
        form.setBounds(0,0,400,300);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    }
} 
