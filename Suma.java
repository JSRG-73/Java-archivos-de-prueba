
//package gradleproject1;


public class Suma {

   
    public static void main(String args[]) {
        
        int operacion = 33;
        int num2=4;
        int num1=8;

        int resultado;
        
        if (operacion ==1){
            resultado=num1+num2;
            System.out.println("Resultado: "+resultado);
        }
        else if (operacion ==2){
            resultado=num1*num2;
            System.out.println("Resultado: "+resultado);
        }
        else if (operacion ==3){
            resultado=num1/num2;
            System.out.println("Resultado: "+resultado);
        }
        else if (operacion ==4){
            resultado=num1-num2;
            System.out.println("Resultado: "+resultado);
        }
        else {
            System.out.println("Opcion invalida");
        }

        
        
    }
    
}
