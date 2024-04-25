package model;

import lombok.Setter;
import lombok.Getter;


	public class ContaBancaria {
	    private String cliente;
	    private int num_conta;
	    private float saldo;

	    public ContaBancaria(String cliente, int num_conta, float saldo) {
	        this.cliente = cliente;
	        this.num_conta = num_conta;
	        this.saldo = saldo;
	    }

	    public void depositar(float valor) {
	        saldo += valor;
	        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
	    }

	    public void sacar(float valor) {
	        if (valor > saldo) {
	            System.out.println("Saldo insuficiente para saque de R$ " + valor);
	        } else {
	            saldo -= valor;
	            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
	        }
	    }
	    
	    public String getCliente() {
	        return cliente;
	    }

	    public void setCliente(String cliente) {
	        this.cliente = cliente;
	    }

	    public int getNum_conta() {
	        return num_conta;
	    }

	    public void setNum_conta(int num_conta) {
	        this.num_conta = num_conta;
	    }

	    public float getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(float saldo) {
	        this.saldo = saldo;
	    }
	}
	    
