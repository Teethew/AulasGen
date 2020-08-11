package entradaESaida;
import java.util.Scanner;
public class IdadeAMD2 {
	// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ano, mes, dia;
		System.out.print("Digite sua idade em dias\n");
		dia = s.nextInt();
		ano = dia/365;
		dia -= ano*365;
		mes = dia/30;
		dia -= mes*30;
		System.out.println("\nSua idade é de "+ano+" ano(s) "+ mes+ " mes(es) e "+ dia+" dia(s)");
	}
}
