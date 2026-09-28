/* 
  Una cadena de cines necesita un programa para calcular los
  ingresos que obtiene en sus salas. Haz un programa que pida
  el número de filas de la sala, el número de asientos por fila
  y el precio de la entrada, para luego mostrar la cantidad total
  que el cine ingresa cuando se llena dicha sala.

  Se supone que todas las filas tienen el mismo número de asientos.
 */
 
import java.util.Scanner;

public class Ejercicio08 {
    public static void main() {
		
	int numeroFilas, asientosPorFila;
    double precioEntrada, ingresosTotales;
    Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduce el número de filas");
	numeroFilas = teclado.nextInt();

    System.out.println("Introduce el número de asientos por fila");
    asientosPorFila = teclado.nextInt();

    System.out.println("Introduce el precio de la entrada");
    precioEntrada = teclado.nextDouble();

    ingresosTotales = numeroFilas * asientosPorFila * precioEntrada;
    System.out.println("Los ingresos totales son " + ingresosTotales + " €");
    }
}