public class Proyecto2 {

    public static void main(String args[]){
        int num1=0, num2=1,aux;
        System.out.print(num1+", "+num2);
        while(true){
            
            aux=num2;
            num2=num2+num1;
            num1=aux;
            System.out.print(", "+num2);
            
        }
        
    }
}
