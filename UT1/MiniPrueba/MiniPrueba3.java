public class MiniPrueba2 {
    void main() {
		System.out.println("El numero con mas divisores es: "+numMaxDivisores(8,21));
	}

	public int numMaxDivisores(int n1, int n2){
		int cont1 = 0;
		int cont2 = 0;
		int resultado = n1; 
		
		//cuento divisores del n1
		for(int i = 0; i<n1 ; i++){
			if(n1%i==0){
				cont1++;
			}
		}
		
		//cuento divisores del n2
		for(int i = 1; i<n2 ; i++){
			if(n2%i==0){
				cont2++;
			}
		}
		
		if(cont2>cont1){
			resultado=n2;
		}
		return resultado;
	}
		
		
		

	
}