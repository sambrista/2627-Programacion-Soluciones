/* Un conductor quiere conocer el consumo medio de su vehículo.
   Pide los kilómetros recorridos y los litros de combustible consumidos.
   Calcula y muestra cuántos litros consume el vehículo cada 100 km */

import java.util.Scanner; // Necesario para usar Scanner

public class Ejercicio04 {
    public static void main() {
		double kilometros, litros, consumo;
        Scanner teclado = new Scanner(System.in);
		
		consumo = 0;
		
		System.out.println("Introduce los kilómetros recorridos:");
		kilometros = teclado.nextDouble();
		System.out.println("Introduce los litros consumidos:");
		litros = teclado.nextDouble();
		
		consumo = (litros / kilometros) * 100;
		
		System.out.println("El consumo a los 100 kilómetros es de " + consumo + " litros");
    }
}