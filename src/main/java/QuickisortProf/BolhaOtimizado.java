package QuickisortProf;

public class BolhaOtimizado {
	private int[] lista = null;
	
	public BolhaOtimizado (int[] lista){
		this.lista = lista;
	}

	public void print() {
		for (int i = 0; i < lista.length; i++)
			System.out.print(lista[i] + " ");
		System.out.println();
	}

	public void ordena() {
		for (int i = 0; i < lista.length-1; i++) 
			for (int x = 0; x < lista.length-1-i; x++) 
				if (lista[x] > lista[x+1]){ 
					int aux = lista[x]; 
					lista[x] = lista[x+1];
					lista[x+1] = aux; 
				}
	}
}
