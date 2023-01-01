package com.company;

public class Conta {
    //Atributos
    public int numero;
    public String cliente;
    private double saldo;

    public void depositar(double valor){
        if(valor <=0){
            System.out.println("Valor inválido");
        }else{
            saldo += valor;
        }
    }
    public void sacar(double valor){
        if (valor > saldo){
        System.out.println("Saldo insuficiente para o saque");
        }else{
            saldo -= valor;
        }
    }
    public double verSaldo(){
        return saldo;
    }
}
