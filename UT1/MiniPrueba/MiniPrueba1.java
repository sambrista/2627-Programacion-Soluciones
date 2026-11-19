public class MiniPrueba1 {
    void main() {
		int []array = {3,8,7,5,9,3};
		desplazarAdelante(array); //Ejercicio 1
		imprimirArrayEnteros(array);
		
	
	}
	
	public void imprimirArrayEnteros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
	
	
}