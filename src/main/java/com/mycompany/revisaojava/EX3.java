/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.revisaojava;

import dao.Conta;

/**
 *
 * @author yuri.schmitz
 */
public class EX3 {
    
    public static void main(String[] args){
        
        System.out.println("ANTES");
        Conta objConta1 = new Conta();    
        //Preenche os atributos da classe
        objConta1.agencia = 123;
        objConta1.conta = 444;
        objConta1.nome = "Juca Bala";
        objConta1.saldo = 2000;
        objConta1.imprimir();
        
        Conta objConta2 = new Conta();    
        //Preenche os atributos da classe
        objConta2.agencia = 900;
        objConta2.conta = 658;
        objConta2.nome = "Pedro Rocha";
        objConta2.saldo = 5000;
        objConta2.imprimir();
        
        double valorTransf = 2000;
        objConta1.transferirValor(objConta2, valorTransf);
        
        //objConta1.imprimir();
        System.out.println("DEPOIS");
        objConta1.imprimir();
        objConta2.imprimir();
        
    
    }
    
}
