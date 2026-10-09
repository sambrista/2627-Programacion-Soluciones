/* Realiza un programa que muestre los números impares del 1 al 25 */

public class For02 {
    public void main() {
        int limite = 25;
        System.out.println("Comprobando paridad");
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("Incrementando 2");
        for (int i = 1; i <= limite; i += 2) {
            System.out.println(i);
        }
    }
}