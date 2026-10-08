/* Crea un programa que solicite el radio de una esfera
 (puede tener decimales) y calcule tanto su perímetro 
 como su volumen.*/

import java.util.Scanner; // Necesario para usar Scanner

public class Ejercicio06 {
    public static void main() {
        float radio, perimetro, volumen, pi;
        Scanner teclado = new Scanner(System.in);
        perimetro = 0;
        volumen = 0;
        pi = 3.1416f;

        System.out.println("Introduce el radio");
        radio = teclado.nextFloat();
        perimetro = 2 * pi * radio;
        volumen = (4 / 3) * pi * radio * radio * radio;
        System.out.println("El perímetro es " + perimetro + " y el volumen es " + volumen);

    }
}