/*
 * funciones16. Diseña una función que reciba una cadena y devuelva true si es un
 * palíndromo y false si no lo es.
 */
public class Funciones16 {

    public boolean esPalindromo(String cadena) {
        boolean palindromo = true;
        char caracterIzquierda;
        char caracterDerecha;

        for (int i = 0; i < cadena.length() / 2; i++) {
            //añadir el control de mayúscula o minúscula con los métodos anteriores.
            caracterIzquierda = convertirAMinuscula(cadena.charAt(i));
            caracterDerecha = convertirAMinuscula(cadena.charAt(cadena.length() - 1 - i));
            if (caracterIzquierda != caracterDerecha) {
                palindromo = false;
            }
        }
        return palindromo;
    }

    public char convertirAMinuscula(char caracter) {
        char resultado = caracter;
        if (esMayuscula(resultado)) {
            resultado += 32; // Transformar mayúscula a minúscula
        }
        return resultado;
    }

    public boolean esMayuscula(char caracter) {
        return caracter >= 'A' && caracter <= 'Z';
    }

    public void main(String[] args) {
        System.out.println(esPalindromo("anita lava la tina")); // false si contamos espacios, true si no.
        System.out.println(esPalindromo("reconocer"));
        System.out.println(esPalindromo("Radar")); // false si no se tratan las mayúsculas
        System.out.println(esPalindromo("acurruca"));
        System.out.println(esPalindromo("hola"));
    }
}
