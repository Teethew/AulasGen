package arrays;
import java.util.Scanner;
public class Ex3MaiorQue10 {
	
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		int m[][] = new int[3][3];
		int mq10 = 0;
		
		System.out.println("Entre com uma matriz 3x3");
		for(int i=0;i<m.length;i++) {
			leVetorInt(m[i],m.length);
			System.out.println();
		}
		
		for(int i=0;i<m.length;i++) {
			for(int j=0;i<m.length;i++) { // OBS: só funciona porque é uma matriz quadrada
				if(m[i][j]>10)
					mq10++;
			}
		}
		
		System.out.println("Essa matriz contém "+mq10+" valor(es) maior(es) que 10.");
		
	}
	
	public static void leVetorInt(int vetor[], int comprimento) {
		for(int i=0;i<comprimento;i++)
			vetor[i] = s.nextInt();
	}

}
