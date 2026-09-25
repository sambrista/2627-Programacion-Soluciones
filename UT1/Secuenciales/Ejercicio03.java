// Diseña un programa que lea cuatro notas con decimales
// introducidas por el usuario y muestre su media aritmética

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la nota 1");
		nota1 = teclado.nextDouble();
		System.out.println("Introduce la nota 2");
		nota2 = teclado.nextDouble();
		System.out.println("Introduce la nota 3");
		nota3 = teclado.nextDouble();
		System.out.println("Introduce la nota 4");
		nota4 = teclado.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("La nota media es: " + media);
		
    }
}