package model;

public class ContaEspecial extends ContaBancaria {
	private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }
    public void sacar(float valor) {
        if (valor > (getSaldo() + limite)) {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + getSaldo());
        }
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
}