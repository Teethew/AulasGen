package lacosCondicionais;
import java.util.Scanner;

public class Maior {

		public static void main(String[] args) {
			Scanner s =  new Scanner(System.in);
			//Faça um programa que receba três inteiros e diga qual deles é o maior.
			int maior;
			int v[] = new int[3];
			System.out.println("Entre com os 3 inteiros");
			for(int i=0;i<3;i++) {
				v[i] = s.nextInt();
			}
			maior = v[0];
			for(int i=0;i<3;i++) {
				if(v[i]>maior)
					maior = v[i];
			}
			System.out.printf("O maior número encontrado no vetor foi %d\n",maior);
		}
}

