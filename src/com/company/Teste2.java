package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta contaqualquer = new Conta();

        System.out.println("Digite o numero da conta:");
        contaqualquer.numero = Integer.parseInt(input.nextLine());
        System.out.println("Digite o nome do cliente:");
        contaqualquer.cliente = (input.nextLine());
        System.out.println("Digite o valor do depósito:");
        contaqualquer.depositar(Double.parseDouble(input.nextLine()));
        System.out.println("Digite o valor do saque:");
        contaqualquer.sacar(Double.parseDouble(input.nextLine()));
        System.out.println("Valor da Conta:" + contaqualquer.verSaldo());
    }
}

