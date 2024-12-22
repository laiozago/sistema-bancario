package banco;

import contas.ContaBancaria;

public class AppBancario {
    public static void main(String[] args) {
        Banco banco = new Banco();

        //adicionar contas bancarias ao banco
        ContaBancaria conta1 = new ContaBancaria(1, "João", 1000);
        ContaBancaria conta2 = new ContaBancaria(2, "Maria", 2000);
        ContaBancaria conta3 = new ContaBancaria(3, "José", 3000);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);

        //realizar operações bancarias
        conta1.depositar(500);
        conta2.sacar(300);
        conta3.transferir(1000, conta1);

        //exibir todas as contas bancarias e seus saldos
        banco.exibirContas();
    }
}