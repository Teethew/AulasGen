package lacosRepeticao;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		// idade for =-99. (WHILE)
		Scanner s = new Scanner(System.in);
		int idade, men21 = 0, mai50 = 0;
		
		
		while(true) {
			System.out.println("Entre com a idade: ");
			idade = s.nextInt();
			if(idade == -99)
				break;
			else if(idade<21)
				men21++;
			else if(idade>50)
				mai50++;
		}
		System.out.printf("\nPrograma encerrado.\nNúmero de pessoas com menos de 21: %d\nNúmero de pessoas com mais de 50: %d",men21,mai50);
	}

}
