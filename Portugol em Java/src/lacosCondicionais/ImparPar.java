package lacosCondicionais;
import java.util.Scanner;
public class ImparPar {

	public static void main(String[] args) {
		// Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("Entre com um número inteiro ");
		n = s.nextInt();
		if(n%2==0)
			System.out.printf("A raiz quadrada de %d é igual a %.3f",n,Math.sqrt(n));
		else
			System.out.printf("%d ao quadrado é igual a %.0f",n,Math.pow(n,2));
	}

}
