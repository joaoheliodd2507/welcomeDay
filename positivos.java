import java.util.ArrayList;
import java.util.Scanner; 

public class positivos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Digite números inteiros (digite '0' para finalizari:");

        while (true) {
           int numero= scanner.nextInt();
           if (numero== 0) {
               break;
           }
           numeros.add(numero);
        }
        if (todosPositivos(numeros)) {
            System.out.println("Todos os números são positives.");
        } else { 
            System.out.println("Nem todos os números são positivos.");
        }
    }    
     public static boolean todosPositivos (ArrayList<Integer> numeros) {
        for(int numero : numeros) {
           if (numero <= 0) {            
               return false;
           }
        } 
        return true;
    }
}
