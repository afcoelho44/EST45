/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quickisort;

/**
 *
 * @author afcoe
 */
public class Quicksort {
    
public static void quickSort (int[]lista) {
		
		
		int pivot = lista[lista.length -1];
		int k = 0;
		int quantidadeEsq = 0;
		int quantidadeDir = 0;
		
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]<=pivot) {
				int aux = lista[k];
				lista[k] = lista[i];
				lista[i] = aux;
				k++;
				quantidadeEsq++;
			}	
			else {
				quantidadeDir++;
			}
		}
		quantidadeEsq--;
		System.out.println(quantidadeEsq + " " + quantidadeDir);
		
		Segmento s = new Segmento(quantidadeEsq, quantidadeDir);
		
	}    
}

