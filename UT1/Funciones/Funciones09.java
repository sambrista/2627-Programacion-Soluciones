// Diseña una función que reciba un número entero y devuelva su valor absoluto

public class Funciones09 {
    public void main() {
        System.out.println(valorAbsoluto(5));
        System.out.println(valorAbsoluto(-5);
    }

    public int valorAbsoluto(int numero) {
        int resultado = numero;
        if (numero < 0) {
            resultado *= -1;
        }
        return resultado;
    }
}

