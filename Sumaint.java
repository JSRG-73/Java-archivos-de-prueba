import java.util.Scanner;

public class Sumaint{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String name ="";
        int num1,num2,res;
        
        System.out.println("Introduzca el nombre porfi: ");
        name = in.nextLine();

        System.out.println("Primer valor: ");
        num1=in.nextInt();

        System.out.println("Segundo valor: ");
        num2=in.nextInt();

        res=num1+num2;

        System.out.println("Hola "+name+" resultado: "+res);
    }
}