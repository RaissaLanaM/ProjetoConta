package com.company;

import javax.swing.*;

public class Teste1 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.numero = 1;
        conta1.cliente = "Emerson Sena";
        conta1.depositar(1000);
        conta1.sacar(200);
        System.out.println("O saldo da conta do Emerson é:" + conta1.verSaldo());
        //tentar sacar um valor maior que o saldo
        conta1.sacar(2000);
        System.out.println("O saldo da conta do Emerson é:" + conta1.verSaldo());
        //tentar depositar um valor negativo
        conta1.depositar(-1000);
    }
}
