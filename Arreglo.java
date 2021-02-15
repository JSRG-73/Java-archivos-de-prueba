import java.util.Scanner;

public class Arreglo {
    public static void main(String args[]){
        int rows,columns;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows=in.nextInt();
        System.out.print("Enter the number of columns: ");
        columns=in.nextInt();
        int arr[][]=new int[rows][columns];
        System.out.println();
        
        for (int j=0;j<columns;j++){
            //System.out.println(j);
            for (int i=0;i<rows;i++){
                System.out.print("Please enter the number of the position |"+j+" | "+i+"|:  ");
                arr[i][j]=in.nextInt();
            }
            System.out.println();
        }

        for (int j=0;j<columns;j++){
            
            for (int i=0;i<rows;i++){
                System.out.print("|"+arr[i][j]);
                
            }
            System.out.println("|");
        }
        
        System.out.print("\n\nYare yare daze");
        
    }
}
