public class fibonacci
{
    public static void main(String[] args) {
    //definimos las variables
    long primerNumero = 0;
    long segundoNumero = 1;
    long tercerNumero = 0;
    //ciclo para recorrer el valor maximo que es 50
    for (int i = 0; i <= 50; i++){
    System.out.println((i+1) + ". " + primerNumero ); //imprime de forma ordenada los numeros
    tercerNumero=primerNumero;
    primerNumero+=segundoNumero;
    segundoNumero=tercerNumero;

    }
        
    }
}