/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.est45;

/**
 *
 * @author afcoe
 */
public class Bolha {

    public static void main(String[] args) {
        
        System.out.println("Algoritimo da bolha");
        
        int lista[]= {5,4,3,2,1};
        
        for(int i = 0; i< lista.length; i++){
            for(int x= 0; x< lista.length-1; x++){
                if(lista[i]>lista[x]){
                    int aux= lista[i];
                    lista[i]= lista[i+1];
                    lista[i+1]=aux;
                }
            }
            
        }
        
        //Bolha diferente 
        for(int i = 0; i< lista.length; i++){
            for(int x= 0; x< (lista.length-1)-x; x++){
                if(lista[i]>lista[x]){
                    int aux= lista[i];
                    lista[i]= lista[i+1];
                    lista[i+1]=aux;
                }
            }
        }
        
       
    }
}
