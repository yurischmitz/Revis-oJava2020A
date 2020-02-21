/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mycompany.revisaojava.EX3;

/**
 *
 * @author yuri.schmitz
 */
public class Conta {
    
    public int agencia;
    public int conta;
    public String nome;
    public double saldo;
    
    public void imprimir(){
        System.out.println("Conta: " + conta + "\nSaldo: " + saldo + "\n----------");
    }
    
    public void transferirValor(Conta contaDestino, double valorTransf){
        
        if(this.saldo < valorTransf){
            System.out.println("SALDO DA CONTA 1 É MENOR QUE O VALOR DA TRANSFERÊNCIA - OPERAÇÃO NÃO REALIZADA");
            System.exit(0);
        }else{
            this.saldo = saldo - valorTransf; 
            contaDestino.saldo += valorTransf;
        }

        
    }
    
}
