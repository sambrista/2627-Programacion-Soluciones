/*
 * ========================================================================
 *  Funciones11
 * ========================================================================
 *  Crea una función que reciba dos números enteros y devuelva la suma de
 *  todos los números comprendidos entre ellos (inclusive).
 * ========================================================================
 */

import java.util.Scanner;

public class Funciones11 {
    public void main() {
        int limite = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el límite: ");
        limite = sc.nextInt();
        System.out.println("La suma desde 0 a " + limite + " es " + sumaEnterosEntre(0, limite));
    }

    public int sumaEnterosEntre(int enteroInicio, int enteroFin) {
        int resultado = 0;
        for (int i = enteroInicio; i <= enteroFin; i++) {
            resultado += i;
        }
        return resultado;
    }
}