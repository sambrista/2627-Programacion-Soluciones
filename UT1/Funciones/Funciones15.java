/*
 * ========================================================================
 *  Funciones15
 * ========================================================================
 *  Crea una función que reciba una frase y devuelva cuántas vocales
 *  contiene.
 * ========================================================================
 */

public class Funciones15 {

    public int contarVocales(String frase) {
        int contador = 0;
        char letra;

        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if (esVocalMinuscula(convertirAMinuscula(letra))) {
                    contador++;
            }
        }
        return contador;
    }
    public boolean esVocalMinuscula(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
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

    public void main() {
        System.out.println(contarVocales("Hola, ¿qué tal estás?"));
    }
}
