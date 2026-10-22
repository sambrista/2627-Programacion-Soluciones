/*
  Adivina el número: El programa genera un número aleatorio
  entre 1 y 10, y el usuario debe adivinarlo. El programa
  termina cuando acierta o cuando llega al intento 5.
  Si acierta, muestra el número de intentos hasta acertar y
  lo indica. Si llega a los 5 intentos sin acertar, dice que has perdido...
 
  int numero = (int)(Math.random() * 10) + 1;

*/

import java.util.Scanner;

public class BuclesGenerales04 {
    public static void main() {
        final int NUMERO_INTENTOS = 5;

        int numeroSecreto = (int) (Math.random() * 10) + 1;
        Scanner teclado = new Scanner(System.in);
        int numero = 0, numeroIntentos = 0;

        do {
            numeroIntentos++;
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();
        } while (numero != numeroSecreto && numeroIntentos < NUMERO_INTENTOS)

        if (numero == numeroSecreto) {
            System.out.println("Acertaste tras " + (numeroIntentos) + " intentos");
        } else {
            System.out.println("Has perdido");
        }
    }
}