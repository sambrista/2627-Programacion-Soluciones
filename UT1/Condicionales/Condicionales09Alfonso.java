import java.util.Scanner;

public class Condicionales09Alfonso {
    public static void main() {
        float precioSesion;
        int dia;
        boolean es3D;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día (1-7): ");
        dia = scanner.nextInt();

        System.out.print("Tipo de sesión (normal - 0, 3D - 1): ");
        es3D = scanner.nextInt() == 1;

        precioSesion = 7;  // Precio normal, se cambia al ser 3D

        if (es3D) {
            precioSesion = 10;
        }

        if (dia == 6 || dia == 7) {

            precioSesion += 2; // Equivale a precioSesion = precioSesion + 2;
        }

        System.out.println("El precio de la sesión es de " + precioSesion + " euros.");
        scanner.close();
    }
}