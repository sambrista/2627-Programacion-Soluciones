/*
  Un centro de estadística, está realizando un estudio para encontrar a la persona más alta
  de una población. Para ello se introducirá por teclado la altura (en centímetros) de cada
  persona participante en el estudio, (terminando el programa cuando se introduzca -1 como altura).
  Las personas participantes se identificarán por su nombre (String). Al finalizar el
  programa mostrará el nombre de la persona más alta y su altura, así como el número de
  personas que han participado en el estudio.
 */

import java.util.Scanner;

public class BuclesGenerales11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pedir la altura y el nombre en cada vuelta del bucle
        int altura = 0, cont = 0;
        String nombre = "";
        boolean quiereSalir = false;

        //GUARDAR LA ALTURA Y EL NOMBRE DE LA PERSONA MÁS ALTA
        int alturaMaxima = 0;
        String nombrePersonaMasAlta = "";

        do {

            System.out.println("Ingrese la altura de la persona:");
            altura = sc.nextInt();
            sc.nextLine(); //para evitar guardar el salto de linea la siguiente vez que pida una cadena

            if (altura == -1) { //cuando quiere dejar de introducir datos
                quiereSalir = true;
            } else {
                cont++;
                System.out.println("Ingrese el nombre de la persona:");
                nombre = sc.nextLine();
                if (altura > alturaMaxima) {
                    nombrePersonaMasAlta = nombre;
                    alturaMaxima = altura;
                }
            }
        } while (!quiereSalir);

        System.out.println("El nombre de la persona mas alta:" + nombrePersonaMasAlta);
        System.out.printf("Su altura es: " + alturaMaxima);
        System.out.println("Se han introducido: " + cont + " datos.");

    }
}
