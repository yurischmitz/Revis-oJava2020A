/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.revisaojava;

/**
 *
 * @author yuri.schmitz
 */
public class EX2_B {
    
    /*public static void main(String[] args){

         int[] array = {1,2,3,5};

         int resultado = multiplicar(array);
         
         System.out.println("MULTIPLICAÇÃO: " + resultado);
     }
     
     private static int multiplicar(int[] numeros){
         int resultado = 1;

         for(int i : numeros){
             resultado *= i;
         }
         return resultado;
     }*/
     
     //         ------- OU -------
     
     
     public static void main(String[] args){

         int[] numeros = {1,2,3,5};

         multiplicar(numeros);
         
     }
     
     private static void multiplicar(int[] array){
         float resultado = 1;

         for(int i : array){
             resultado *= i;
         }
         System.out.println("MULTIPLICAÇÃO: " + resultado);

     }
}
