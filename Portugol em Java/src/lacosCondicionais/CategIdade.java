package lacosCondicionais;

import java.util.Scanner;

public class CategIdade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		// > 10-14 infantil
		// > 15-17 juvenil
		// > 18-25 adulto
		int idade;
		System.out.print("Digite a idade: ");
		idade = s.nextInt();
		if(idade<=25 && idade >=18)
			System.out.println("Categoria: Adulto");
		else if(idade<=17 && idade >=15)
			System.out.println("Categoria: Juvenil");
		else if(idade<=14 && idade >=10)
			System.out.println("Categoria: Infantil");
		else
			System.out.println("Infelizmente você não se encontra em nenhuma categoria disponível.");
	}

}
