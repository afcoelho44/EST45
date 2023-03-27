package QuickisortProf;


public class Pilha{
	private Segmento pilha[] = null;
	private int topo = -1;
	
	public Pilha(int tamanho){
		pilha = new Segmento[tamanho];
	}
	
	public void empilha(Segmento seg){
		pilha[++topo] = seg;
	}
	
	public Segmento desempilha(){
		if (!vazia())
			return pilha[topo--];
		return null;
	}
	
	public boolean vazia(){
		return topo < 0;
	}
	
	public int peek(){
		return topo + 1;
	}
	
	
	public boolean existeSegmentoNaEsquerda(int esq, int indicePivot){
		return esq < (indicePivot -1);
	}
	
	public boolean existeSegmentoNaDireita(int dir, int indicePivot){
		return dir > (indicePivot + 1);
	}
	
}
