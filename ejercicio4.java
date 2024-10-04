
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            // Pedir al usuario que ingrese un número
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            
            // Verificar si el numero es primo
            boolean esPrimo = true;
            
            if (numero <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false; 
                        break; 
                    }
                }
            }
            
            // Mostrar resultado sobre si es primo
            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
    
            // Imprimir los números primos entre 1 y 100
            System.out.println("Números primos entre 1 y 100:");
            for (int n = 1; n <= 100; n++) {
                esPrimo = true;
                
                if (n <= 1) {
                    esPrimo = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }
                
                if (esPrimo) {
                    System.out.print(n + " ");
            }
        }
            
        scanner.close();
    }
}