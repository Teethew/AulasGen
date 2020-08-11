package lacosRepeticao;

import java.util.Scanner;

public class MediaMult3 {

	public static void main(String[] args) {
		// Escrever um programa que receba vários números inteiros no teclado. E no
		// final imprimir a média dos números múltiplos de 3. Para sair digitar
		// 0(zero).(DO...WHILE)
		Scanner s = new Scanner(System.in);
		final int k = 3;
		int n = 0;
		float mediaMultk = 0; //para que o resultado da divisão seja correto
		float multk = 0;      //idem
		
		System.out.println("Digite os números que desejar e 0 quando quiser finalizar.");
		do {
			if(n%k == 0) {
				multk++;
				mediaMultk += n;
			}	
			n = s.nextInt();
		} while(n!=0);
		
		mediaMultk /= multk;
		
		System.out.println("\nA média dos números múltiplos de "+k+" que foram inseridos é "+mediaMultk);
	}

}
