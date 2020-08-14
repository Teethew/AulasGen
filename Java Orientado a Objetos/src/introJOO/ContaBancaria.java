package introJOO;

import java.util.Scanner;

public class ContaBancaria {
	public static Scanner s = new Scanner(System.in);
	
	private String nome;
	private double saldo;
	private int conta;
	private int agencia;
	
	public ContaBancaria(String nome, double saldo, int conta, int agencia) {
		this.nome = nome;
		this.saldo = saldo;
		this.conta = conta;
		this.agencia = agencia;
	}

	public ContaBancaria() {
	}
	
	public boolean deposito(double valor) {
		if(valor<=0) {
			System.out.println("Erro");
			return false;
		}
		else
			this.saldo += valor;
		System.out.printf("Depósito realizado com sucesso.\nSaldo atual: R$%.2f\n",this.saldo);
		return true;
	}
	
	public boolean saque(double valor) {
		if(valor<=0 ) {
			System.out.println("Erro");
			return false;
		}
		else if((saldo-valor)<=0) {
			char opcao;
			System.out.println("Essa operação fará com que você entre no cheque especial. Continuar? (S/N)");
			opcao = s.next().charAt(0);
			if(opcao == 'S' || opcao =='s')
				this.saldo -= valor;
			else
				return false;	
		}
		else
			this.saldo -= valor;
		System.out.printf("Saque realizado com sucesso.\nSaldo atual: R$%.2f\n",this.saldo);
		return true;
	}
	
	public boolean transf(double valor,int conta) {
		if(valor<=0 ) {
			System.out.println("Erro");
			return false;
		}
		else if((saldo-valor)<=0) {
			char opcao;
			System.out.println("Essa operação fará com que você entre no cheque especial. Continuar? (S/N)");
			opcao = s.next().charAt(0);
			if(opcao == 'S' || opcao =='s')
				this.saldo -= valor;
			else
				return false;	
		}
		else
			this.saldo -= valor;
		System.out.printf("Transferência realizada com sucesso.\nSaldo atual: R$%.2f\n",this.saldo);
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void printaInfo() {
		System.out.println("Nome:\t\t"+this.nome);
		System.out.println("Conta:\t\t"+this.conta);
		System.out.println("Agência:\t"+this.agencia);
		System.out.printf("Saldo:\t\t%.2f\n",this.saldo);		
	}
	
	
}
