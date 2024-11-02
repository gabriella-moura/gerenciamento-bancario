package com.gerenciamento_bancario;

import lombok.Getter;

@Getter
public class ContaBancaria {
    private final String nome;
    private final String sobrenome;
    private final String cpf;
    private double saldo;

    // Construtor
    public ContaBancaria(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("Titular: " + nome + " " + sobrenome);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
