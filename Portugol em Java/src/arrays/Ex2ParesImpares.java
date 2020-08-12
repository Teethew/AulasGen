package arrays;

import java.util.Scanner;

public class Ex2ParesImpares {
	
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* Faça um programa que receba 6 números inteiros e mostre:
		• Os números pares digitados;
		• A soma dos números pares digitados;
		• Os números ímpares digitados;
		• A quantidade de números ímpares digitados.*/
		int a[] = new int[6];
		int somaPares = 0; int contImpares = 0;
		
		System.out.println("Entre com 6 inteiros");
		leVetorInt(a,6);
		
		System.out.println("\nPares: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.print(a[i]+" ");
				somaPares += a[i];
			}
			else {
				contImpares++;
			}
		}
		System.out.println("\nSoma dos pares: ");
		System.out.println(somaPares);
		System.out.println("\nÍmpares: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println("\nQuantidade de ímpares: ");
		System.out.println(contImpares);
		

	}
	
	public static void leVetorInt(int vetor[], int comprimento) {
		for(int i=0;i<comprimento;i++)
			vetor[i] = s.nextInt();
	}

}
