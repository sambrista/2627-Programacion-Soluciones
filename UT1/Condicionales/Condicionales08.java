/*
8. Precio de un aparcamiento: Un aparcamiento utiliza las siguientes tarifas:
     Hasta 2 horas → 3 €.
     Más de 2 horas → 3 € más 1,50 € por cada hora adicional.
   Realiza un programa que pida el número de horas que un vehículo ha permanecido
   en el aparcamiento y calcule el precio que debe pagar.

*/
import java.util.Scanner;

public class Condicionales08 {
    public static void main(String[] args){
		int numeroHoras;
		double importe;
        Scanner teclado = new Scanner(System.in);
        
		System.out.println("Introduzca el número de horas: ");
		numeroHoras = teclado.nextInt();
		
		/*if (numeroHoras <= 2) {
			importe = 3;
		} else {
			importe = 3 + (numeroHoras-2) * 1.50;
		}*/
		
		importe = 3;
		
		if (numeroHoras > 2) {
			importe = importe + (numeroHoras-2) * 1.50;
		}
		
		System.out.println("El importe total es de " + importe + " euros");
    }
}