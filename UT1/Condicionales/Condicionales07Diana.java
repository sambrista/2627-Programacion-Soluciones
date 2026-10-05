/*
   Ordenar tres edades: Realiza un programa que pida la edad de tres personas
   y las muestre ordenadas de mayor a menor. Por ejemplo, si se introducen:
   - 15, 21, 18
   El programa deberá mostrar:
   - 21, 18, 15

*/
import java.util.Scanner;

public class Condicionales07Diana {
    public static void main(String[] args){
        int edad1, edad2, edad3;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la edad de la primera persona");
        edad1 = teclado.nextInt();
        System.out.println("Introduce la edad de la segunda persona");
        edad2 = teclado.nextInt();
        System.out.println("Introduce la edad de la tercera persona");
        edad3 = teclado.nextInt();
        
        if (edad1 < edad2 && edad1 < edad3 && edad2 < edad3 ){
                System.out.println("El orden es " + edad3 + ", " + edad2 + ", " + edad1 + "");
            }
        else if (edad1 < edad2 && edad1 < edad3 && edad3 < edad2){
                System.out.println("El orden es " + edad2 + ", " + edad3 + ", " + edad1 + "");
        }
        else if (edad1 < edad2 && edad1 > edad3 && edad3 < edad2){
                System.out.println("El orden es " + edad2 + ", " + edad1 + ", " + edad3 + "");
            }
        else if (edad1 > edad2 && edad1 < edad3 && edad2 < edad3){
                System.out.println("El orden es " + edad3 + ", " + edad1 + ", " + edad2 + "");
            }
        else if (edad1 > edad2 && edad1 > edad3 && edad2 < edad3){
                System.out.println("El orden es " + edad1 + ", " + edad3 + ", " + edad2 + "");
            }
        else {
                System.out.println("El orden es " + edad1 + ", " + edad2 + ", " + edad3 + "");
            }
    }
}