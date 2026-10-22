/*
	Desarrolla un programa en Java que simule un menú de un Gimnasio Virtual. El menú debe repetirse hasta que el usuario elija salir.
	Opciones del menú:
		1. Calcular IMC (Índice de Masa Corporal) y mostrar el Estado de Salud.
			Para este punto tienes que:
			Pedir al usuario su peso (en kg) y altura (en metros).
			Calcular el IMC
			Clasificar al usuario

		2. Calcular calorías perdidas al correr. 
			Para este punto tienes que pedir cúantos kilómetros ha pedido y devolver las calorias, suponiendo que cada kilómetro recorrido quema 60 calorías.
		0. El usuario podrá salir del programa al pulsar el 0.
*/

import java.util.Scanner;

public class BuclesGenerales14 {
    public static void main() {
        int opcion = 0;
        double peso = 0, altura = 0, imc = 0, kilometros = 0;
        String estado = "";
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("GIMNASIO VIRTUAL");
            System.out.println("1. Calcular IMC y Estado de Salud");
            System.out.println("2. Calcular calorías perdidas al correr");
            System.out.println("");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Escoja (0-2):");
            opcion = teclado.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el peso en Kg: ");
                    peso = teclado.nextDouble();
                    System.out.print("Introduzca la altura en metros: ");
                    altura = teclado.nextDouble();
                    imc = peso / (altura * altura);
                    System.out.println("Su IMC es " + imc);
                    if (imc < 18.5) {
                        estado = "bajo peso";
                    } else if (imc < 25) {
                        estado = "normal";
                    } else if (imc < 30) {
                        estado = "sobrepeso";
                    } else {
                        estado = "obesidad";
                    }
                    System.out.println("Su estado de salud es " + estado);
                    break;
                case 2:
                    System.out.print("Introduzca los Km recorridos: ");
                    kilometros = teclado.nextDouble();
                    System.out.println("Las calorías perdidas son " + (kilometros * 60));
                    break;
                case 0:
                    System.out.print("Adios");
                    break;
                default:
                    System.out.println("Debe introducir una opción válida");
            }
            System.out.println("");
        } while (opcion != 0);
    }
}