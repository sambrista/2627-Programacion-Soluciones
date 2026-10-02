import java.util.Scanner;

public class Condicionales02AlfonsoSanchez
{
    public static void main()
    {
		float num1, num2, numMenor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        num1 = scanner.nextFloat();

        System.out.print("Número 2: ");
        num2 = scanner.nextFloat();

        if (num1 > num2) {
            numMenor = num2;
        } else {
            numMenor = num1;
        }

        System.out.println("El número menor es: " + numMenor);
        scanner.close();
    }
}