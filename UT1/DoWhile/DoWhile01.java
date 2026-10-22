/*
  Realiza un programa que, comenzando desde el número 2, vaya sumando los números
  pares consecutivos (2 + 4 + 6 + 8...) sin que la suma total supere 10.000.

  Al finalizar, mostrará la suma obtenida y cuántos números se han sumado.
*/

public class DoWhile01 {
    public static void main() {
        int contador = 0;
        int sumaTotal = 0;
        do {
            contador++;
            sumaTotal += 2;
        }
        while ((sumatotal + 2) <= 10000);
        System.out.println("La suma total es: " + sumaTotal);
        System.out.println("Se han sumado " + contador + " números");
    }
}