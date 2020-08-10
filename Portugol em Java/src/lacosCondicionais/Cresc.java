package lacosCondicionais;
import java.util.Scanner;

public class Cresc {

		public static void main(String[] args) {
			Scanner s =  new Scanner(System.in);
			//Faça um programa que entre com três números e coloque em ordem crescente.
			int v[] = new int[3];
			System.out.println("Entre com os 3 inteiros");
			for(int i=0;i<3;i++) {
				v[i] = s.nextInt();
			}
			selectionSort(v,3);
			for(int i=0;i<3;i++) {
				System.out.print(v[i]+" ");
			}
			//Já que o tempo estava sobrando, fui pesquisar alguns conceitos 
			//legais para casos futuros e usei nesse código
		}

		private static void selectionSort(int v[], int n) {
			int i;
			for (i = 0; i < n-1; i++) {
				int indiceMenor = i;
				int j;
				for (j = i+1; j < n; j++) {
					if (v[j] < v[indiceMenor])
					indiceMenor = j;
				}
			int tmp = v[i];
			v[i] = v[indiceMenor];
			v[indiceMenor] = tmp;
			}
		}
}
