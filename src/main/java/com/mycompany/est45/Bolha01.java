/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.est45;

/**
 *
 * @author afcoe
 */
public class Bolha01 {
    public static boolean compara(int [] vA, int[] vB, int[] vC){
        for(int a = 0;a< vA.length; a++){
            for(int b = 0;b< vB.length; b++){
                if(vA[a]== vB[b]){
                for(int c= 0; c<vC.length; c++){
                    if(vA[a]==vB[b])
                        return false;
                }
            }
        }   
    }
        return true;
    }
    public static void main(String[] args){
        int[] vetorA= {1,2,3,4,5};
        int[] vetorB= {1,2,3,4,3};
        int[] vetorC= {5,4,3,2,1};
        System.out.println(compara(vetorA,vetorB,vetorC));
    }
}
