/*
 * ========================================================================
 *  Arrays05
 * ========================================================================
 *  Crea un array de números cuyo tamaño se indique por teclado.
 *  Rellena el array con números aleatorios entre 0 y 9 y muestra el valor
 *  de cada posición y la suma de todos los valores.
 *
 *  Utiliza un método para rellenar el array que reciba los límites de
 *  los números a generar, un método para mostrar el contenido,
 *  una función que devuelva la suma de los valores del array,
 *  y un método privado para generar un número aleatorio reutilizable.
 * ========================================================================
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Arrays05 {
    private final Scanner sc = new Scanner(System.in);

    public void main() {
        int tamano = pidePositivo(
                "Introduce el tamaño del array: ",
                "Debes introducir un entero mayor que 0");

        int[] numeros = new int[tamano];

        rellenarArrayAleatorio(numeros, 0, 9);
        imprimirArrayEnteros(numeros);

        System.out.println("La suma de todos los valores es: " + sumarValoresArray(numeros));
    }

    // Rellena el array con números entre mínimo y máximo, ambos incluidos.
    public void rellenarArrayAleatorio(int[] array, int minimo, int maximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarAleatorio(minimo, maximo);
        }
    }

    // El +1 permite que también se genere el límite superior.
    // Se utiliza con límites ordenados y rangos pequeños, como 0 y 9.
    public int generarAleatorio(int minimo, int maximo) {
        int numero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        return numero;
    }

    // Reutilizamos la función de impresión, añadiendo el índice.
    public void imprimirArrayEnteros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + array[i]);
        }
    }

    public long sumarValoresArray(int[] array) {
        long suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    public int pidePositivo(String mensaje, String mensajeError) {
        int entero;
        boolean esCorrecto;

        do {
            entero = pideEntero(mensaje, mensajeError);
            esCorrecto = esPositivo(entero);
            if (!esCorrecto) {
                System.out.println(mensajeError);
            }
        } while (!esCorrecto);

        return entero;
    }

    // Reutilizada de Arrays01 y Arrays02.
    public boolean esPositivo(int numero) {
        return numero > 0;
    }

    public int pideEntero(String mensaje, String mensajeError) {
        int entero = 0;
        boolean esCorrecto = false;

        do {
            System.out.print(mensaje);
            try {
                entero = sc.nextInt();
                esCorrecto = true;
            } catch (InputMismatchException excepcion) {
                System.out.println(mensajeError);
                sc.nextLine();
            }
        } while (!esCorrecto);

        return entero;
    }
}