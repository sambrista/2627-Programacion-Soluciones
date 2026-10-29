import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepciones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Introduce un número: ");
			int numero = sc.nextInt(); // esto puede fallar si escriben texto
			int resultado = 10 / numero;
			System.out.println("El resultado es: " + resultado);
		} catch (InputMismatchException e) {
			System.out.println("Debe introducir un dato correcto");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Operación no permitida");
			System.out.println(e.getMessage());
		}

		System.out.println("El programa sigue funcionando.");
	}
}