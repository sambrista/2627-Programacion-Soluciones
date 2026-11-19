public class MiniPrueba2 {
    void main() {
		int []array = {3,8,7,5,3,3,7};
		int numero = numeroMasRepetido(array);
		System.out.println("El numero más repetido en el array es: "+numero);	
	
	}
	public int numeroMasRepetido(int[] array){
		int cont=0;
		int elementoMasRepetido;
		
		for(int i=0; i<array.length; i++){
			int contTemp =0;
			for(int j=i; j<array.length; j++){
				if (array[i]==array[j]){
					contTemp++;
				}
			}
			if (contTemp>cont){
				cont=contTemp;
				elementoMasRepetido=array[i];
			}
		}
		
		return elementoMasRepetido;
		
	}

	
}	
	