import java.util.Scanner;
public class Arrays07 {
    void main() {
		Scanner sc = new Scanner (System.in);
		int t = 0;
		
		System.out.println("Introduce tamaño de los arrays: ");
		t = sc.nextInt();
				
		int[] array1 = new int [t];
		int[] array2 = new int [t];
		
		rellenarArrayAleatorio(array1,1,100);
		rellenarArrayAleatorio(array2,1,100);
		
		System.out.println("Array 1: ");
		imprimirArrayEnteros(array1);
		
		System.out.println("Array 2: ");
		imprimirArrayEnteros(array2);
		
		System.out.println("Array Suma: ");
		
		imprimirArrayEnteros(sumarDosArrays(array1,array2));
		
		/*int[] suma = sumarDosArrays(array1,array2);
		imprimirArrayEnteros(suma);*/
		
	}
	
	public int generarAleatorio(int minimo, int maximo) {
        int numero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        return numero;
    }

    public void rellenarArrayAleatorio(int[] array, int minimo, int maximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarAleatorio(minimo, maximo);
        }
    }
	
	 public void imprimirArrayEnteros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
	
	public int[] sumarDosArrays (int [] arrayA, int [] arrayB){
		int [] arraySuma = new int [arrayA.length];
		
		for(int i=0; i<arrayA.length; i++){
			arraySuma[i]=arrayA[i]+arrayB[i];
		}
		return arraySuma;
	}
}