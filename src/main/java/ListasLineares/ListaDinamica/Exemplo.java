/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasLineares.ListaDinamica;

/**
 *
 * @author afcoe
 */
public class Exemplo {
    public static Nodo inicio= null;
    private static void insere(int chave){
        Nodo n= new Nodo();
        n.chave= chave;
        
        if(inicio==null){
            inicio=n;
        }else{
            Nodo aux= inicio;
            while(aux.prox!=null){
                //aux.prox= n;
                aux= aux.prox;
                aux=n;
            }
        }
            
    }
    private static void imprimir(){
        Nodo nd= inicio;
        while(nd.prox!=null){
            System.out.println(nd.chave);
            nd= nd.prox;
        }
        System.out.println(nd.chave);
    }
    public static void main(String[]args){
        insere(1);
        insere(2);
        insere(3);
        insere(4);
        
        imprimir();
    }
    public static int remover(){
        int chave= inicio.chave;
        Nodo aux= inicio.prox;
        inicio.prox= null;
        inicio = aux;
        return chave;
    }
}
