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
	
	public void desplazarAdelante (int[] array){
		if(array.length >=1){
				int ultimo = array[array.length-1];
				
				for(int i = array.length-1;i>0;i--){
					array[i]=array[i-1];
				}
				array[0]=ultimo;
		}		
	}
	
	
}