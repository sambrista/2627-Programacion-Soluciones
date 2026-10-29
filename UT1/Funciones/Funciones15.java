/*
 * funciones15. Crea una función que reciba una frase y devuelva cuántas vocales contiene.
 */
public class Funciones15 {

    public int contarVocales(String frase) {
        int contador = 0;
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            switch (letra) {
                case 'a', 'e', 'i', 'o', 'u',
                     'á', 'é', 'í', 'ó', 'ú', 'ü':
                    contador++;
                    break;
            }
        }
        return contador;
    }

    public void main() {
        System.out.println(contarVocales("Hola, ¿qué tal estás?"));
    }
}
