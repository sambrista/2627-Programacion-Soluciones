/*
 * ========================================================================
 *  Funciones08
 * ========================================================================
 *  Crea una función que reciba tres números enteros y devuelva su promedio.
 * ========================================================================
 */

public class Funciones08 {
    public void main() {
        int nota1 = 10;
        int nota2 = 8;
        int nota3 = 2;

        System.out.println("El promedio es " + promedio(nota1, nota2, nota3));
    }

    public double promedio(int entero1, int entero2, int entero3) {
        return (entero1 + entero2 + entero3) / 3.0;
    }
}

