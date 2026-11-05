import java.util.Scanner;
public class EjemploArrays {
	public void main() {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[3];
		
		// Rellenar desde el teclado
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota del alumno " + (i + 1) + ": ");
			notas[i] = teclado.nextDouble();
		}

		// Mostrar
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posición " + i + ": " + notas[i]);
		}
	}
}