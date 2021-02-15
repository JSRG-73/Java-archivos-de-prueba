import java.util.Scanner;

public class Proyecto1 {
    
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        String nombre;
        int clave, ant;

        System.out.println("Bienvenido al sistema vacacional de Coca-Cola company!");


        System.out.println("Nombre del trabajador: ");
        nombre = entrada.nextLine();
        
        System.out.println("¿Cuantos años lleva trabajando aqui?");
        ant = entrada.nextInt();

        System.out.println("¿Cuál es la clave de su departamento?");
        clave = entrada.nextInt();

        if (clave==1){
            if (ant==1){
                System.out.println("Al empleado '"+nombre+"' le corresponden 6 días de vacaciones.");
            }
            else if ( ant>1 && ant<7){
                System.out.println("Al empleado '"+nombre+"' le corresponden 14 días de vacaciones.");
            }
            else if (ant > 6){
                System.out.println("Al empleado '"+nombre+"' le corresponden 20 días de vacaciones.");
            }
            else{
                System.out.println("El numero de años tiene que ser mayor a 0 ys er un número entero.");
            }
        }
        else if (clave==2){
            if (ant==1){
                System.out.println("Al empleado '"+nombre+"' le corresponden 7 días de vacaciones.");
            }
            else if ( ant>1 && ant<7){
                System.out.println("Al empleado '"+nombre+"' le corresponden 15 días de vacaciones.");
            }
            else if (ant > 6){
                System.out.println("Al empleado '"+nombre+"' le corresponden 22 días de vacaciones.");
            }
            else{
                System.out.println("El numero de años tiene que ser mayor a 0 y ser un número entero.");
            }
        }
        else if (clave ==3){
            if (ant==1){
                System.out.println("Al empleado '"+nombre+"' le corresponden 10 días de vacaciones.");
            }
            else if ( ant>1 && ant<7){
                System.out.println("Al empleado '"+nombre+"' le corresponden 20 días de vacaciones.");
            }
            else if (ant > 6){
                System.out.println("Al empleado '"+nombre+"' le corresponden 30 días de vacaciones.");
            }
            else{
                System.out.println("El numero de años tiene que ser mayor a 0 y ser un número entero.");
            }
        }
        else{
            System.out.println("Clave invalida");
        }
    }
}
