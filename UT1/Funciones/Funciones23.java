/*
 * ========================================================================
 *  Funciones23
 * ========================================================================
 *  Realiza un programa organizado en funciones que tenga las siguientes
 *  opciones:
 *    1. Función que recibe dos enteros y devuelve el mayor.
 *    2. Función que recibe 3 números y devuelve el menor.
 *    3. Función que recibe un número decimal y devuelve su parte entera.
 *    4. Función que recibe un número decimal y devuelve su parte decimal.
 *    5. Función que compara dos números, devuelve true si son iguales,
 *       false si no lo son.
 *    6. Función que calcula la potencia (recibe la base y el exponente).
 *    7. Función que recibe un carácter y devuelve true si es una letra
 *       y false si es otro carácter.
 *    8. Calcular menor de 2 letras: Función que recibe 2 letras
 *       y devuelve la menor.
 * ========================================================================
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Funciones23 {

    // 1. Devuelve el mayor de dos enteros
    public int mayor(int a, int b) {
        int resultado = a;
        if (b > a) {
            resultado = b;
        }
        return resultado;
    }

    // 2. Devuelve el menor de tres números
    public double menor(double a, double b, double c) {
        double resultado = a;
        if (b < resultado) {
            resultado = b;
        }
        if (c < resultado) {
            resultado = c;
        }
        return resultado;
    }

    // 3. Devuelve la parte entera de un decimal
    public int parteEntera(double numero) {
        int resultado = (int) numero;
        return resultado;
    }

    // 4. Devuelve la parte decimal
    public double parteDecimal(double numero) {
        double resultado = numero - (int) numero;
        return resultado;
    }

    // 5. Comprueba si dos números son iguales
    public boolean iguales(double a, double b) {
        boolean resultado = false;
        if (a == b) {
            resultado = true;
        }
        return resultado;
    }

    // 6. Calcula la potencia (exponente entero >= 0)
    public double potencia(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    // 7. Comprueba si un carácter es una letra ASCII
    public boolean esLetra(char caracter) {
        boolean resultado = false;
        if ((caracter >= 'a' && caracter <= 'z') ||
            (caracter >= 'A' && caracter <= 'Z')) {
            resultado = true;
        }
        return resultado;
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

    // 8. Devuelve la menor de dos letras, sin distinguir mayúsculas
    public char menorLetra(char a, char b) {
        char resultado;
        if (convertirAMinuscula(a) < convertirAMinuscula(b)) {
            resultado = convertirAMinuscula(a);
        } else {
			resultado = convertirAMinuscula(b);
		}
        return resultado;
    }

    public void imprimeMenu() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║          MENÚ DE FUNCIONES           ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  1. Mayor de dos enteros             ║");
        System.out.println("║  2. Menor de tres números            ║");
        System.out.println("║  3. Parte entera                     ║");
        System.out.println("║  4. Parte decimal                    ║");
        System.out.println("║  5. Comparar dos números             ║");
        System.out.println("║  6. Calcular potencia                ║");
        System.out.println("║  7. Comprobar si es letra            ║");
        System.out.println("║  8. Menor de dos letras              ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  0. Salir                            ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
	
	public void ejecutarOpcionMayorEnteros() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer entero: ");
		int a = sc.nextInt();
		System.out.print("Segundo entero: ");
		int b = sc.nextInt();
		System.out.println("Mayor: " + mayor(a, b));
	}
	
	public void ejecutarOpcionMenorTresNumeros() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer número: ");
		double n1 = sc.nextDouble();
		System.out.print("Segundo número: ");
		double n2 = sc.nextDouble();
		System.out.print("Tercer número: ");
		double n3 = sc.nextDouble();
		System.out.println("Menor: " + menor(n1, n2, n3));	
	}
	
	public void ejecutarOpcionParteEntera() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número decimal: ");
		double num3 = sc.nextDouble();
		System.out.println("Parte entera: " + parteEntera(num3));
	}

	public void ejecutarOpcionParteDecimal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número decimal: ");
        double num4 = sc.nextDouble();
        System.out.println("Parte decimal: " + parteDecimal(num4));
	}
	
	public void ejecutarOpcionNumerosIguales() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer número: ");
		double x = sc.nextDouble();
		System.out.print("Segundo número: ");
		double y = sc.nextDouble();
		System.out.println("¿Son iguales? " + iguales(x, y));
	}

	public void ejecutarOpcionPotencia() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Base: ");
		double base = sc.nextDouble();
		System.out.print("Exponente (>= 0): ");
		int exp = sc.nextInt();
		System.out.println("Potencia: " + potencia(base, exp));
	}

	public void ejecutarOpcionComprobarLetra() {
		Scanner sc = new Scanner(System.in);
	                    System.out.print("Introduce un carácter: ");
                    char letra = sc.next().charAt(0);
                    System.out.println("¿Es letra? " + esLetra(letra));	
	}
	
	public void ejecutarOpcionLetraMenor() {
		Scanner sc = new Scanner(System.in);
		                    System.out.print("Primera letra: ");
                    char l1 = sc.next().charAt(0);
                    System.out.print("Segunda letra: ");
                    char l2 = sc.next().charAt(0);
                    System.out.println("Menor letra: " + menorLetra(l1, l2));
	}
	public int pideEnteroAcotado(String mensaje, String mensajeError, int minimo, int maximo) {
		int entero;
		boolean esCorrecto;

		do {
			entero = pideEntero(mensaje, mensajeError);
			esCorrecto = entero >= minimo && entero <= maximo;
			if (!esCorrecto) {
				System.out.println(mensajeError);
			}
		} while (!esCorrecto);

		return entero;
	}

	public int pideEntero(String mensaje, String mensajeError) {
		Scanner sc = new Scanner(System.in);
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

    public void main() {
        int opcion;

        do {
            imprimeMenu();
			
            opcion = pideEnteroAcotado("  Elige una opción [0-8]: ", "Debe especificar un número entre 0 y 8", 0, 8);

            switch (opcion) {
                case 1:
                    ejecutarOpcionMayorEnteros();
                    break;
                case 2:
					ejecutarOpcionMenorTresNumeros();
                    break;
                case 3:
					ejecutarOpcionParteEntera();
                    break;
                case 4:
					ejecutarOpcionParteDecimal();
                    break;
                case 5:
					ejecutarOpcionNumerosIguales();
                    break;
                case 6:
					ejecutarOpcionPotencia();
                    break;
                case 7:
					ejecutarOpcionComprobarLetra();
                    break;
                case 8:
					ejecutarOpcionLetraMenor();
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);

    }
}
