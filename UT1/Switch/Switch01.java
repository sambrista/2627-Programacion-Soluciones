/*
 * Edades: Haciendo uso de una estructura Switch, programa que pida la nota de un alumno (entre 0 y 10, números enteros), y muestre la calificación asociada en texto, según los siguientes criterios:
 *   - Nota menor que 5 -> Suspenso
 *   - Nota igual a 5 -> Aprobado
 *   - Nota igual a 6 -> Bien
 *   - Nota igual a 7 u 8 -> Notable
 *   - Nota igual a 9 -> Sobresaliente
 *   - Nota igual a 10 -> Matrícula
 *   - Cualquier otro valor -> mensaje de error
 */

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        int nota = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota (0-10): ");
        nota = sc.nextInt();

        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Matrícula");
                break;
            default:
                System.out.println("Error: nota no válida.");
        }
    }
}
