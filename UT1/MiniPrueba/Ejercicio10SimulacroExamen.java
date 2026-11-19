import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10SimulacroExamen {
	
    public void main() {
		final int NUM_ALUM = 5;
        int[] notasTrim1 = new int[NUM_ALUM];
        int[] notasTrim2 = new int[NUM_ALUM];
        int[] notasTrim3 = new int[NUM_ALUM];
        int opcion = 0;
        boolean estanNotasRellenas = false;
        do {
            opcion = muestraOpciones();  //Ejercicio 3. Mira esta llamada, para que puedas escribir el método correspondiente
            switch (opcion) {
                case 1:   RELLENAR LOS 3 ARRAYS DE NOTAS DE LOS TRIMESTRES
                   // Ejercicio1. Haz la llamada al método que rellena las notas de los 3 trimestres
                    estanNotasRellenas = rellenaNotasTrimestres(notasTrim1,notasTrim2,notasTrim3);
					
					break;
                case 2: // MEDIA DE UN TRIMESTRE
                    if (estanNotasRellenas) {
                        mediaTrimestre(notasTrim1, notasTrim2, notasTrim3);  //EJERCICIO2. Mira esta llamada para que puedas escribir el método correspondiente
                    } else {
                        System.out.println("\n\b** Debes pulsar antes la opción 1, para rellenar las notas **");
                    }
                    break;
                case 3: // MEDIA DE UN ALUMNO
                    if (estanNotasRellenas) {
                        int indiceAlumno = pideNumero(0, NUM_ALUM-1, "Introduce indice del alumno para calcular su media (entre 0 y 4):", "Error, inténtalo de nuevo.");
                        // EJERCICIO 5: Escribe una línea de código  que muestre por pantalla un mensaje indicando
                        // la media del alumno que se ha pedido en la línea de arriba. Debes usar la llamada al método correspondiente, que ya está escrito.
                        
						double mediaAlumno = calculaMediaAlumno(indiceAlumno,notasTrim1,notasTrim2,notasTrim3);
						System.out.printl("La media del alumno "+indiceAlumno+" es: "+mediaAlumno);
						//System.out.printl("La media del alumno "+indiceAlumno+" es: "+calculaMediaAlumno(indiceAlumno,notasTrim1,notasTrim2,notasTrim3));

                    } else {
                        System.out.println("\n\b** Debes pulsar antes la opción 1, para rellenar las notas **");
                    }
                    break;
                case 0:
                    System.out.println("Has elegido salir, adiós.");
            }
        } while (opcion!=0); // Ejercicio 6: Escribe la condición del while.


    }

    /**
     * Método que muestra por pantalla la media de las notas de un trimestre que el usuario elige
     * @param notasTrim1 Array con las notas del primer trimestre
     * @param notasTrim2 Array con las notas del segundo trimestre
     * @param notasTrim3 Array con las notas del tercer trimestre
     */
    // EJERCICIO 2: Escribe el método para este comentario, ten en cuenta que ya existe un método escrito para calcular
    // la media de un array cualquiera.

	public void mediaTrimestre(int[] notasTrim1, int[] notasTrim2, int[] notasTrim3){
		double media;
		int trimestre = pideNumero(1,3,"Introduce trimestre (1,2,3): ","Trimestre erroneo");
		switch (trimestre){
			case 1: media = calculaMediaArray(notasTrim1);
					break;
			case 2: media = calculaMediaArray(notasTrim2);
					break;
			case 3: media = calculaMediaArray(notasTrim3);
					break;
		}
		System.out.println("La media del trimestre "+trimestre+" es: "+media);
	}




    /**
     * Método que muestra las opciones del menú principal del programa y devuelve la opción elegida por el usuario
     * @return opcion elegida por el usuario entre 0 y 3.
     */
    // EJERCICIO 3: Escribe el método para este comentario, observa la llamada en el main para ayudarte
   
   public int muestraOpciones (){
		System.out.println("---- Menu Principal ----");
		System.out.println("1. Rellenar notas de los trimestres");
		System.out.println("2. Calcular media trimestre");
		System.out.println("3. Calcular media alumno");
		System.out.println("0. Salir");
		
		int opcion = pideNumero(0,3,"Introduce Opcion: ","Opcion incorrecta");
		return opcion;
   }
   
   

    /**
     * Método que rellena los arrays con las notas de los 3 trimestre y devuelve TRUE para controlar que las otras
     * opciones del menú principal no se puedan ejecutar si no están los arrays rellenos.
     * @param trim1 array con las notas del primer trimestre
     * @param trim2 array con las notas del segundo trimestre
     * @param trim3 array con las notas del tercer trimestre
     * @return True cuando se han rellenado
     */
    public boolean rellenaNotasTrimestres(int[] trim1, int[] trim2, int[] trim3) {
        System.out.println("Introduce notas Trimestre 1: ");
        rellenaArray(trim1);  //EJERCICIO 4: Tienes que escribir este método para arreglar este error
        System.out.println("Introduce notas Trimestre 2: ");
        rellenaArray(trim2);  //EJERCICIO 4: Tienes que escribir este método para arreglar este error
        System.out.println("Introduce notas Trimestre 3: ");
        rellenaArray(trim3);   //EJERCICIO 4: Tienes que escribir este método para arreglar este error
        return true;
    }


    /**
     * Método que pide por pantalla los datos de un array cualquiera
     * @param array array que se rellena con los datos pedidos al usuario
     */
     // EJERCICIO 4: ESCRIBE ESTE MÉTODO
	
	public void rellenaArray(int[] array){
		for(int i=0; i<array.length; i++){
			array[i]=pideNumero(1,10,"Introduce nota "+i+": ","Nota incorrecta");
		}
	}
	
	

    /**
     * Método que calcula la media de un array de enteros cualquiera
     * @param array Array sobre el que calcula la media
     * @return la nota media de los valores del array
     */
    public double calculaMediaArray(int[] array) {
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
        }
        media = media / array.length;
        return media;
    }

    /**
     * Método que calcula la nota media de un alumno, dada su posición en los arrays (tiene la misma posición en los 3 arrays de notas)
     * @param posAlum Indice del alumno en los array (cada alumno tiene la misma posición o indice en los 3 arrays de notas)
     * @param array1 Array con las notas del primer trimestre
     * @param array2 Array con las notas del segundo trimestre
     * @param array3 Array con las notas del tercer trimestre
     * @return La nota media del alumno indicado
     */
    public double calculaMediaAlumno(int posAlum, int[] array1, int[] array2, int[] array3) {
        double media = 0;
        media = (double) (array1[posAlum] + array2[posAlum] + array3[posAlum]) / 3;
        return media;
    }

    /**
     * Método que pide un número entero validado y comprendido entre dos valores
     * @param numeroMin Valor mínimo del rango válido
     * @param numeroMax Valor máximo del rango válido
     * @param mensaje Mensaje que se muestra al usuario para pedir el número
     * @param mensajeError Mensaje que se muestra al usuario si introduce un valor fuera del rango válido
     * @return
     */
    public int pideNumero(int numeroMin, int numeroMax, String mensaje, String mensajeError) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean esValido = true;
        do {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                if (numero < numeroMin || numero > numeroMax) {
                    System.out.println(mensajeError);
                    esValido = false;
                } else {
                    esValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(mensajeError);
                esValido = false;
                sc.nextLine();
            }

        } while (!esValido);
        return numero;
    }
}