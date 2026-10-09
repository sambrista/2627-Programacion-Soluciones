/* Realiza un programa que calcule y muestre la suma
 de todos los números del 1 al 200.*/

public class For03 {
    public void main() {
        int sumaTotal = 0;
        for (int i = 1; i <= 200; i++) {
            sumaTotal = sumaTotal + i;
        }
        System.out.println("La suma total es " + sumaTotal);
    }
}