public class EjemploWhile {
	public void main() {
		double saldo = 1.15;
		
		while (saldo >= 0.10) {
			System.out.println("Mando un SMS");
			saldo -= 0.10;
			System.out.println("Saldo restante: " + saldo);
		}
		System.out.println("No tienes suficiente saldo");
	}
}