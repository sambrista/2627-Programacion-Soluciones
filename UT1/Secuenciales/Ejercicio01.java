// Haz un programa que pida la edad de una persona en años
// y calcule cuántos días ha vivido aproximadamente,
// suponiendo que todos los años tienen 365 días.

import java.util.Scanner; // Necesario para usar Scanner

public class Ejercicio01 {
    public static void main(String[] args) {
        int edad;
        int dias = 0;
        // Creamos un escáner que lea de la entrada del sistema
        // (el teclado) y lo llamamos "teclado"
        Scanner teclado = new Scanner(System.in);
        edad = 0;

        System.out.println("Introduce tu edad en años");
        edad = teclado.nextInt(); // Leemos el dato como int
        dias = edad * 365;
        System.out.println("Has vivido " + dias + " dias");
    }
}