import javax.swing.*;

public class Intergraf extends JFrame{

    private JLabel label1;

    public Intergraf(){
        setLayout(null);
        label1=new JLabel("8===============D");
        label1.setBounds(100,20,200,300);
        add(label1);
    }

    public static void main(String args[]){

        Intergraf formulario1= new Intergraf();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
}