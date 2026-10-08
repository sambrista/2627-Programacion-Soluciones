/* 
  Media y recuperación: Realiza un programa que pida las
  notas de dos pruebas. Las notas pueden tener decimales. 
  El programa deberá mostrar las dos notas introducidas, 
  calcular su media aritmética e indicar:
  
    - Si la media es 5 o superior → "Asignatura superada".
    - Si la media es menor que 5 → "Debe recuperar".

 */

import java.util.Scanner;

public class Condicionales01 {
    public static void main() {
        double prueba1, prueba2, media;
        media = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la nota de la primera prueba");
        prueba1 = teclado.nextDouble();
        System.out.println("Introduzca la nota de la segunda prueba");
        prueba2 = teclado.nextDouble();

        media = (prueba1 + prueba2) / 2;

        System.out.println("La media es " + media);
        if (media >= 5) {
            System.out.println("Asignatura superada");
        } else {
            System.out.println("Debe recuperar");
        }
    }
}