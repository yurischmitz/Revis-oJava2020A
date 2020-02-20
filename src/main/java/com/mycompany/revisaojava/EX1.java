package com.mycompany.revisaojava;

/**
 * Crie um método que some N números inteiros e apresente o 
 * resultado da soma entre eles
 */
public class EX1 {
    
     public static void main(String[] args){
         //criando um array com vários números
         int[] array = {1,2,3,5,656,4656,32,22};
         //passa o array pro método soma que retorna o resultado
         int resultado = soma(array);
         
         System.out.println("SOMA: " + resultado);
     }
     
     private static int soma(int[] numeros){
         int resultado = 0;
         //FOR convencional
         for(int i = 0; i < numeros.length; i++){
             resultado += numeros[i];
         }
         //zerando a variável
         resultado = 0;
         //FOR para arrays
         for(int i : numeros){
             resultado += i;
         }
         return resultado;
     }
}
