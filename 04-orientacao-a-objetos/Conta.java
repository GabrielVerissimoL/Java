public class Conta {
    private double saldo;
    private int id;
    private double chequeEspecial;

    public Conta(double saldo, int id) {
        if (saldo <= 500)
            chequeEspecial = 50;
        else
            chequeEspecial = 0.5 * saldo;

        this.saldo = saldo;
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void depositar(double valor) {
        if (valor <= 0)
            System.out.println("Erro ao depositar: valor inválido.");
        else
            saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo)
            saldo -= valor;
        else if (valor <= saldo + chequeEspecial) {
            double restante = valor - saldo;
            saldo = 0;
            chequeEspecial -= restante;
        } else {
            System.out.println("Erro ao sacar: saldo insuficiente.");
        }
    }

    public void pagarBoleto(double valorParaPagar) {
        if (valorParaPagar <= 0) {
            System.out.println("Valor inválido.");
            return;
        }
        if (valorParaPagar <= saldo) {
            saldo -= valorParaPagar;
        } else if (valorParaPagar <= saldo + chequeEspecial) {
            double restante = valorParaPagar - saldo;
            saldo = 0;
            chequeEspecial -= restante;
        } else {
            System.out.println("Erro ao pagar boleto: saldo insuficiente.");
        }
    }

    // Renomeado de isUsingChequeEspecial — prefixo "is" em Java indica retorno boolean
    public void verificarChequeEspecial() {
        if (saldo == 0 && chequeEspecial > 0)
            System.out.println("Está usando o cheque especial.");
        else
            System.out.println("Não está usando o cheque especial.");
    }
}
