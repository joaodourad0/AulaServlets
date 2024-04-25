package model;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    //Não consegui utilizar o lombok ao invés dos getters e setters nesse exemplo
    public void calcularNovoSaldo(float taxaRendimento) {
        float novoSaldo = getSaldo() * (1 + taxaRendimento);
        setSaldo(novoSaldo);
        System.out.println("Novo saldo da conta poupança: R$ " + novoSaldo);
    }
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}

