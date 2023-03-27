/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.est45;

/**
 *
 * @author afcoe
 */
public class BuscaDireta {
        public static void main (String []args){
            int [] lista = {10,9,8,7,6,5,4,3,2,1};
            
           buscaDireta(lista);
            for(int i= 0;i<lista.length;i++){
                System.out.println(lista[i]);
            }
            
    }     
        public static void buscaDireta(int []lista){
            for(int i= 0;i<lista.length;i++){
                int menor= lista[i];
                int k= i;
                for(int x=i+1; x<lista.length; x++){
                    if(lista[x]<menor){
                        menor= lista[x];
                        k=x;
                    }
                }
                lista[k]= lista[i];
                lista[i]= menor;
            }
        } 
}
    