/*
 * Ejercicio 14.
 * Escribe una función que reciba un número entero y muestre su tabla de
 * multiplicar del 1 al 10.
 */
public class Funciones14 {

    public void tablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public void main(String[] args) {
        tablaMultiplicar(5);
    }
}
