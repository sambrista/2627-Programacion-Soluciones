/* Realiza un programa que muestre todas las tablas de multiplicar
   del 0 al 12, desde el 0 hasta el 12. Precede cada tabla con el
   texto “TABLA DEL x”, siendo x el número que corresponda.
*/
public class For05 {
	public void main() {
		
		for (int numero = 0; numero <= 12; numero++) {
			System.out.println("TABLA DEL " + numero);
			for (int i = 0; i < 13; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
			System.out.println("");
        }
	}
}