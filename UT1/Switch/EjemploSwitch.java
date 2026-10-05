
import java.util.Scanner;

public class EjemploSwitch {
    public static void main(){
        int dia;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Una semana tiene 7 días, el sábado es el día 6 y el domingo día 7. Qué día quieres reservar (Del 1 al 5 es lunes a viernes, el 6 y 7 es sábado y domingo) ?");
        dia = teclado.nextInt();
        
		switch(dia) {
			case 1:
				System.out.println("Has escogido el lunes");
				break;
			case 2:
				System.out.println("Has escogido el martes");
				break;
			case 3:
				System.out.println("Has escogido el miercoles");
				break;
			case 4:
				System.out.println("Has escogido el jueves");
				break;
			case 5:
				System.out.println("Has escogido el viernes");
				break;
			case 6:
				System.out.println("Has escogido el sabado");
				break;
			case 7:
				System.out.println("Has escogido el domingo");
				break;
			default:
				System.out.println("Ese día no existe");
		}		
    }
}