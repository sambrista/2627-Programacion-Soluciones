/* Dado un cine con 3 filas y 8 asientos por fila, escribe todos los
 posibles asientos: (Fila x asiento i) */

import java.util.Scanner;

public class EjemploForAnidado {
    public void main() {
        int numeroFilas = 3, asientosPorFila = 8;

        for (int i = 1; i <= numeroFilas; i++) {
            // Empezamos la fila
            for (int j = 1; j <= asientosPorFila; j++) {
                System.out.println("Fila " + i + " asiento " + j);
            }
            // Terminamos la fila
        }
        // En lugar de i y j, podemos usar nombres más descriptivos
        for (int numFila = 1; numFila <= numeroFilas; numFila++) {
            // Empezamos la fila
            for (int numAsiento = 1; numAsiento <= asientosPorFila; numAsiento++) {
                System.out.println("Fila " + numFila + " asiento " + numAsiento);
            }
            // Terminamos la fila
        }
    }
}