// Escribe una función que reciba un número entero y devuelva su cuadrado

public class Funciones04 {
    public void main() {
        // Código para probar que la función funciona
        int numero = 5;
        int numeroCuadrado = alCuadrado(numero);
        System.out.println("El cuadrado de " + numero + " es " + numeroCuadrado);
    }

    public int alCuadrado(int numero) {
        return numero * numero;
    }
}