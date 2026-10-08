/*
  5. Acceso a una atracción: En un parque de atracciones existen tres tipos de
  atracciones: infantil, familiar y extrema. Según el tipo de atracción y la 
  edad de la persona, podrá acceder si cumple estos requisitos:

  - Infantil → tener 5 años o más.
  - Familiar → tener 10 años o más.
  - Extrema → tener 16 años o más.

  Realiza un programa que pida el tipo de atracción y la edad de la persona. 
  - Si cumple el requisito, mostrará "Puede acceder". 
  - En caso contrario, mostrará "No puede acceder".
*/

import java.util.Scanner;

public class Condicionales05 {
    public static void main(String[] args) {
        int edad, atraccion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tipo de atraccion (1: infantil, 2: familiar, 3: extrema):");
        atraccion = sc.nextInt();

        System.out.println("Introduce tu edad:");
        edad = sc.nextInt();

        if (atraccion == 1 && edad >= 5) {
            System.out.println("Puede acceder");
        } else if (atraccion == 2 && edad >= 10) {
            System.out.println("Puede acceder");
        } else if (atraccion == 3 && edad >= 16) {
            System.out.println("Puede acceder");
        } else {
            System.out.println("No puede acceder");
        }
    }
}