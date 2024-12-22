package banco;

import java.util.ArrayList;
import java.util.List;

import contas.ContaBancaria;

public class Banco {
    private List<ContaBancaria> contas;

    // Construtor para inicializar a lista de contas
    public Banco() {
        this.contas = new ArrayList<>();
    }

    // Método para adicionar uma conta ao banco
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    // Método para buscar uma conta pelo número
    public ContaBancaria buscarConta(int numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null; // Retorna null se nenhuma conta for encontrada
    }

    // Método para exibir todas as contas
    public void exibirContas() {
        for (ContaBancaria conta : contas) {
            System.out.println("\nTitular: " + conta.getTitular());
            System.out.println("Número da conta: " + conta.getNumeroConta());
            conta.exibirSaldo();
        }
    }
}
