package com.gerenciamento_bancario;

import java.util.Scanner;

public class AplicacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe seu sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("Informe seu CPF:");
        String cpf = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Informe o valor do depósito:");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Informe o valor do saque:");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando a aplicação. Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
