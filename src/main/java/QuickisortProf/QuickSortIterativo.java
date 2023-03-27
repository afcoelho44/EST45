package QuickisortProf;

import java.util.Random;

public class QuickSortIterativo {
	
	private int[] lista = null;
	public String listaSegmentos = "";
	
	public QuickSortIterativo (int[] lista){
		this.lista = lista;
	}
	
	public void print() {
		for (int i = 0; i < lista.length; i++)
			System.out.print(lista[i] + " ");
		System.out.println();
	}

	private void troca(int lista[], int i, int j) {
		int aux = lista[i];
		lista[i] = lista[j];
		lista[j] = aux;
	}

	private int particiona(int lista[], int esq, int dir) {
		int pivotValue = lista[dir];
		int i = (esq - 1);

		for (int j = esq; j <= dir - 1; j++) {
			if (lista[j] <= pivotValue) {
				i++;
				troca(lista, i, j);
			}
		}
		i++;
		troca(lista, i, dir);
		return (i);
	}
	

	public void quickSort(int indiceEsq, int indiceDir) {
		Pilha pilha = new Pilha(indiceDir - (indiceEsq + 1));
		
		pilha.empilha(new Segmento(indiceEsq, indiceDir));

		while (!pilha.vazia()) {
			Segmento seg = pilha.desempilha();

			int indicePivot = particiona(lista, seg.esq, seg.dir);

			if (pilha.existeSegmentoNaEsquerda(seg.esq, indicePivot)) { 
				pilha.empilha(new Segmento(seg.esq, indicePivot - 1));
				listaSegmentos += " " + pilha.peek();
			}

			if (pilha.existeSegmentoNaDireita(seg.dir, indicePivot)){ 
				pilha.empilha(new Segmento(indicePivot+1, seg.dir));
				listaSegmentos += " " + pilha.peek();
			}
		}
	}
}
