package QuickisortProf;

public class BuscaDireta {
	
	private int[] lista = null;
	
	public BuscaDireta (int[] lista){
		this.lista = lista;
	}

	public void print() {
		for (int i = 0; i < lista.length; i++)
			System.out.print(lista[i] + " ");
		System.out.println();
	}

	public void ordena() {
		// int[] lista = {1,2,3,4,5,6,7,8,9,10};
		// int[] lista = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		//int[] lista = { 1, 2, 7, 4, 5, 6, 9, 10, 3, 8 };
		//int[] lista = { 5, 1, 4, 3, 2 };

		for (int i = 0; i < lista.length; i++) { 
			int k = i; // -> n
			int aux = lista[i]; // -> 2n

			for (int j = i + 1; j < lista.length; j++) { 
														
				if (lista[j] < aux) { // -> 2
					k = j; // -> 1
					aux = lista[k]; // -> 2
				}
			}

			lista[k] = lista[i]; // -> 3
			lista[i] = aux; // -> 2
		}
	}
}
