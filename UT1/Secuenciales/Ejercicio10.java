/*
 * En una asignatura, la nota final se obtiene utilizando los siguientes criterios:
 *   - 30 % de la nota de un primer examen.
 *   - 30 % de la nota de un segundo examen.
 *   - 25 % de un proyecto.
 *   - 15 % de las actividades realizadas en clase.
 *
 * Escribe un programa que solicite las cuatro calificaciones y calcule y muestre la nota final del estudiante
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main() {
        double notaExamen1, notaExamen2, notaProyecto, notaActividades, notaFinal;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen");
        notaExamen1 = teclado.nextDouble();
        System.out.println("Introduce la nota del segundo examen");
        notaExamen2 = teclado.nextDouble();
        System.out.println("Introduce la nota del proyecto");
        notaProyecto = teclado.nextDouble();
        System.out.println("Introduce la nota de las actividades");
        notaActividades = teclado.nextDouble();

        notaFinal = 0.3 * notaExamen1 + 0.3 * notaExamen2 + 0.25 * notaProyecto + 0.15 * notaActividades;

        System.out.println("La nota final es " + notaFinal);
    }
}