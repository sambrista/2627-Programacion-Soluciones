/*
  Escribe una función que reciba un carácter y determine si es
  una vocal o una consonante, sin importar si es mayúscula o 
  minúscula. Ignora tildes, diéresis y otros modificadores. 
  Usa el tipo de dato char, y la tabla ASCII si lo necesitas.

  Devuelve:
    0 si es vocal
    1 si es consonante
    -1 si no es ni vocal ni consonante.
*/

public class Funciones10 {
	public void main() {
		System.out.println(esVocalOConsonante('?'));
		System.out.println(esVocalOConsonante('a'));
		System.out.println(esVocalOConsonante('z'));
		System.out.println(esVocalOConsonante('A'));
		System.out.println(esVocalOConsonante('Z'));
	
	}
	
	public int esVocalOConsonante(char caracter) {
		int resultado = -1;
		if (esMayuscula(caracter)) { 
			caracter += 32; // Transformar mayúscula a minúscula
		}
		
		if (esMinuscula(caracter)) {
			if (esVocalMinuscula(caracter)) { // es vocal
				resultado = 0;
			} else {
				resultado = 1;
			}
		}
		
		return resultado;
	}
	
	public boolean esMayuscula(char caracter) {
		return caracter >= 'A' && caracter <= 'Z';
	}
	
	public boolean esMinuscula(char caracter) {
		return caracter >= 'a' && caracter <= 'z';
	}
	
	public boolean esVocalMinuscula(char caracter) {
		return caracter == 'a' || caracter == 'e' ||caracter == 'i' || caracter == 'o' || caracter == 'u';
	}
}