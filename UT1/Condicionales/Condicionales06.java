/* 
  Gastos de envío: Una tienda cobra los siguientes gastos de envío dependiendo del importe de una compra:
  
  - Compra superior a 150 € → envío gratuito.
  - Compra entre 75 € y 150 € → 5 € de gastos de envío.
  - Compra inferior a 75 € → 10 € de gastos de envío.

  Realiza un programa que pida el importe de la compra y muestre los gastos de envío 
  y el importe total que deberá pagar el cliente.

*/
import java.util.Scanner;
public class Condicionales06 {
    public static void main(String[] args) {
		double importe, gastosEnvio;
        Scanner sc = new Scanner(System.in);
		gastosEnvio = 0;
        
		System.out.println("Introduce el importe de la compra:");
        importe = sc.nextDouble();

		// Como a gastosEnvio ya le di el valor 0, el primer if me lo puedo ahorrar
		/* 
		if (importe > 150) {
			gastosEnvio = 0;
		} else if (importe >= 75 && importe <= 150) {
			gastosEnvio = 5;
		} else {
			gastosEnvio = 10;
		}
		*/
		
		if (importe >= 75 && importe <= 150) {
			gastosEnvio = 5;
		} else if (importe < 75) {
			gastosEnvio = 10;
		}
		System.out.println("Los gastos de envío son: " + gastosEnvio);
		System.out.println("El importe total es: " + (importe + gastosEnvio) + " euros");
    }
}