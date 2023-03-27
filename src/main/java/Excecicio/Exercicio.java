/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecicio;

/**
 *
 * @author afcoe
 */
 class No{
        int menor;
        int maior;
        No ant= null;
        No prox= null;
    }
public class Exercicio {
    
    private static No inicio= null;
    public static No mdcEclidiano(int maior, int menor){
        No n = new No();
        n.maior= maior;
        n.menor= menor;
        
        if(inicio==null){
            inicio =n;
        }else{
            No aux = inicio;
            while(aux.prox!=null){
                aux=aux.prox;   
            }
            int resto= aux.maior % aux.menor;
            No novo= null;
            novo.menor=resto;
            novo.maior= aux.menor;
            novo.ant= aux;
            aux.prox= novo;
        }
        return inicio;
    }
    private static void imprime(){
        String msg="";
        No aux= inicio;
        while(aux.prox!=null){
            msg+=" [ "+aux.maior+", "+ aux.menor+" ]";
            aux= aux.prox;
        }
        msg+=" [ "+aux.maior+", "+ aux.menor+" ]";
        System.out.println(msg);
        System.out.println("Mdc: "+aux.menor);
    }     
    public static void main(String []args){
        mdcEclidiano(17154,357);
        imprime();
    }
}
