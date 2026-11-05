/* 
Programa que pida horas, minutos y segundos, y devuelva el número de segundos correspondientes. 
Cuando se pida cada valor el programa comprobará si el número es mayor que 0, si no lo es vuelve a pedirlo.
Realizar una función para calcular los segundos (que reciba horas, minutos y segundos)
 y otra función que devuelva true si el número que recibe es mayor que 0 y false en caso contrario.
*/

public class Funciones24 {
	
	public int pidePositivo(String mensaje, String mensajeError) {
		int entero;
		boolean esCorrecto;

		do {
			entero = pideEntero(mensaje, mensajeError);
			esCorrecto = esPositivo(entero);
			if (!esCorrecto) {
				System.out.println(mensajeError);
			}
		} while (!esCorrecto);

		return entero;
	}
	
	public int pideEntero(String mensaje, String mensajeError) {
		Scanner sc = new Scanner(System.in);
		int entero = 0;
		boolean esCorrecto = false;

		do {
			System.out.print(mensaje);
			try {
				entero = sc.nextInt();
				esCorrecto = true;
			} catch (InputMismatchException excepcion) {
				System.out.println(mensajeError);
				sc.nextLine();
			}
		} while (!esCorrecto);

		return entero;
	}
	
	public segundosTotales(int horas, int minutos, int segundos) {
		return horas * 3600 + minutos * 60 + segundos;
	}
	
	public boolean esPositivo(int numero) {
		return numero > 0;
	}

	public void main() {
		int horas, minutos, segundos;
		horas = pidePositivo("Introduzca las horas", "Debe introducir un número entero mayor de 0");
		minutos = pidePositivo("Introduzca los minutos", "Debe introducir un número entero mayor de 0");
		segundos = pidePositivo("Introduzca los segundos", "Debe introducir un número entero mayor de 0");
		
		System.out.println("Los segundos totales son: " + segundosTotales(horas, minutos, segundos));
	}
}