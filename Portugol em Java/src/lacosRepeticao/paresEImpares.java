package lacosRepeticao;

import java.util.*;

public class paresEImpares {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		int n[] = new int[10];
		int par = 0, impar = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Entre com 10 números inteiros: ");
		
		for(int i=0;i<10;i++) {
			n[i] = s.nextInt();
			if(n[i] % 2 == 0)
				par++;
			else
				impar++;
		}
		System.out.printf("\nDos 10 números, %d são pares e %d são ímpares",par,impar);
		
	}

}
