/*
 * ========================================================================
 *  BuclesGenerales10
 * ========================================================================
 *  Una agencia de seguros para automóviles asigna los siguientes costos:
 *      Seguros a todos Riesgo (R):
 *          Menores de 25 años y menos de dos años de carnet: 1500€
 *          Menores de 25 años y más de dos años de carnet: 1200€
 *          Más de 25 años y menos de dos años de carnet: 1200€
 *          Más de 25 años y más de dos años de carnet: 1000€
 *      Seguros a Todo Riesgo con Copago (C):
 *          Menores de 25 años y menos de dos años de carnet: 1100€
 *          Menores de 25 años y más de dos años de carnet: 900€
 *          Más de 25 años y menos de dos años de carnet: 900€
 *          Más de 25 años y más de dos años de carnet: 700€
 *      Seguros a Terceros (T):
 *          Menores de 25 años y menos de dos años de carnet: 70€
 *          Menores de 25 años y más de dos años de carnet: 500€
 *          Más de 25 años y menos de dos años de carnet: 500€
 *          Más de 25 años y más de dos años de carnet: 300€
 *  Escribe un programa en Java que pida la edad de la persona (validada
 *  entre 1 y 130), los años de carnet (validados entre 0 y 100) y el tipo
 *  de seguro que quiere (validado con las opciones: R para todo riesgo, C
 *  para Copago y T para terceros), y muestre un texto informando de sus
 *  datos y el precio que le corresponde. Mientras los 3 datos no sean
 *  válidos el programa no continuará
 * ========================================================================
 */

import java.util.Scanner;

public class BuclesGenerales10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        int aniosCarnet;
        String tipoSeguro;
        String nombreSeguro = "";
        int precio = 0;

        do {
            System.out.print("Introduce tu edad (1-130): ");
            edad = teclado.nextInt();

            if (edad < 1 || edad > 130) {
                System.out.println("Error: la edad debe estar entre 1 y 130.");
            }
        } while (edad < 1 || edad > 130);

        do {
            System.out.print("Introduce los años de carnet (0-100): ");
            aniosCarnet = teclado.nextInt();

            if (aniosCarnet < 0 || aniosCarnet > 100) {
                System.out.println("Error: los años deben estar entre 0 y 100.");
            }
        } while (aniosCarnet < 0 || aniosCarnet > 100);

        do {
            System.out.print("Tipo de seguro (R: todo riesgo, C: copago, T: terceros): ");
            tipoSeguro = teclado.next().toUpperCase();

            if (!tipoSeguro.equals("R")
                    && !tipoSeguro.equals("C")
                    && !tipoSeguro.equals("T")) {
                System.out.println("Error: debes introducir R, C o T.");
            }
        } while (!tipoSeguro.equals("R")
                && !tipoSeguro.equals("C")
                && !tipoSeguro.equals("T"));

        // Los tres datos ya son válidos.
        switch (tipoSeguro) {
            case "R":
                nombreSeguro = "Todo riesgo";

                if (edad < 25 && aniosCarnet < 2) {
                    precio = 1500;
                } else if (edad < 25 || aniosCarnet < 2) {
                    precio = 1200;
                } else {
                    precio = 1000;
                }
                break;

            case "C":
                nombreSeguro = "Todo riesgo con copago";

                if (edad < 25 && aniosCarnet < 2) {
                    precio = 1100;
                } else if (edad < 25 || aniosCarnet < 2) {
                    precio = 900;
                } else {
                    precio = 700;
                }
                break;

            case "T":
                nombreSeguro = "Terceros";

                if (edad < 25 && aniosCarnet < 2) {
                    precio = 70;
                } else if (edad < 25 || aniosCarnet < 2) {
                    precio = 500;
                } else {
                    precio = 300;
                }
                break;
        }

        System.out.println("\nDATOS DEL SEGURO");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Años de carnet: " + aniosCarnet);
        System.out.println("Tipo de seguro: " + nombreSeguro);
        System.out.println("Precio: " + precio + " €");

        teclado.close();
    }
}