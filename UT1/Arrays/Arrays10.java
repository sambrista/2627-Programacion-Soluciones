import java.util.Scanner;

public class Arrays10 {
    void main() {
		double media = -1;
		int posicion = -1;
		int[] arrayTrim1 = new int[5];
		int[] arrayTrim2 = new int[5];
		int[] arrayTrim3 = new int[5];
		
		System.out.println ("Introduce notas primer trimestre: ");
		arrayTrim1=pedirValoresArray(arrayTrim1.length,"Introduce nota: ");
		System.out.println ("Introduce notas segundo trimestre: ");
		arrayTrim2=pedirValoresArray(arrayTrim2.length,"Introduce nota: ");
		System.out.println ("Introduce notas tercer trimestre: ");
		arrayTrim3=pedirValoresArray(arrayTrim3.length,"Introduce nota: ");
		
		System.out.println ("Notas primer trimestre: ");
		imprimirArrayEnteros(arrayTrim1);
		System.out.println(" Media: "+calcularMediaArray(arrayTrim1));
		
		System.out.println ("Notas segundo trimestre: ");
		imprimirArrayEnteros(arrayTrim2);
		System.out.println(" Media: "+calcularMediaArray(arrayTrim2));
		
		System.out.println ("Notas tercer trimestre: ");
		imprimirArrayEnteros(arrayTrim3);
		System.out.println(" Media: "+calcularMediaArray(arrayTrim3));
		
		
		do{
			posicion = pedirEntero("Introduce posicion del alumno, para calcular su  media anual: ");
			media = calcularMediaPosicion(arrayTrim1,arrayTrim2,arrayTrim3,posicion);
			if(media==-1){
				System.out.println ("Has introducido un elemento que no está dentro del array, las posiciones validas son 0,1,2,3 y 4");
			}
		}while(media==-1);
		
		
			System.out.println( "La media del alumno "+posicion+" es: "+media);
	}
	
	public int pedirEntero(String msn){
		int valor;
		Scanner sc = new Scanner (System.in);
		System.out.println(msn);
        valor = sc.nextInt();
		return valor;
	}
	
	public int[] pedirValoresArray(int tam, String msn){
		int[] array = new int [tam];
		
		for(int i=0; i<array.length ; i++){
			array[i]=pedirEntero(msn);
		}
		
		return array;
	}
	
	public void imprimirArrayEnteros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
	
	public double calcularMediaArray (int []array){
		double media=0;
		 for (int i = 0; i < array.length; i++) {
			media+=array[i];
		 }
		media=media/array.length;
		return media;
	}
	
	/**
	Calcular la media para una posición dada, entre 3 arrays
	@param array1 : primer array para calcular la media
	@param array2 : segundo array para calcular la media
	@param array3 : tercer array para calcular la media
	@param posicion: posicion del elemento para la cual, la función la media
	@return devuel la media de los 3 arrays para la posicion del elemento pasado como parámetro,
			o si la posición es incorrecta devuelve -1
	*/
	public double calcularMediaPosicion(int[] array1,int[] array2, int[]array3, int posicion){
		double media = 0;
		
		if(posicion>=array1.length){
			media = -1;
		}else{
			media = (array1[posicion]+array2[posicion]+array3[posicion])/3.0;
		}
		return media;
		
	}
}