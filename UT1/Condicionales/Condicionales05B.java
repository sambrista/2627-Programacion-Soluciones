import java.util.Scanner;
public class Condicionales05B {
    public static void main(String[] args) {
		int edad, atraccion;
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Introduce el tipo de atraccion (1: infantil, 2: familiar, 3: extrema):");
        atraccion = sc.nextInt();

        System.out.println("Introduce tu edad:");
        edad = sc.nextInt();

        if ( (atraccion == 1 && edad >= 5)   ||
             (atraccion == 2 && edad >= 10)  ||
			 (atraccion == 3 && edad >= 16)
			) {
            System.out.println("Puede acceder");
			} else {
            System.out.println("No puede acceder");
        }
    }
}