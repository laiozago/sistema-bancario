package contas;

public class ContaBancaria {
    // Atributos da conta bancária
    private int numeroConta;
    private String titular;
    private double saldo;

    // Construtor para inicializar a conta bancária
    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos da conta bancária

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    // Método para sacar um valor da conta
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }    
    }

    // Método para transferir um valor para outra conta
    public boolean transferir(double valor, ContaBancaria destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
            return true;
        }
        System.out.println("Saldo insuficiente.");
        return false;
    }
    

    // Método para exibir o saldo da conta
    public void exibirSaldo() {
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }

    // Getters para os atributos da conta
    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }
}
