/*
13. Diseña una función que reciba dos números y un carácter (char)
    que represente una operación (+, -, *, /) y devuelva el resultado
    de la operación.
*/
public class Funciones13 {

    public static double calcular(double a, double b, char operacion) {
        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                resultado = a / b;
                break;
            default:
                System.out.println("Operación no válida");
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(calcular(10, 5, '+'));
        System.out.println(calcular(10, 5, '-'));
        System.out.println(calcular(10, 5, '*'));
        System.out.println(calcular(10, 5, '/'));
    }
}
