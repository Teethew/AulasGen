package lacosRepeticao;

import java.util.Scanner;

public class SomaFinita {

	public static void main(String[] args) {
		// Crie um programa que leia um número do teclado até que encontre um
		// número igual a zero. No final, mostre a soma dos números
		// digitados.(DO...WHILE)
		Scanner s = new Scanner(System.in);
		double n = 0;
		double soma = 0;
		
		System.out.println("Digite os números que desejar e 0 quando quiser finalizar.");
		do {
			soma += n;
			n = s.nextInt();
		} while(n!=0);
		
		System.out.println("\nEssa soma equivale a "+soma);
	}

}
