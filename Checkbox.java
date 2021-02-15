import javax.swing.*;
import javax.swing.event.*;

public class Checkbox extends JFrame implements ChangeListener {
    
    private JCheckBox check1,check2,check3;

    public Checkbox(){

        setLayout(null);

        check1 = new JCheckBox("Inglés");
        check1.setBounds(10,10,150,30);
        add(check1);
        check1.addChangeListener(this);

        check2 = new JCheckBox("Francés");
        check2.setBounds(10,50,150,30);
        add(check2);
        check2.addChangeListener(this);

        check3 = new JCheckBox("Español");
        check3.setBounds(10,90,150,30);
        add(check3);
        check3.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent e){

        String  cad="";

        if(check1.isSelected()){
            cad+="Ingles";
        }

        if(check2.isSelected()){
            cad+=" Frances";
        }

        if(check3.isSelected()){
            cad+=" Espanol";
        }

        setTitle(cad);
    }

    public static void main(String args[]){

        Checkbox form1 = new Checkbox();

        form1.setBounds(0,0,350,200);
        form1.setLocationRelativeTo(null);
        form1.setResizable(false);
        form1.setVisible(true);
    }
}
