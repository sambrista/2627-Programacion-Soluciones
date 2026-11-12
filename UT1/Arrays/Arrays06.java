/*
 * ========================================================================
 *  Arrays05
 * ========================================================================
 *  Escribe un programa que genere 50 números enteros aleatorios entre 0 y
 * 99 y los almacene en un array. El programa debe crear un nuevo array con
 * los números primos que haya entre esos 50 números. Luego debe mostrar
 * los dos arrays. Utiliza funciones.
 * ========================================================================
 */

public class Arrays06 {
    void main() {
        int[] numeros = new int[50];
        int[] primos;
        int cantidadPrimos = 0;

        rellenarArrayAleatorio(numeros, 0, 99);
        System.out.println("Array generado: ");
        imprimirArrayEnteros(numeros);

        cantidadPrimos = contarPrimos(numeros);
        primos = new int[cantidadPrimos];

        obtenerPrimos(numeros, primos);
        System.out.println("Array de Primos: ");
        imprimirArrayEnteros(primos);
    }


    public int generarAleatorio(int minimo, int maximo) {
        int numero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        return numero;
    }

    public void rellenarArrayAleatorio(int[] array, int minimo, int maximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarAleatorio(minimo, maximo);
        }
    }

    public void imprimirArrayEnteros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean esPrimo(int numero) {
        boolean siEsPrimo = numero > 1;

        for (int i = 2; i < numero && siEsPrimo; i++) {
            if (numero % i == 0) {
                siEsPrimo = false;
                break;
            }
        }
        return siEsPrimo;
    }

    public int contarPrimos(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                contador++;
            }
        }
        return contador;
    }

    public void obtenerPrimos(int[] arrayOriginal, int[] arrayPrimos) {
        int j = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (esPrimo(arrayOriginal[i])) {
                arrayPrimos[j] = arrayOriginal[i];
                j++;
            }
        }
    }


}