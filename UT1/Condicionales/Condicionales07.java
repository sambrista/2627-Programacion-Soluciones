/*
   Ordenar tres edades: Realiza un programa que pida la edad de tres personas
   y las muestre ordenadas de mayor a menor. Por ejemplo, si se introducen:
   - 15, 21, 18
   El programa deberá mostrar:
   - 21, 18, 15

*/
import java.util.Scanner;

public class Condicionales07 {
    public static void main(String[] args){
        int edad1, edad2, edad3;
		int mayor, mediano, menor;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la edad de la primera persona");
        edad1 = teclado.nextInt();
        System.out.println("Introduce la edad de la segunda persona");
        edad2 = teclado.nextInt();
        System.out.println("Introduce la edad de la tercera persona");
        edad3 = teclado.nextInt();
        
		if (edad1 > edad2) {
			menor = edad2;
			mayor = edad1;
		} else {
			menor = edad1;
			mayor = edad2;
		}
		
		if (edad3 < menor) {
			mediano = menor;
			menor = edad3;
		} else if (edad3 > mayor) {
			mediano = mayor;
			mayor = edad3;
		} else {
			mediano = edad3;
		}
		System.out.println("El orden es " + mayor + ", " + mediano + ", " + menor + "");
    }
}