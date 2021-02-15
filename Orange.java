import java.util.Scanner;

public class Orange {
    public static void main(String args[]){
        String orig,newcad;
        int num,desde,hasta;
        Scanner ent=new Scanner(System.in);

        System.out.print("Cadena: ");
        orig=ent.nextLine();

        num= orig.length();
        System.out.println(num);

        System.out.println(orig.substring(1,4));
    }
}
