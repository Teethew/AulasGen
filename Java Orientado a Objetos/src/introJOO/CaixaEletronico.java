package introJOO;

import java.util.Scanner;

public class CaixaEletronico {
	
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args){
		double quantia; int conta; //variaveis a serem utilizadas no programa principal
		ContaBancaria C1 = new ContaBancaria();
		
		C1.setNome("José Habiloaldo Graça");
		C1.setSaldo(5500.0);
		C1.setConta(10775);
		C1.setAgencia(1800);
		
		System.out.println("Olá senhor "+C1.getNome()+" você está no caixa eletrônico do Banco Tupiniquim!");
		
		while(true) {
			byte opcao;
			System.out.println("\nQual operação deseja realizar?\n\n1.  Depósito\n2.  Saque\n3.  Transferência\n4.  Informações da conta.\nPara sair digite qualquer outro botão.");
			opcao = s.nextByte();
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			switch(opcao) {
				case 1:
					System.out.print("Digite o valor do depósito a ser realizado: ");
					quantia = s.nextDouble();
					C1.deposito(quantia);
					break;
				case 2:
					System.out.print("Digite o valor do saque a ser realizado: ");
					quantia = s.nextDouble();
					C1.saque(quantia);
					break;
				case 3:
					System.out.print("Digite o valor da transferência a ser realizada:");
					quantia = s.nextDouble();
					System.out.println("Digite a conta destino: ");
					conta = s.nextInt();
					C1.transf(quantia,conta);
					break;
				case 4:
					System.out.println();
					C1.printaInfo();
					break;
				default:
					System.out.println("Volte sempre!");
			}
			if(opcao!=1 && opcao!=2 && opcao!=3 && opcao!=4)
				break;
		}
	}
	

}
