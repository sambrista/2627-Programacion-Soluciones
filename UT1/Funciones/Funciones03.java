// Escribe una función que reciba dos números enteros y devuelva el mayor.

public class Funciones03 {
    public void main() {
		// Código para probar que la función funciona
		System.out.println(mayor(2,6));
		System.out.println(mayor(6,2));
    }

	public int mayor(int numeroA, int numeroB) {
		int numeroMayor = numeroA;
		if (numeroB > numeroA){
			numeroMayor = numeroB;
		}
		return numeroMayor;
	}
}